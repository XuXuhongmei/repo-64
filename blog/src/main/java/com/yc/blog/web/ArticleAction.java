package com.yc.blog.web;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttribute;
import org.springframework.web.multipart.MultipartFile;

import com.github.pagehelper.PageHelper;
import com.yc.blog.bean.Article;
import com.yc.blog.bean.Category;
import com.yc.blog.bean.User;
import com.yc.blog.biz.ArticleBiz;
import com.yc.blog.biz.CategoryBiz;

@Controller
public class ArticleAction {

	@Resource
	private ArticleBiz abiz;
	
	@Resource
	private CategoryBiz cbiz;
	 
	
	@ModelAttribute("cList")
	public List<Category> init(){
		return cbiz.queryAll();
	}
	
	
	//查询首页
	@GetMapping("index")
	public String index(@RequestParam(defaultValue = "1")int page,Model model) {
		//最新文章
		model.addAttribute("aList", abiz.queryNewArticle(page));
		//最热文章
		model.addAttribute("hList", abiz.queryHotArticle(1));
		return "index";
	}
	
	//分类文章
	@GetMapping("category")
	public String category(@RequestParam(defaultValue = "1")int page,int id,Model model) {
		model.addAttribute("aList", abiz.queryByCategory(id,page));
		model.addAttribute("hList", abiz.queryHotArticle(1));
		return "category";
	}
	
	
	//显示文章
	@GetMapping("article")
	public String article(@RequestParam(defaultValue = "1")int page,int id,Model model) {
		Article a =abiz.read(id);
		
		//调用获取评论的方法，触发分页查询
		
		PageHelper.startPage(page, 5);
		a.getComments();
		
		//查相关文章
		List<Article> relaList = abiz.queryRela(a.getCategoryid());
		model.addAttribute("relaList", relaList);
		model.addAttribute("hList", abiz.queryHotArticle(1));
		//不设定属性名程，则使用小写开头的类名
		model.addAttribute(a);
		return "article";
	}
	

	
	@GetMapping("toedit")
	public String toedit(Model model) {
	model.addAttribute("article", new Article());
	model.addAttribute("hList", abiz.queryHotArticle(1));
		return "articleEdit";
	}
	
	
	@PostMapping("saveArticle")
	public String save(Article article,Model model,
			@SessionAttribute("loginedUser")User user) {
		article.setAuthor(user.getName());
		article.setCreatetime(new Date());
		abiz.save(article);
		return article(1, article.getId(), model);
	}
	
	
	//图片上传
	@PostMapping("upload")
	@ResponseBody
	public String upload(
			@RequestParam("upload") MultipartFile file,
			String CKEditorFuncNum) throws IllegalStateException, IOException {
		
		String fname = file.getOriginalFilename();
		File dest = new File("d:/blog/upload/"+fname);
		file.transferTo(dest);
		
		//拼接 并返回js代码
		String js =  "<script type=\"text/javascript\">";
        js += "window.parent.CKEDITOR.tools.callFunction(" + CKEditorFuncNum
                + ",'upload/"+fname+"','')";
        js +="</script>";
		
		
		return js;
	}
	
	
}






















