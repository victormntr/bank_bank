package br.com.cbgomes.acme.account.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import br.com.cbgomes.acme.account.domain.Account;
import br.com.cbgomes.acme.account.repository.AccountRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {
	
	private final AccountRepository repository;
	
	@Override
	public List<Account> getAll() {
		return this.repository.findAll();
	}

	@Override
	public Optional<Account> getByNumberAccount(Long number_account) {
		return this.repository.findByNumberAccount(number_account);
	}

	@Override
	public void removeByNumberAccount(Long number_account) throws Exception {
		Account account = this.repository.findByNumberAccount(number_account).get();
		if(account != null) {
			 this.repository.delete(account);
		}
		
		throw new Exception("Account not found");
	}
	
	@Override
	public Account create(Account account) {
		return this.repository.save(account);
	}

}