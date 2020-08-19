package com.sbs.dan.at.service;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sbs.dan.at.dao.MemberDao;
import com.sbs.dan.at.dto.Member;

@Service
public class MemberService {
	@Autowired
	private MemberDao memberDao;

	public int doJoin(Map<String, Object> param) {
		memberDao.doJoin(param);

		int id = Integer.parseInt((String) param.get("id"));
		System.out.println("==== id ====" + id);
		return id;
	}

	public String doLogin() {
		return "";
	}

	public boolean checkIsJoinableId(Map<String, Object> param) {
		Member member = memberDao.getMemberByLoginId(param);

		if (member == null) {
			return true;
		}
		return false;
	}
}