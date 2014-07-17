package org.infospray.dao;

import java.util.List;
import java.util.Properties;

import org.infospray.model.Competence;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class CompetenceDao {

	  @Autowired
	   private JdbcTemplate jdbcTemplate;
	  
	  @Autowired
	  private Properties queryProperties;
	  
	  private static Logger logger = LoggerFactory.getLogger(CompetenceDao.class);
	  
	  
	  public Competence getCompetenceById(long id){		  
		  logger.info("Recherche d'une compétence par son id = {}.", id);
		return jdbcTemplate.queryForObject(queryProperties.getProperty("SELECT_COMPETENCE_BY_ID"),
				new BeanPropertyRowMapper<Competence>(Competence.class), id);
	  }
	  
	  public List<Competence> getListCompetence(){
		  logger.info("Recherche de la liste des compétences.");
		  return jdbcTemplate.query(queryProperties.getProperty("SELECT_COMPETENCES"),
				  new BeanPropertyRowMapper<Competence>(Competence.class));
	  }
	
}
