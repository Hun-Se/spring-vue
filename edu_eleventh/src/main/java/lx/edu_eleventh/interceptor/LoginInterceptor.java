package lx.edu_eleventh.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class LoginInterceptor implements HandlerInterceptor {
	
//	@Override
//	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
//			throws Exception {
//		System.out.println("LoginInterceptor.preHanlder()");
//		HttpSession session = request.getSession();
//		String userId = (String) session.getAttribute("userId");
//		if(userId == null || userId.length() == 0) {
//			response.sendRedirect("login_form.do");
//			return false;
//		}
//		return true;
//	}
}
