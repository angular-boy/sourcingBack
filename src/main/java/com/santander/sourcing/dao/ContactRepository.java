package com.santander.sourcing.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santander.sourcing.dto.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
