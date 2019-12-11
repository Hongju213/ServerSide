package com.kimi.boot.errorHandler;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class MyRestController { 
	
	@GetMapping("/controllerException") 
	public void controllerException() { 
		throw new NullPointerException();//controller에서 예외발생 
		} 
	@GetMapping("/kimidsException")
	public ModelAndView kimiException() {
		throw new KimiException();
	}
	@ExceptionHandler(NullPointerException.class) 
	public Object nullex(Exception e) { 
		System.err.println(e.getClass()); 
		return "NullPointerException 발생. 관리자에게 문의하세요."; 
		}
	
}
