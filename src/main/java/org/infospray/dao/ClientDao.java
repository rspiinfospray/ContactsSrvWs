package org.infospray.dao;

import java.util.List;

import org.infospray.model.Client;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
public class ClientDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	Environment env;

	private static Logger logger = LoggerFactory.getLogger(ClientDao.class);

	public List<Client> getListClient(){
		logger.info("Recherche de la liste des clients.");
		return jdbcTemplate.query(env.getProperty("SELECT_CLIENTS"),
				new BeanPropertyRowMapper<Client>(Client.class));
	}

	public Client getClientById(long id) {
		logger.info("Recherche d'un client à partir de son id = {}", id);
		return jdbcTemplate.queryForObject(env.getProperty("SELECT_CLIENT_BY_ID"),
				new BeanPropertyRowMapper<Client>(Client.class), id);
	}

}
