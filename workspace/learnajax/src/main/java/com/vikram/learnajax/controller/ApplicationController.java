package com.vikram.learnajax.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vikram.learnajax.model.AjaxResponse;
import com.vikram.learnajax.model.Contact;
import com.vikram.learnajax.service.ContactService;

@Controller
public class ApplicationController {
	
	
	
	@RequestMapping("/")
	public String showIndex(HttpServletRequest request) {
		return "index";
	}
	
 }
