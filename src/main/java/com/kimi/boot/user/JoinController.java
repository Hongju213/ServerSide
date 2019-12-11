package com.kimi.boot.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JoinController {
	
	@Autowired
	private UserService userService;
	
	@RequestMapping(value="/join", method=RequestMethod.GET)
	public String loginView(@ModelAttribute("user") UserVO vo) {
		
		return "user/join";
	}
	
	@ResponseBody
	@RequestMapping(value="/join.do", method=RequestMethod.POST)
     public String join(UserVO vo) {
		
		userService.insertUser(vo);
		userService.insertUser2(vo);
		
		return "redirect:/";
	}
}
