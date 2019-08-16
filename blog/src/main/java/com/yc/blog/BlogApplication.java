package com.yc.blog;

import java.util.Date;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @SpringBootApplication 是复合注解
 *  @SpringBootConfiguration
 *  	@Configuration 纯注解配置方案的注解
 *  @ComponentScan
 *  	组件扫描注解，扫描当前类所在包下所有的组件
 *  @EnableAutoConfiguration 
 *  	启用SpringBoot自动配置功能
 * 
 *
 */


@SpringBootApplication
@Controller
@MapperScan("com.yc")
public class BlogApplication {

	public static void main(String[] args) {
		SpringApplication.run(BlogApplication.class, args);
	}

	@GetMapping("hello")
	public String hello() {
		return "hello";
	}
	
	@Bean
	public Date getNow() {
		return new Date();
	}
	
	
}
