package org.infospray.service;

import java.util.ArrayList;
import java.util.List;

import org.infospray.model.Competence;
import org.springframework.stereotype.Service;


@Service
public class CompetenceServiceImpl implements CompetenceService {

	@Override
	public List<Competence> getListCompetences() {
		List<Competence> listCompetences = new ArrayList<Competence>();
		
		Competence comp = new Competence();
		comp.setId(1);
		comp.setLibelle("JAVA");
		
		Competence comp2 = new Competence();
		comp2.setId(2);
		comp2.setLibelle("PERL");
		
		listCompetences.add(comp);
		listCompetences.add(comp2);
		
		return listCompetences;
	}



}
