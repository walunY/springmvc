package xyz.walun.exception;

import org.springframework.lang.Nullable;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class MyExceptionResolver implements HandlerExceptionResolver {
	@Nullable
	@Override
	public ModelAndView resolveException(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, @Nullable Object o, Exception e) {
		// 获取异常
		MyException me= null;
		if(e instanceof MyException)
			me= (MyException) e;
		else
			me=new MyException("不是myException类型的错误，，，可以联系管理员之类的");
		ModelAndView mv = new ModelAndView();
		mv.addObject("errorMsg",me.getMessage());
		mv.setViewName("error");
		return mv;
	}
}
