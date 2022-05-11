package com.Zohocrm.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.Zohocrm.entities.Contact;

@Service
public interface ContactService {

	public void saveContact(Contact contact) ;

	public List<Contact> findAllContacts();

	public Contact getContact(long id);

		

	
}
