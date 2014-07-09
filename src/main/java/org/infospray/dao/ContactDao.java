package org.infospray.dao;

import java.util.List;
import java.util.Properties;

import org.infospray.model.Contact;
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
	
}
