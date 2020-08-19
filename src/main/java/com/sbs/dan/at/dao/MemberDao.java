package com.sbs.dan.at.dao;

import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.sbs.dan.at.dto.Member;

@Mapper
public interface MemberDao {

	Member getMemberByLoginId(Map<String, Object> param);

	void doJoin(Map<String, Object> param);
}