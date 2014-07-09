package org.infospray.service;

import java.util.List;

import org.infospray.dao.CompetenceDao;
import org.infospray.model.Competence;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class CompetenceServiceImpl implements CompetenceService {

	@Autowired
	private CompetenceDao competenceDao; 
	
	@Override
	public List<Competence> getListCompetences() {
		return competenceDao.getListCompetence();
	}
	
	@Override
	public Competence getCompetenceById(long id) {
		return competenceDao.getCompetenceById(id);
	}



}
