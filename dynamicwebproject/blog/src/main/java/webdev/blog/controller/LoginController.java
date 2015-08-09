package webdev.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/**")
public class LoginController {

	@RequestMapping(value = "login", method = RequestMethod.GET)
	public String showLogin() {
		return "login";
	}
	
	
	@RequestMapping(value = "login/auth", method = RequestMethod.POST)
	public String authenticateUser(
			@RequestParam(value = "username", required = true) String user,
			@RequestParam(value = "password", required = true) String pwd,
			Model model) {
		// TODO: autenticar al usaurio
		model.addAttribute("loggedUser", user);
		
		if (pwd.equals("1234")) {
			model.addAttribute("success", true);
		} else {
			model.addAttribute("success", false);
		}
		
		return "login";
	}
}
