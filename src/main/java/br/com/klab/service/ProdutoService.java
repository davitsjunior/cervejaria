package br.com.klab.service;

import java.util.List;

import br.com.klab.client.response.BeerResponse;
import br.com.klab.domain.entity.Produto;

public interface ProdutoService {
	
	List<BeerResponse> getBeer();
	
	Produto update(Integer id, Produto produto);
	
	Produto save(Produto produto);
	
	void deleteById(Integer id);
	
	Produto findById(Integer id);
}



