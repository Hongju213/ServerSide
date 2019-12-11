package com.kimi.boot.main;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

//DAO
@Repository
public class BoardDAOMybatis extends SqlSessionDaoSupport{
	@Autowired
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		super.setSqlSessionFactory(sqlSessionFactory);
	}
	
	public List<Map<Object, String>> getBoardList(BoardVO vo) {
			return getSqlSession().selectList("BoardDAO.getBoardList_T", vo);
	}
}
