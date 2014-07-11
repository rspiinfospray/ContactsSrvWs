package org.infospray.controller;

import org.infospray.service.CompetenceService;
import org.infospray.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {
	
	@Autowired
	private CompetenceService competenceService;
	
	@Autowired
	private ContactService conactService;
	
	@RequestMapping(value="/web",method = RequestMethod.GET)
    public String index(Model model) {
		
		
		model.addAttribute("competences", competenceService.getListCompetences());
		
		model.addAttribute("contacts", conactService.getListContact());
		
        return "main";
    }

}
