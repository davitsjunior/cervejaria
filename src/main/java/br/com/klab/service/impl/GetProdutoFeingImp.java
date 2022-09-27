package br.com.klab.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.klab.client.BeerClient;
import br.com.klab.client.response.BeerResponse;
import br.com.klab.domain.entity.Produto;
import br.com.klab.service.GetProdutoFeing;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@Service
@AllArgsConstructor
public class GetProdutoFeingImp implements GetProdutoFeing{

	private final BeerClient beerClient;
	@Override
	public Produto buscarProduto() {
		
		Produto produto = new Produto();

		List<BeerResponse> beer = new ArrayList<>();

		beer = beerClient.getRandomBeer();

		produto.setName(beer.get(0).getName());
		produto.setIbu(beer.get(0).getIbu());
		produto.setPreco(beer.get(0).getIbu()*2);
		
		return produto;
	}

	
}
