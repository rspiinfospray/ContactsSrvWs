package org.infospray.dao;

import java.util.List;
import java.util.Properties;

import org.infospray.model.Competence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class CompetenceDao {

	  @Autowired
	   private JdbcTemplate jdbcTemplate;
	  
	  @Autowired
	  @Qualifier("getQueryProperties")
	  private Properties queryProperties;
	  
	  
	  public Competence getCompetenceById(long id){		  
		return jdbcTemplate.queryForObject(queryProperties.getProperty("SELECT_COMPETENCE_BY_ID"),
				new BeanPropertyRowMapper<Competence>(Competence.class), id);
	  }
	  
	  public List<Competence> getListCompetence(){
		  return jdbcTemplate.query(queryProperties.getProperty("SELECT_COMPETENCES"),
				  new BeanPropertyRowMapper<Competence>(Competence.class));
	  }
	
}
