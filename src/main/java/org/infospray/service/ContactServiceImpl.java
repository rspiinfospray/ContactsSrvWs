package org.infospray.service;

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
		return contactDao.getListContact();
	}

	@Override
	public Contact getContactById(long id) {
		
		return contactDao.getContactById(id);
	}
	
	

}
