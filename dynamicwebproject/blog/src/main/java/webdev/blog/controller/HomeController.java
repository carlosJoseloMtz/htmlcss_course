package webdev.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import webdev.blog.model.User;


@Controller
@RequestMapping("/**")
public class HomeController {
	
	/**
	 * Metodos en HTTP
	 * GET
	 * POST
	 * 
	 * _______
	 * PUT
	 * DELETE
	 * ....
	 * 
	 */


	@RequestMapping(value = "home", method = RequestMethod.GET)
	public String displayHome(Model model) {
		model.addAttribute("message", "hola, este es un mensaje");
		
		User user = new User();
//		Long myId = new Long(323232);
		user.setId(4242423l);
		user.setName("Carlos");
		user.setRfc("ofidjsaifjdsoia");
		
		model.addAttribute("loggedUser", user);
		
		
		return "showMessage";
	}
	
}
