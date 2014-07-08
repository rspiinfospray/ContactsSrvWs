package org.infospray.dao;

import java.util.List;
import java.util.Properties;

import javax.annotation.Resource;

import org.infospray.model.Contact;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class ContactDao {

	  @Autowired
	   private JdbcTemplate jdbcTemplate;
	  
	  @Resource(name="queries")
	  private Properties queries;
	  
	  
	  public Contact getContactById(long id){		  
		return jdbcTemplate.queryForObject(queries.getProperty("SELECT_CONTACT_BY_ID"), Contact.class, id);		 
	  }
	  
	  List<Contact> getListContact(){
		  return jdbcTemplate.queryForList(queries.getProperty("SELECT_CONTACTS"), Contact.class);
	  }
	
}
