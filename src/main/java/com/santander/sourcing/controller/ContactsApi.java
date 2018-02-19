package com.santander.sourcing.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.santander.sourcing.entity.Contact;
import com.santander.sourcing.services.ContactService;

@RestController
@CrossOrigin(value = "http://localhost:4200")
public class ContactsApi {

	@Autowired
	ContactService contactService;

	@RequestMapping(value = "/contact", method = RequestMethod.POST)
	public void updateOrSave(@RequestBody Contact contact) {
		contactService.save(contact);
	}
}
