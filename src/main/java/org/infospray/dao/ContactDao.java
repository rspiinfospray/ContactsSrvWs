package org.infospray.dao;

import java.util.List;

import org.infospray.model.Competence;
import org.infospray.model.Contact;
import org.infospray.model.ContactSumUp;
import org.infospray.model.Mission;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class ContactDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
    Environment env;
	 
	 private static Logger logger = LoggerFactory.getLogger(ContactDao.class);

	public Contact getContactById(long id){
		logger.info("Recherche d'un contact par id = {}", id);
		return jdbcTemplate.queryForObject(env.getProperty("SELECT_CONTACT_BY_ID"),
				new BeanPropertyRowMapper<Contact>(Contact.class), id);
	}

	public List<Contact> getListContact(){
		logger.info("Recherche de tous les contacts en base.");
		return jdbcTemplate.query(env.getProperty("SELECT_CONTACTS"),
				new BeanPropertyRowMapper<Contact>(Contact.class));
	}

	public ContactSumUp getContactSumUpById(long id) {
		logger.info("Recherche d'un resumé de contact par id = {}", id);
		return jdbcTemplate.queryForObject(env.getProperty("SELECT_CONTACTSUMUP_BY_ID"),
				new BeanPropertyRowMapper<ContactSumUp>(ContactSumUp.class), id);
	}

	public List<ContactSumUp> getListContactSumUp() {
		logger.info("Recherche de l'ensemble des résumés de contact.");
		return jdbcTemplate.query(env.getProperty("SELECT_CONTACTSUMUP"),
				new BeanPropertyRowMapper<ContactSumUp>(ContactSumUp.class));
	}

	public List<Competence> getListContactCompetenceById(long id) {
		logger.info("Recherche de la liste des compétences d'un contact par id = {} ", id);
		return jdbcTemplate.query(env.getProperty("SELECT_CONTACT_EXPERIENCE_BY_ID"),
				new BeanPropertyRowMapper<Competence>(Competence.class),id);
	}
	
	public List<Mission> getListContactMissionById(long id){
		logger.info("Recherche de la liste des missions d'un contact avec son id = {} ", id);
		return jdbcTemplate.query(env.getProperty("SELECT_CONTACT_MISSION_BY_ID"),
					new MissionRowMapper(),id);
	}

}
