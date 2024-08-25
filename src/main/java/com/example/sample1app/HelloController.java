package com.example.sample1app;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping; 

@Controller
public class HelloController {
  
	@RequestMapping("/{temp}")
	public String index(@PathVariable String temp) {
	  switch(temp) {
	    case "index":
	    return "index";
	    default:
	    return "other";
	  }
	}

	@RequestMapping()
	public String index(Model model) {
	model.addAttribute("msg", 
	   "これはコントローラーに用意したメッセージです。");
	return "index";
	}
}

