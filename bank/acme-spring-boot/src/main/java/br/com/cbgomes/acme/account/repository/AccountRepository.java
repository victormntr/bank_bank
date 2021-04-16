package br.com.cbgomes.acme.account.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cbgomes.acme.account.domain.Account;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long>{

	Optional<Account> findByNumberAccount(Long number_account);
}
