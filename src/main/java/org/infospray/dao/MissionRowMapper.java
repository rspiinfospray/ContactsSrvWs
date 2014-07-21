package org.infospray.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.infospray.model.Client;
import org.infospray.model.Competence;
import org.infospray.model.Formation;
import org.infospray.model.Mission;
import org.springframework.jdbc.core.RowMapper;


public class MissionRowMapper implements RowMapper<Mission>
{

	@Override
	public Mission mapRow(ResultSet rs, int rowNum) throws SQLException {

		Mission mission = new Mission();

		Client client = new Client();
		client.setId(rs.getInt("idClient"));
		client.setNomClient(rs.getString("nomClient"));		
		mission.setClient(client);

		mission.setCommentaire(rs.getString("commentaire"));
		mission.setDateDebut(rs.getDate("dateDebut"));
		mission.setDateFin(rs.getDate("dateFin"));


		Formation formation = null;
		if(rs.getInt("idFormation") != 0){
			formation = new Formation();
			formation.setId(rs.getInt("idFormation"));
			formation.setDescription(rs.getString("description"));
			formation.setCode(rs.getString("codeFormation"));

			Competence competence = new Competence();
			competence.setId(rs.getInt("idCompetence"));
			competence.setCompetence(rs.getString("libelleCompetence"));

			formation.setCompetence(competence);
		}

		mission.setFormation(formation);
		mission.setIdRessource(rs.getInt("idRessource"));
		mission.setNote(rs.getInt("note"));


		return mission;

	}

}