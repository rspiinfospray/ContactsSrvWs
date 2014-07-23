package org.infospray.controller;

import java.util.List;

import org.infospray.model.Competence;
import org.infospray.rest.BuildRestResponse;
import org.infospray.rest.ResponseBody;
import org.infospray.service.CompetenceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CompetenceController {
	
	@Autowired
	private CompetenceService competenceService;


	@RequestMapping("/competences")
	public ResponseEntity<ResponseBody<List<Competence>>> getListCompetences(){
		return BuildRestResponse.build(competenceService.getListCompetences());
	}
	
	@RequestMapping("/competences/{id}")
	public ResponseEntity<ResponseBody<Competence>> getCompetenceById(@PathVariable long id){
		return BuildRestResponse.build(competenceService.getCompetenceById(id));
	}

}
