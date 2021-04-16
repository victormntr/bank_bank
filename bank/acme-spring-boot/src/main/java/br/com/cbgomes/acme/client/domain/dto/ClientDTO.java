/**
 * 
 */
package br.com.cbgomes.acme.client.domain.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author cbgomes
 *
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Getter
@Setter
public class ClientDTO {

	private String name;
	
	private String phone;
	
	private String email;
	
	private String address;
	
	private Long cpf;
	
	private Long cnpj;
	
}
