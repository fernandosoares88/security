package com.example.security.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ExemploController {

	@GetMapping("/")
	public String index() {
		return "/site/index";
	}
	
	@GetMapping("/administrativo")
	public String administrativo() {
		return "/site/administrativo";
	}
	
	@GetMapping("/estoque")
	public String estoque() {
		return "/site/estoque";
	}
	
	@GetMapping("/vendas")
	public String vendas() {
		return "/site/vendas";
	}
}
