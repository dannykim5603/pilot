package com.sbs.dan.at.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sbs.dan.at.service.MemberService;

@Controller
public class MemberController {
	@Autowired
	private MemberService memberService;

	@RequestMapping("/member/join")
	public String showJoin() {
		return "/member/join";
	}

	@RequestMapping("/member/doJoin")
	public String doJoin(@RequestParam Map<String, Object> param, Model model) {
		System.out.println("loginId : " + param.get("loginId"));
		System.out.println("loginPw : " + param.get("loginPwReal"));
//		boolean check = memberService.checkIsJoinableId(param); //가능하면 true 이미 있는 아이디면 false
		System.out.println(param);
		int newMemberId = memberService.doJoin(param);
		return "redirect:/home/main";
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