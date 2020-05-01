package com.vikram.learnajax.model;


import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonManagedReference;



@Entity
@Table(name = "contact")
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idcontact;
	private String firstname;
	private String middlename;
	private String lastname;
	

	
	public Contact(int idcontact, String firstname, String middlename, String lastname) {
		
		this.idcontact = idcontact;
		this.firstname = firstname;
		this.middlename = middlename;
		this.lastname = lastname;
	}
	
	public Contact() {
		
	}
	
	@JsonManagedReference
	@OneToMany(mappedBy = "contact", fetch = FetchType.LAZY)
	private Set<Phone> phones;
	public Set<Phone> getPhones() {
		return phones;
	}

	public void setPhones(Set<Phone> phones) {
		this.phones = phones;
	}
	public int getIdcontact() {
		return idcontact;
	}

	public void setIdcontact(int idcontact) {
		this.idcontact = idcontact;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getMiddlename() {
		return middlename;
	}

	public void setMiddlename(String middlename) {
		this.middlename = middlename;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
	
	
}
