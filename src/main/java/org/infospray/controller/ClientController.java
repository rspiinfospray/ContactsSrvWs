package org.infospray.controller;

import org.infospray.model.Client;
import org.infospray.rest.BuildRestReponse;
import org.infospray.rest.Reponse;
import org.infospray.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	
	@Autowired
	private ClientService clientService;


	@RequestMapping("/clients")
	public Reponse<Client> getListCompetences(){
		return BuildRestReponse.buildList(clientService.getListClients());
	}
	
}
