package org.infospray.controller;

import java.util.List;

import org.infospray.model.Client;
import org.infospray.rest.BuildRestResponse;
import org.infospray.rest.ResponseBody;
import org.infospray.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
	
	@Autowired
	private ClientService clientService;


	@RequestMapping("/clients")
	public ResponseEntity<ResponseBody<List<Client>>> getListClients(){
		return BuildRestResponse.build(clientService.getListClients());
	}
	
	@RequestMapping("/clients/{id}")
	public ResponseEntity<ResponseBody<Client>> getClientById(@PathVariable long id){
		return BuildRestResponse.build(clientService.getClientById(id));
	}
	
}
