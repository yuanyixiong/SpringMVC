/**
 * 
 */
package online.qsx.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import online.qsx.model.UserModel;

/**
 * @author qsx
 * @version 1.0
 * @email 2017年10月19日 上午10:16:57
 */
@Controller
@RequestMapping(value = "userController")
public class UserController {

	@SuppressWarnings("serial")
	private Map<String, UserModel> users = new HashMap<String, UserModel>() {
		{
			put("zs", new UserModel(1L, "zs", "123456", "Zhang San"));
			put("ls", new UserModel(2L, "ls", "123456", "Li Si"));
			put("ww", new UserModel(3L, "ww", "123456", "Wang Wu"));
			put("ml", new UserModel(4L, "ml", "123456", "Ma Liu"));
		}
	};

	@RequestMapping(value = "to_index", method = {RequestMethod.GET,RequestMethod.POST})
	public String to_index(Model model) {
		model.addAttribute("users", users.values());
		return "index";
	}

	@RequestMapping(value = "to_login", method = RequestMethod.GET)
	public String to_login(Model model) {
		return "login";
	}

	@RequestMapping(value = "do_login", method = RequestMethod.POST)
	public String do_login(UserModel userModel, HttpServletRequest request) {
		UserModel user = users.get(userModel.getLoginName());
		if (user != null) {
			if (user.getPassword().equals(userModel.getPassword())) {
				request.getSession().setAttribute("user", user);
				return "forward:to_index";
			}
		}
		request.getSession().setAttribute("user", null);
		return "login";
	}
}
