package com.santander.sourcing.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santander.sourcing.dao.ContactRepository;
import com.santander.sourcing.entity.Contact;

@Service
public class existEmail {
	@Autowired
	ContactRepository dao;

	public boolean findEmail(Contact contact) {
		if (dao.findByEmail(contact.getEmail()) == null) {
			return true;
		} else {
			return false;
		}
	}
}
