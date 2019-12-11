package com.kimi.boot.user;

public interface UserService {
	// CRUD의 구현
	// 회원 등록
	public UserVO getUser(UserVO vo);
	
	void insertUser(UserVO vo);
	void insertUser2(UserVO vo);
}
