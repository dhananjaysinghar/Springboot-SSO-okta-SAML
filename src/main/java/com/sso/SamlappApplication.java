package com.sso;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class SamlappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SamlappApplication.class, args);
	}
	
	@RequestMapping("/")
    public String index() {
        return "index";
    }

	@RequestMapping("/saml")
	public String saml() {
		return "index";
	}
}
