package br.com.cbgomes.acme.account.service;

import java.util.List;
import java.util.Optional;

import br.com.cbgomes.acme.account.domain.Account;


public interface AccountService {
	
	List<Account> getAll();
	
	Optional<Account> getByNumberAccount(Long number_account);
	
	void removeByNumberAccount(Long number_account) throws Exception;
	
	Account create(Account account);

}