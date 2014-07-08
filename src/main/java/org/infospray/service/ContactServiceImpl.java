package org.infospray.service;

import java.util.ArrayList;
import java.util.List;

import org.infospray.dao.ContactDao;
import org.infospray.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactDao contactDao; 
	
	@Override
	public List<Contact> getListContact() {
		List<Contact> listContact = new ArrayList<Contact>();

		Contact cont = new Contact();
		cont.setId(1);
		cont.setNom("TOTO");
		cont.setPrenom("blabla");


		Contact cont2 = new Contact();
		cont2.setId(2);
		cont2.setNom("TIti");
		cont2.setPrenom("Martin");

		listContact.add(cont);
		listContact.add(cont2);


		return listContact;
	}

	@Override
	public Contact getContactById(long id) {
		
		return contactDao.getContactById(id);
	}
	
	

}
