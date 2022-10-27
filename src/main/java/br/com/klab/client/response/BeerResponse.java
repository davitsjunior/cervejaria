package br.com.klab.client.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BeerResponse {

	//private Long id;
	private String name;
	private long ibu; 
}
