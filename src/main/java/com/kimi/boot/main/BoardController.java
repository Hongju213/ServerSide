package com.kimi.boot.main;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

@Controller
@SessionAttributes("board")
public class BoardController {
	@Autowired
	private BoardService boardService;
	
	@RequestMapping("/main")
	@ResponseBody
	public ModelAndView mysqltest(BoardVO vo, @RequestParam MultiValueMap<String, String> multiMap) throws Exception {
		
		List<Map<Object, String>> boardList = boardService.getBoardList(vo);
		
		return new ModelAndView("main", "list", boardList);
		
	}
	
}
