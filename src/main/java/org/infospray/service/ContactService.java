package org.infospray.service;

import java.util.List;

import org.infospray.model.Competence;
import org.infospray.model.Contact;
import org.infospray.model.ContactSumUp;
import org.infospray.model.Mission;

public interface ContactService {
	
	public List<Contact> getListContact();

	public Contact getContactById(long id);
	
	public ContactSumUp getContactSumUpById(long id);

	public List<ContactSumUp> getListContactSumUp();

	public List<Competence> getListContactCompetenceById(long id);

	public List<Mission> getListContactMissionById(long id);


}
