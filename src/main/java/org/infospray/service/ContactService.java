package org.infospray.service;

import java.util.List;

import org.infospray.model.Contact;

public interface ContactService {
	
	public List<Contact> getListContact();

	public Contact getContactById(long id);

}
