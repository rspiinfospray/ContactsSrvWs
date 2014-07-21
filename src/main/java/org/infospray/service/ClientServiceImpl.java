package org.infospray.service;

import java.util.List;

import org.infospray.dao.ClientDao;
import org.infospray.model.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientDao clientDao;

	@Override
	public List<Client> getListClients() {
		return clientDao.getListClient();
	}

	@Override
	public Client getClientById(long id) {
		return clientDao.getClientById(id);
	}
	
	

}
