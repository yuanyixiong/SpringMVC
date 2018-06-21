package online.qsx.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import online.qsx.model.UserModel;


public class IdentityInterceptor extends HandlerInterceptorAdapter {

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		UserModel userModel=(UserModel)request.getSession().getAttribute("user");
		if (userModel!=null) {
			return true; // 继续往后
		} else {
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			return false;// 不往后走
		}
	}
}
