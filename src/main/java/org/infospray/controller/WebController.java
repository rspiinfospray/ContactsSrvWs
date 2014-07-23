package org.infospray.controller;

import org.infospray.service.CompetenceService;
import org.infospray.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class WebController {
	
	@Autowired
	private CompetenceService competenceService;
	
	@Autowired
	private ContactService contactService;
	
	@RequestMapping(value="/web",method = RequestMethod.GET)
    public String index(Model model) {
		
		
		model.addAttribute("competences", competenceService.getListCompetences());
		model.addAttribute("contactsumup", contactService.getContactSumUpById(2));
		model.addAttribute("contacts", contactService.getListContact());
		
        return "main";
    }
	
	@ResponseBody
	@RequestMapping(value="/contacts/{id}/image",method = RequestMethod.GET,produces = MediaType.IMAGE_JPEG_VALUE)	
	public byte[] getImageById(@PathVariable long id){	
		return contactService.getImageById(id);			
	}
	
	@RequestMapping("/web/contacts/{id}/sumup")
    public String showContactSumup(@PathVariable long id, Model model) {

		model.addAttribute("contactsumup", contactService.getContactSumUpById(2));
        return "/web :: contactsumupFragment";
    }

}
