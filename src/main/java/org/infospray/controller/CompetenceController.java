package org.infospray.controller;

import java.util.List;

import org.infospray.model.Competence;
import org.infospray.service.CompetenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompetenceController {
	
	@Autowired
	private CompetenceService competenceService;


	@RequestMapping("/competences")
	public List<Competence> getListCompetences(){
		return competenceService.getListCompetences();
	}

}
