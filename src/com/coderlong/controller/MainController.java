package com.coderlong.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	//显示论坛的主页
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	// 显示内容的主页
	@RequestMapping("/main")
	public String mainPage(HttpServletRequest request){
		
		return "mainPage";
	}
	 // 显示用户登录页面
    @RequestMapping("/userLogin")
    public String userLogin() {
        return "user/userLogin";
    }
    
    // 显示注册页面
    @RequestMapping("userRegister")
    public String userRegister(){
    	return "user/userRegister";
    }
    
    
    
    
    
    
	
	
	
}
