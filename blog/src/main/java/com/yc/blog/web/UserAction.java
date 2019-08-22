package com.yc.blog.web;

import javax.annotation.Resource;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;

import com.yc.blog.bean.User;
import com.yc.blog.biz.BizException;
import com.yc.blog.biz.UserBiz;
import com.yc.blog.vo.Result;

@RestController
@SessionAttributes("loginedUser")
public class UserAction {

	@Resource
	private UserBiz ud;
	
	@PostMapping("login")
	public Result login(String name,String password,Model model) {
		
		
		try {
			User user  = ud.login(name,password);
			model.addAttribute("loginedUser",user);
			System.out.println("=========="+user);
			return new Result(1,"OK",user);
		} catch (BizException e) {
			 
			return new Result(0,e.getMessage());
		}catch (RuntimeException e) {
			e.printStackTrace();
			//掩盖错误
			return new Result(0,"业务繁忙，请稍后再试");
		}
	}
}
