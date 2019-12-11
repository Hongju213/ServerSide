package com.kimi.boot.user;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


//DAO
@Repository
public class UserDAOMybatis extends SqlSessionDaoSupport{
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	// CRUD 기능의 메소드 구현
	// 회원 등록
	
	public UserVO getUser(UserVO vo) {
		return (UserVO) getSqlSession().selectOne("UserDAO.getUser", vo);
	}
	
	public void insetUser(UserVO vo) {
		getSqlSession().insert("UserDAO.insertUser", vo);
	}
	public void insetUser2(UserVO vo) {
		getSqlSession().insert("UserDAO.insertUser2", vo);
	}
	
}