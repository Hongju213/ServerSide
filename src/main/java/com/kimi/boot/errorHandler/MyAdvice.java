package com.kimi.boot.errorHandler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.ModelAndView;

@RestControllerAdvice
public class MyAdvice {
	
	@ExceptionHandler(KimiException.class)
	public ModelAndView kimi() {
		ModelAndView mv = new ModelAndView(); 
		mv.setViewName("/ExceptionTest"); // 뷰의 이름 
		mv.addObject("data", "KimiException Test - 관리자에게 문의하세요."); // 뷰로 보낼 데이터 값 
		return mv;
	}
}