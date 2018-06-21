package online.qsx.interceptor;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import online.qsx.common.ErrorUtile;
import online.qsx.model.ErrorInfoModel;

public class ErrorInterceptor extends HandlerInterceptorAdapter {

	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		// ¼ÇÂ¼´íÎóÐÅÏ¢
		if(ex!=null){
			ErrorUtile.list.add(new ErrorInfoModel(new Date(), ex.getMessage(), handler.toString()));
		}
	}

}
