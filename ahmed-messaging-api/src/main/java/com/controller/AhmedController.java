package com.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/apple")
public class AhmedController {

	@GetMapping
	public String nn() {
		return "Welcome Tufail";
	}
}
