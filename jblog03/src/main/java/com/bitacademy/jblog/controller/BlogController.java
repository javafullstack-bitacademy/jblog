package com.bitacademy.jblog.controller;

import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/{id:(?!assets).*}")
public class BlogController {

	@ResponseBody
	@RequestMapping({"", "/{category}", "/{category}/{post}" } )
	public String index(
		@PathVariable String id,
		@PathVariable Optional<Long> category,
		@PathVariable Optional<Long> post) {
		System.out.println(id + ":" + category + ":" + post);
		return "index";
	}

//	@ResponseBody
//	@RequestMapping("/{id}")
//	public String index(@PathVariable String id) {
//		System.out.println(id);
//		return "index1";
//	}
//	
//	@ResponseBody
//	@RequestMapping("/{id}/{category}")
//	public String index2(
//		@PathVariable String id,
//		@PathVariable Long category) {
//		System.out.println(id + ":" + category);
//		return "index2";
//	}
//
//	@ResponseBody
//	@RequestMapping("/{id}/{category}/{post}")
//	public String index3(
//		@PathVariable String id,
//		@PathVariable Long category,
//		@PathVariable Long post) {
//		System.out.println(id + ":" + category + ":" + post);
//		return "index3";
//	}

	
}
