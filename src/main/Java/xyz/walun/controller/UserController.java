package xyz.walun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import xyz.walun.exception.MyException;

@Controller
@RequestMapping("/user")
public class UserController {

	@RequestMapping("/testException")
	public String testException()throws MyException{
		System.out.println("testException.....");
		try {

		int i = 10/0;
		}catch (Exception e){
			e.printStackTrace();
			throw new MyException("。 。  。异常");
		}
		return "success";
	}
}
