package com.burpup.demo.model.dao;

import java.util.List;

import com.burpup.demo.model.dto.User;

public interface UserDao {
	//회원 전부 조회
	List<User> selectAll();
	
	//회원 한 명 조회
	User selectOne(int id);
	
	//회원 추가
	int insertUser(User user);
	
	//회원 정보 수정
	int modifyUser(User user);
	
	//회원 삭제
	int deleteUser(int id);
	
}
