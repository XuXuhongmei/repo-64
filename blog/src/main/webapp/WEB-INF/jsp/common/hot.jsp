<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>   
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>   


	 <div class="widget widget_hot">
    
      <h3>热门文章</h3>
      <ul>
      <c:forEach items="${hList }" var="h">
        <li><a href="article?id=${h.id }"><span class="thumbnail">
        	<img class="thumb" data-original="images/excerpt.jpg" src="images/excerpt.jpg" alt="">
        </span>
        <span class="text">${h.title }</span>
        <span class="muted"><i class="glyphicon glyphicon-time"></i> 
        	<fmt:formatDate value="${h.createtime }"
	          	  		pattern="yyyy-MM-dd HH:mm:ss"/>
        </span><br>
        <span class="muted"><i class="glyphicon glyphicon-eye-open"></i> 
        	${h.readcnt }
        </span></a></li>
 </c:forEach>
      </ul>
    </div>
    
