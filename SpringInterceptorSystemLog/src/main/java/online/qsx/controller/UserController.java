/**
 * 
 */
package online.qsx.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import online.qsx.common.ErrorUtile;
import online.qsx.model.ErrorInfoModel;

/**
 * @author qsx
 * @version 1.0
 * @email 2017年10月19日 上午10:16:57
 */
@Controller
@RequestMapping(value = "userController")
public class UserController {

	@RequestMapping(value = "to_index", method = { RequestMethod.GET, RequestMethod.POST })
	public String to_index(Model model) {
		model.addAttribute("errorList",ErrorUtile.list);
		return "index";
	}

	@RequestMapping(value = "to_login", method = RequestMethod.GET)
	public String to_login() {
		return "login";
	}

	@RequestMapping(value = "do_login", method = RequestMethod.POST)
	public String do_login(ErrorInfoModel userModel, HttpServletRequest request) {
		//模拟错误
		int i = 0 / 0;
		return "forward:to_index";
	}
}
