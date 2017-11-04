package com.coderlong.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
	
	//��ʾ��̳����ҳ
	@RequestMapping("/")
	public String index(){
		return "index";
	}
	
	// ��ʾ���ݵ���ҳ
	@RequestMapping("/main")
	public String mainPage(HttpServletRequest request){
		
		return "mainPage";
	}
	 // ��ʾ�û���¼ҳ��
    @RequestMapping("/userLogin")
    public String userLogin() {
        return "user/userLogin";
    }
    
    // ��ʾע��ҳ��
    @RequestMapping("userRegister")
    public String userRegister(){
    	return "user/userRegister";
    }
    
    
    
    
    
    
	
	
	
}
