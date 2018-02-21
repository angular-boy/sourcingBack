package com.santander.sourcing.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.santander.sourcing.entity.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}