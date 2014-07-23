package org.infospray.controller;


import java.util.List;

import org.infospray.model.Competence;
import org.infospray.model.Contact;
import org.infospray.model.Mission;
import org.infospray.model.ContactSumUp;
import org.infospray.rest.BuildRestResponse;
import org.infospray.rest.ResponseBody;
import org.infospray.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ContactController {

	@Autowired
	private ContactService contactService;


	@RequestMapping("/contacts")
	public ResponseEntity<ResponseBody<List<Contact>>> getListContact(){	
		return BuildRestResponse.build(contactService.getListContact());
	}

	@RequestMapping("/contacts/{id}")
	public ResponseEntity<ResponseBody<Contact>> getContactById(@PathVariable long id){
		return BuildRestResponse.build(contactService.getContactById(id));
	}
	
	@RequestMapping("/contacts/{id}/competence")
	public ResponseEntity<ResponseBody<List<Competence>>> getListContactCompetenceById(@PathVariable long id){
		return BuildRestResponse.build(contactService.getListContactCompetenceById(id));
	}
	
	@RequestMapping("/contacts/{id}/sumup")
	public ResponseEntity<ResponseBody<ContactSumUp>> getContactSumupById(@PathVariable long id){
		return BuildRestResponse.build(contactService.getContactSumUpById(id));
	}
	
	@RequestMapping("/contacts/{id}/mission")
	public ResponseEntity<ResponseBody<List<Mission>>> getListContactMissionById(@PathVariable long id){
		return BuildRestResponse.build(contactService.getListContactMissionById(id));
	}
	
	@RequestMapping("/contacts/sumup")
	public ResponseEntity<ResponseBody<List<ContactSumUp>>> getListContactSumup(){
		return BuildRestResponse.build(contactService.getListContactSumUp());
	}

}
