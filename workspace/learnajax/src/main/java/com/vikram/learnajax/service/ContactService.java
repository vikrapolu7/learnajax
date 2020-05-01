package com.vikram.learnajax.service;

import java.util.ArrayList;



import java.util.List;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.vikram.learnajax.model.Contact;
import com.vikram.learnajax.repository.ContactRepository;


@Service
@Transactional
public class ContactService{
	
	
	private final ContactRepository contactRepository;
	
	public ContactService(ContactRepository contactRepository) {
		this.contactRepository=contactRepository;
	}
	
	public List<Contact> findAll() {
		System.out.println("Came Here");
		// TODO Auto-generated method stub
		List<Contact> contactList =new ArrayList<Contact>();
		
		for(Contact contact:contactRepository.findAll()) {
			
			contactList.add(contact);
		}
		return contactList;
	}

	public Contact findById(int contactid) {
		// TODO Auto-generated method stub
		Contact contact = contactRepository.findByIdcontact(contactid);
		return contact;
	}

	

	public void updateDetails(Contact contactdetails) {
		// TODO Auto-generated method stub
		contactRepository.save(contactdetails);
	}

	public void save(Contact contact) {
		// TODO Auto-generated method stub
		contactRepository.save(contact);
		
	}
	
	
	
	
}
