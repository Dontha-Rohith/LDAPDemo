package com.ldap.demo.LDAPDemo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/")
	public String getstring() {
		return "Hlo";
	}

}
