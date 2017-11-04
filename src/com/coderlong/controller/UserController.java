package com.coderlong.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.coderlong.po.User;

@Controller
@RequestMapping("/user")
public class UserController {
	
	@RequestMapping(value="/userLogin",method=RequestMethod.POST)
	public String userLogin(String userName,HttpServletRequest request){
		
		if (userName.equals("aaa")){
			request.getSession().setAttribute("username", userName);
			
			
			
			
			
			return "redirect:/main.action";
		}
		return "index";
		
	}
	
	@RequestMapping("/userRegister")
	public String userRegister(){
		
		return "index";
	}
	@RequestMapping(value = "/loginOut")
	  public String loginOut(HttpServletRequest request) {
        request.getSession().removeAttribute("username");
        return "index";
    }
	
}
