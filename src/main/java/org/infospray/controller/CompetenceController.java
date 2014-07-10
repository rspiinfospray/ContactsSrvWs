package org.infospray.controller;

import org.infospray.model.Competence;
import org.infospray.rest.BuildRestReponse;
import org.infospray.rest.Reponse;
import org.infospray.service.CompetenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompetenceController {
	
	@Autowired
	private CompetenceService competenceService;


	@RequestMapping("/competences")
	public Reponse<Competence> getListCompetences(){
		return BuildRestReponse.buildList(competenceService.getListCompetences());
	}
	
	@RequestMapping("/competences/{id}")
	public Reponse<Competence> getCompetenceById(@PathVariable long id){
		return BuildRestReponse.build(competenceService.getCompetenceById(id));
	}

}
