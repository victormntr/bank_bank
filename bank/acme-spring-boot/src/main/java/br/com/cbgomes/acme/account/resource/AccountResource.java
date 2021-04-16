package br.com.cbgomes.acme.account.resource;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.cbgomes.acme.account.domain.dto.AccountConverterDTO;
import br.com.cbgomes.acme.account.domain.dto.AccountDTO;
import br.com.cbgomes.acme.account.service.AccountService;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/account")
public class AccountResource {
	
	private final AccountService service;
	
	@GetMapping
	@ResponseStatus(code = HttpStatus.OK)
	public ResponseEntity<List<AccountDTO>> getAllClients() {
		return ResponseEntity.ok(AccountConverterDTO.conveterListAccount(this.service.getAll()));
	}
	
	@GetMapping("/{number_account}")
	@ResponseStatus(code = HttpStatus.OK)
	public ResponseEntity<AccountDTO> getAccountByNumberAccount(@PathVariable("number_account") Long number_account) {
		return ResponseEntity.ok(AccountConverterDTO.convertToAccountDTO(this.service.getByNumberAccount(number_account).get()));
	}

	@PostMapping
	@ResponseStatus(code = HttpStatus.CREATED)
	public ResponseEntity<AccountDTO> createAccount(@RequestBody AccountDTO dto) {
		return ResponseEntity.ok(AccountConverterDTO.convertToAccountDTO(this.service.create(AccountConverterDTO.convertToAccount(dto))));
	}
	

	@PutMapping()
	@ResponseStatus(code = HttpStatus.CREATED)
	public ResponseEntity<AccountDTO> updateClient(@RequestBody AccountDTO dto,@RequestParam("number_account") Long number_account) throws Exception {
		return ResponseEntity.ok(AccountConverterDTO.convertToAccountDTO(this.service.create(this.service.getByNumberAccount(number_account).get())));	
	
	}
	
	@DeleteMapping("/{number_account}")
	@ResponseStatus(code = HttpStatus.OK)
	public ResponseEntity<Void> deleteClient(@PathVariable("number_account") Long number_account) {
		try {
			this.service.removeByNumberAccount(number_account);
			return ResponseEntity.ok().build();
			
		} catch (Exception e) {
			return ResponseEntity.noContent().build();
		}
	}
}
