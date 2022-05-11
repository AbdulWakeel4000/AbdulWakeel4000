package com.Zohocrm.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Zohocrm.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
