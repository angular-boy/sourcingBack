package com.santander.sourcing.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santander.sourcing.dao.ContactRepository;
import com.santander.sourcing.dto.Contact;

@Service
public class ContactService {
	@Autowired
	ContactRepository dao;

	public Contact save(Contact contact) {
		return dao.saveAndFlush(contact);
	}
}
