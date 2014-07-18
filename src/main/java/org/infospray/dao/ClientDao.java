package org.infospray.dao;

import java.util.List;
import java.util.Properties;

import org.infospray.model.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class ClientDao {
	
	  @Autowired
	   private JdbcTemplate jdbcTemplate;
	  
	  @Autowired
	  private Properties queryProperties;
	  
	  private static Logger logger = LoggerFactory.getLogger(ClientDao.class);
	  
	  public List<Client> getListClient(){
		  logger.info("Recherche de la liste des clients.");
		  return jdbcTemplate.query(queryProperties.getProperty("SELECT_CLIENTS"),
				  new BeanPropertyRowMapper<Client>(Client.class));
	  }

}
