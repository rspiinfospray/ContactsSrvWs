package org.infospray.controller;

import org.infospray.model.Competence;
import org.infospray.model.Contact;
import org.infospray.model.ContactSumUp;
import org.infospray.rest.BuildRestReponse;
import org.infospray.rest.Reponse;
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
	public Reponse<Contact> getListContact(){		
		return BuildRestReponse.buildList(contactService.getListContact());
	}
	
	@RequestMapping("/contacts/{id}")
	public Reponse<Contact> getListContact(@PathVariable long id){
		return BuildRestReponse.build(contactService.getContactById(id));
	}
	
	@RequestMapping("/contacts/{id}/competence")
	public Reponse<Competence> getListContactCompetenceById(@PathVariable long id){
		return BuildRestReponse.buildList(contactService.getListContactCompetenceById(id));
	}
	
	@RequestMapping("/contacts/sumup/{id}")
	public Reponse<ContactSumUp> getContactSumupById(@PathVariable long id){
		return BuildRestReponse.build(contactService.getContactSumUpById(id));
	}
	
	@RequestMapping("/contacts/sumup")
	public Reponse<ContactSumUp> getListContactSumup(){
		return BuildRestReponse.buildList(contactService.getListContactSumUp());
	}

}
