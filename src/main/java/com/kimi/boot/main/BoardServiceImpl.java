package com.kimi.boot.main;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("boardService")
public class BoardServiceImpl implements BoardService{

	@Autowired
	private BoardDAOMybatis boardDAO;
	
	public List<Map<Object, String>> getBoardList(BoardVO vo) {
		return boardDAO.getBoardList(vo);
	}
}
