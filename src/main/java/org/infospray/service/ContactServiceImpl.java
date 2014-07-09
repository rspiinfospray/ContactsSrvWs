package org.infospray.service;

import java.util.List;

import org.infospray.dao.ContactDao;
import org.infospray.model.Competence;
import org.infospray.model.Contact;
import org.infospray.model.ContactSumUp;
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

	@Override
	public ContactSumUp getContactSumUpById(long id) {
		return contactDao.getContactSumUpById(id);
	}

	public ContactDao getContactDao() {
		return contactDao;
	}

	public void setContactDao(ContactDao contactDao) {
		this.contactDao = contactDao;
	}

	@Override
	public List<ContactSumUp> getListContactSumUp() {
		return contactDao.getListContactSumUp();
	}

	@Override
	public List<Competence> getListContactCompetenceById(long id) {
		return contactDao.getListContactCompetenceById(id);
	}
	
	

}
