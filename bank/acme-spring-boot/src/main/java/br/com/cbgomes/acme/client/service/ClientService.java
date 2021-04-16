/**
 * 
 */
package br.com.cbgomes.acme.client.service;

import java.util.List;
import java.util.Optional;

import br.com.cbgomes.acme.client.domain.Client;

/**
 * @author cbgomes
 *
 */
public interface ClientService {
	
	List<Client> getAll();
	
	Optional<Client> getById(Long id);
	
	Optional<Client> getByEmail(String email);
	
	void removeById(Long id) throws Exception;
	
	Client removeByEmail(String email) throws Exception;
	
	Client create(Client client);

}
