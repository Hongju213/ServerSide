package com.kimi.boot.Message;

import java.util.Locale;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.LocaleResolver;

@Controller
public class MessageTestController {
	
    @Autowired
    MessageSource messageSource;
    
    @Autowired
    LocaleResolver localeResolver;

	
    @RequestMapping(value = "/main/i18n.do", method = RequestMethod.GET)
    public String i18n(Locale locale, HttpServletRequest request, Model model) {

        // RequestMapingHandler로 부터 받은 Locale 객체를 출력해 봅니다.
        model.addAttribute("clientLocale", locale);

        // localeResolver 로부터 Locale 을 출력해 봅니다.
        model.addAttribute("sessionLocale", localeResolver.resolveLocale(request));

        // JSP 페이지에서 EL 을 사용해서 arguments 를 넣을 수 있도록 값을 보낸다.
        model.addAttribute("siteCount", messageSource.getMessage("msg.first", null, locale));

        return "i18n";
    }
    
}
