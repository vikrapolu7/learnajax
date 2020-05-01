package com.vikram.learnajax.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.vikram.learnajax.model.AjaxResponse;
import com.vikram.learnajax.model.Contact;
import com.vikram.learnajax.service.ContactService;

@RestController
public class RestControllerweb {
	
	@Autowired
	private ContactService contactService;

	@GetMapping("/getcontacts")
	public AjaxResponse getContacts() {
		System.out.println("came to application controller from ajax");
		List<Contact> contactList = contactService.findAll();

		AjaxResponse response = new AjaxResponse("success", contactList.get(0));
		System.out.println(contactList.get(0).getIdcontact());
		return response;
	}

}
