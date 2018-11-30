package org.gorany.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.java.Log;

@Controller
@Log
public class SampleController {
	
	@GetMapping("/googlespeech")
	public void speechSample(Model model) {
		log.info("start google speech....");
	}

}
