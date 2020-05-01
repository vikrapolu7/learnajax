package com.vikram.learnajax.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vikram.learnajax.model.Contact;

public interface ContactRepository extends JpaRepository<Contact, Integer>{
	public java.util.List<Contact> findAll();

	public Contact findByIdcontact(int contactid);
	
}
