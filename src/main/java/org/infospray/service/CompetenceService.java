package org.infospray.service;

import java.util.List;

import org.infospray.model.Competence;

public interface CompetenceService {
	
	public List<Competence> getListCompetences();
	
	public Competence getCompetenceById(long id);

}
