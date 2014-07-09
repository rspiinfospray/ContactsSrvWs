package org.infospray.dao;

import java.util.List;
import java.util.Properties;

import org.infospray.model.Competence;
import org.infospray.model.Contact;
import org.infospray.model.ContactSumUp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;




@Repository
public class ContactDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	@Qualifier("getQueryProperties")
	private Properties queryProperties;


	public Contact getContactById(long id){		  
		return jdbcTemplate.queryForObject(queryProperties.getProperty("SELECT_CONTACT_BY_ID"),
				new BeanPropertyRowMapper<Contact>(Contact.class), id);
	}

	public List<Contact> getListContact(){
		return jdbcTemplate.query(queryProperties.getProperty("SELECT_CONTACTS"),
				new BeanPropertyRowMapper<Contact>(Contact.class));
	}

	public ContactSumUp getContactSumUpById(long id) {
		return jdbcTemplate.queryForObject(queryProperties.getProperty("SELECT_CONTACTSUMUP_BY_ID"),
				new BeanPropertyRowMapper<ContactSumUp>(ContactSumUp.class), id);
	}

	public List<ContactSumUp> getListContactSumUp() {
		return jdbcTemplate.query(queryProperties.getProperty("SELECT_CONTACTSUMUP"),
				new BeanPropertyRowMapper<ContactSumUp>(ContactSumUp.class));
	}

	public List<Competence> getListContactCompetenceById(long id) {
		return jdbcTemplate.query(queryProperties.getProperty("SELECT_CONTACT_EXPERIENCE"),
				new BeanPropertyRowMapper<Competence>(Competence.class));
	}

}
