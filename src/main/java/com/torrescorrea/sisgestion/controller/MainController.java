package com.torrescorrea.sisgestion.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {
	@GetMapping("/infracciones")
	public String getInfracciones(Model model) {
		return "principal";
	}
}