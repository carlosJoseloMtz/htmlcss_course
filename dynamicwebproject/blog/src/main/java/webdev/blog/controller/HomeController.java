package webdev.blog.controller;

import org.omg.CORBA.portable.ApplicationException;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping("/**")
public class HomeController {
	


	@RequestMapping(value = "home", method = RequestMethod.GET)
	public String displayHome() {
		return "showMessage";
	}
	
}
