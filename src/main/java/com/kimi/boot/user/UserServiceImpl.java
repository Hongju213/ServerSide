package com.kimi.boot.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDAOMybatis userDAO;

	public void setUserDAO(UserDAOMybatis userDAO) {
		this.userDAO = userDAO;
	}

	public UserVO getUser(UserVO vo) {
		return userDAO.getUser(vo);
	}
	
	public void insertUser(UserVO vo) {
		userDAO.insetUser(vo);
	}
	public void insertUser2(UserVO vo) {
		userDAO.insetUser2(vo);
	}
}
