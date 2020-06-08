package com.org.course.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

		@GetMapping("/hello")
		public String call() {
			return "Hi, I am base controller from spring boot with pivotal cloud foundary services";
		}
}
