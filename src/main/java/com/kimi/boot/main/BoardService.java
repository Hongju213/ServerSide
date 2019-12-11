package com.kimi.boot.main;

import java.util.List;
import java.util.Map;

public interface BoardService {
	
	//글 목록 조회
	List<Map<Object, String>> getBoardList(BoardVO vo);
}
