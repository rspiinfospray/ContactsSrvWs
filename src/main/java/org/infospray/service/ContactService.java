package org.infospray.service;

import java.util.List;

import org.infospray.model.Contact;
import org.infospray.model.ContactSumUp;

public interface ContactService {
	
	public List<Contact> getListContact();

	public Contact getContactById(long id);
	
	public ContactSumUp getContactSumUpById(long id);


}
