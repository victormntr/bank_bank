/**
 * 
 */
package br.com.cbgomes.acme.account.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

import br.com.cbgomes.acme.client.domain.Client;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name= "tb_accounts")
public class Account {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@JoinColumn(name = "FK_Client", referencedColumnName = "PK_Client",nullable = false)
	private Client id_client;
	
	private Long number_account;
	
	private Long number_agency;
	
	private Long number_bank;
	
	private Long balance;
	
	private Long type_account;
	
}