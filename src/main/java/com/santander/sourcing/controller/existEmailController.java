package com.santander.sourcing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.santander.sourcing.entity.Contact;
import com.santander.sourcing.services.existEmail;

@RestController
@CrossOrigin(value = "http://localhost:4200")
public class existEmailController {

	@Autowired
	existEmail existEmail;

	@RequestMapping(value = "/existEmail", method = RequestMethod.POST)
	public boolean findEmailController(@RequestBody Contact contact) {
		return existEmail.findEmail(contact);
	}
}
