package org.infospray.controller;

import java.util.List;

import org.infospray.model.Contact;
import org.infospray.model.ContactSumUp;
import org.infospray.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ContactController {

	@Autowired
	private ContactService contactService;


	@RequestMapping("/contacts")
	public List<Contact> getListContact(){
		return contactService.getListContact();
	}
	
	@RequestMapping("/contacts/{id}")
	public Contact getListContact(@PathVariable long id){
		return contactService.getContactById(id);
	}
	
	@RequestMapping("/contacts/sumup/{id}")
	public ContactSumUp getContactSumup(@PathVariable long id){
		return contactService.getContactSumUpById(id);
	}

}
