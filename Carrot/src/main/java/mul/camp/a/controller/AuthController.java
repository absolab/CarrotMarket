package mul.camp.a.controller;

import java.util.ArrayList;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import mul.camp.a.dto.UserDto;
import mul.camp.a.service.UserService;

@Controller
public class AuthController {
    
    /*
        로그인, 로그아웃, 회원가입
    */
	
//	@Autowired
//	UserService service;
	
	private static Logger logger = LoggerFactory.getLogger(AuthController.class);
	
	// 로그인 페이지로 이동
	@RequestMapping(value = "login.do", method = RequestMethod.GET)
	public String login() {
		logger.info("AuthController login() " + new Date());
		
		return "login";
	}
	
	// 회원정보 확인 후 로그인
	@RequestMapping(value = "loginAf.do", method = RequestMethod.POST)
	public String loginAf(Model model/*UserDto dto, HttpServletRequest req*/) {
		logger.info("AuthController loginAf() " + new Date());
		
//		UserDto user = service.login(dto);
//		if(user != null) {
//			req.getSession().setAttribute("login", user);
//			System.out.println("로그인성공");
//			
//			return "main";
//		}
//		else {	// 조금 더 보완필요
//			System.out.println("회원정보없음");
//			return "login";
//		}
		ArrayList<String> user = new ArrayList<String>();
		user.add("id");
		user.add("pw");
		user.add("name");
		user.add("birthdate");
		user.add("email");
		user.add("phone");
		user.add("location");
		
		for(int i=0; i < user.size(); i++) {
			System.out.print(user.get(i) + " /");
		}
		System.out.println("로그인성공");
		return "main";
		
		
	}
}
