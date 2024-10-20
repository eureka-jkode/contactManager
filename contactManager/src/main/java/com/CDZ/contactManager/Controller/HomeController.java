package com.CDZ.contactManager.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.CDZ.contactManager.Repo.UserRepo;
import com.CDZ.contactManager.entinties.Contact;
import com.CDZ.contactManager.entinties.User;
@Controller
public class HomeController {

	@Autowired
	private UserRepo userRepo;

	@RequestMapping("/home")
	public String home(Model model) {
	model .addAttribute("title","Home - Smart Contact Manager");
		
		return "home";
	}

	@RequestMapping("/about")
	public String about(Model model) {
	model .addAttribute("title","Home - Smart Contact Manager");
		
		return "about";
	}
	
	
}
