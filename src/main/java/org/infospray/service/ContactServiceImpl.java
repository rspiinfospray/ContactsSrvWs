package org.infospray.service;


import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import javax.servlet.ServletContext;
import org.apache.commons.io.IOUtils;
import org.infospray.dao.ContactDao;
import org.infospray.model.Competence;
import org.infospray.model.Contact;
import org.infospray.model.ContactSumUp;
import org.infospray.model.Mission;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;




@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactDao contactDao; 
	
	@Autowired
	ServletContext context;
	
	
	private static Logger logger = LoggerFactory.getLogger(ContactServiceImpl.class);
	
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

	@Override
	public List<Mission> getListContactMissionById(long id) {
		return contactDao.getListContactMissionById(id);
	}

	@Override
	public byte[] getPhotoById(long id) {

		logger.info("Recherche de la photo du contact = {}",id);

		 InputStream in = getClass().getResourceAsStream("/photos/photoContact_" + String.valueOf(id)+".jpeg");
		 byte[] byteTab = null;
		 try {
			 byteTab = IOUtils.toByteArray(in);
		} catch (IOException e) {
			logger.error(e.getLocalizedMessage());
		}

		 return byteTab;
	}

}
	
