/**
 * 
 */
package br.com.cbgomes.acme.client.service;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import org.springframework.web.server.ResponseStatusException;

import br.com.cbgomes.acme.client.domain.Client;
import br.com.cbgomes.acme.client.repository.ClientRepository;
import lombok.RequiredArgsConstructor;

/**
 * @author cbgomes
 *
 */
@Service
@RequiredArgsConstructor
public class ClientServiceImpl implements ClientService {
	
	
	private final ClientRepository repository;


	@Override
	public List<Client> getAll() {
		return this.repository.findAll();
	}

	@Override
	public Optional<Client> getById(Long id) {
		return this.repository.findById(id);
	}

	@Override
	public Optional<Client> getByEmail(String email) {
		return this.repository.findByEmail(email);
	}

	@Override
	public void removeById(Long id) throws Exception {
		if(this.repository.findById(id).get() != null) {
			this.repository.deleteById(id);
		}else {
			throw new Exception("Client not found");
		}
	}

	@Override
	public Client removeByEmail(String email) throws Exception {
		Client client = this.repository.findByEmail(email).get();
		if(client != null) {
			this.repository.deleteById(client.getId());
			return client;
		}
		
		throw new Exception("Client not found");
	}

	@Override
	public Client create(Client client) {
		return this.repository.save(client);
	}

}
