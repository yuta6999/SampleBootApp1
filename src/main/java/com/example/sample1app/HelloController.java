package com.example.sample1app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView; 

@Controller
public class HelloController {
  
//	▼リスト3-11
	@RequestMapping(value="/", method=RequestMethod.GET)
	public ModelAndView index(ModelAndView mav) {
	  mav.setViewName("index");
	  mav.addObject("msg","HelloController/indexのページです。");
	return mav;
	}

	@RequestMapping("/other")
	public String other() {
	  return "redirect:/";
	  // リダイレクト：アクセスするアドレスそのものが移動先のものに変更される
	}

	@RequestMapping("/home")
	public String home() {
	  return "forward:/";
	  // フォワード：アドレスの変更なし（表示内容のみ差し替え）
	}
}

