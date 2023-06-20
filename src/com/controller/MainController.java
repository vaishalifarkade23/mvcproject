package com.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;





@Controller
public class MainController 
{
	@RequestMapping("/view")
	public String handlerMethod()
	{
		System.out.println("this is url");
		return "Login";
	}
	
	@RequestMapping("/signup" )
	public String registerMethod()
	{
		System.out.println("this is url11");
		return "Registeration";
	}
	
//	@RequestMapping(value="dologin" ,method=RequestMethod.POST)
//	public String doLogin(@ModelAttribute ("log") LoginModel log,HttpSession session)
//	{
//		List<RegistrationModel> list =regservice.doLogin(log);
//		if(list == null)
//		{
//			return "LoginForm";
//		}
//		else
//		{
//			session.setAttribute("sesuser", log.getEmail());
//			//return "dashboard";
//			return "redirect:/getdetails";
//		}
//	}
	
//	@RequestMapping(value="dologin",method=RequestMethod.POST)
//	public String doLogin(@ModelAttribute ("log") LoginModel lm,HttpSession session)
//	{
//		List<LoginModel> list=
//	}


}
