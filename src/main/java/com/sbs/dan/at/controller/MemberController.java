package com.sbs.dan.at.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MemberController {

	@RequestMapping("/member/join")
	public String showJoin() {
		return "/member/join";
	}
	
	@RequestMapping("/member/doJoin")
	public String doJoin() {
		
		return "";
	}
	
	@RequestMapping("/member/login")
	public String login() {
		return "/member/login";
	}
	
	@RequestMapping("/member/doLogin")
	public String doLogin() {
		return "";
	}
}