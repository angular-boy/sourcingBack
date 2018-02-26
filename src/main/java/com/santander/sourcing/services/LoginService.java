package com.santander.sourcing.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.santander.sourcing.dao.ContactRepository;
import com.santander.sourcing.entity.Contact;

@Service
public class LoginService {
	@Autowired
	ContactRepository dao;

	public boolean login(Contact contact) {
		if (dao.findByEmailAndPassword(contact.getEmail(), contact.getPassword()) == null) {
			return false;
		} else {
			return true;
		}
	}
}
