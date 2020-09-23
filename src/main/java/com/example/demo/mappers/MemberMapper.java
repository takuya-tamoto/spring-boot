package com.example.demo.mappers;


import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.demo.domain.Member;

@Mapper
public interface MemberMapper {
	List<Member> all();
	List<Member> findByNameLike(String words);
	void add(Member member);
}
