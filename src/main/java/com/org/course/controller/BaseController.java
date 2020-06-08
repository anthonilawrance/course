package com.org.course.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BaseController {

		@GetMapping("/hello")
		public String call() {
			return "Hi, I am base controller from spring boot with pivotal cloud foundary services";
		}
		@GetMapping("/test")
		public String test() {
			return "Hi, Sasi kumar is elder brother for Anthoni Lawrance.";
		}
}
