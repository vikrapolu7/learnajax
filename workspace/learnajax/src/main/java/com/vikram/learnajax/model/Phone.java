package com.vikram.learnajax.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
@Table(name = "phone")
public class Phone {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int idphone;
	private String phonetype;
	private String areacode;
	private String number;
	
	@JsonBackReference
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinColumn(name = "idcontact",nullable = false)
	private Contact contact;
	


	public Phone(int idphone, String phonetype, String areacode, String number, Contact contact) {
		
		this.idphone = idphone;
		this.phonetype = phonetype;
		this.areacode = areacode;
		this.number = number;
		this.contact = contact;
	}
	
	
	public Phone() {
		
	}
	
	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}

	public int getIdphone() {
		return idphone;
	}
	public void setIdphone(int idphone) {
		this.idphone = idphone;
	}
	
	public String getPhonetype() {
		return phonetype;
	}
	public void setPhonetype(String phonetype) {
		this.phonetype = phonetype;
	}
	public String getAreacode() {
		return areacode;
	}
	public void setAreacode(String areacode) {
		this.areacode = areacode;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	
	
	
	
}
