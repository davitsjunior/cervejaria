package br.com.klab.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.klab.client.response.BeerResponse;
import br.com.klab.domain.entity.Produto;
import br.com.klab.domain.repository.Produtos;
import br.com.klab.exception.RegraNegocioException;
import br.com.klab.service.ProdutoService;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
@Data
public class ProdutoServiceImpl implements ProdutoService {

	
	private final Produtos produtos;

	@Override
	public Produto save(Produto p) {//Princípio da Responsabildiade única (refatorar)

		produtos.save(p); 

		return p;
	}

	@Override
	public void deleteById(Integer id) {

		produtos.findById(id)
		.map(p ->{
			produtos.deleteById(id) ;
			return Void.TYPE;
		}).orElseThrow(() -> new RegraNegocioException("Produto não encontrado!"));

	}

	@Override
	public Produto update(Integer id, Produto produto) {
		
		return produtos.findById(id)
		.map(p -> {
			produto.setId(p.getId());
			produtos.save(produto);
			return p;
		}).orElseThrow(() -> new RegraNegocioException("Produto não encontrado!"));
		
	} 
 
	@Override
	public Produto findById(Integer id) {
		
		return produtos.findById(id)
				.orElseThrow(() -> new RegraNegocioException("Produto não encontrado!"));
	}

	@Override
	public List<BeerResponse> getBeer() {
		// TODO Auto-generated method stub
		return null;
	}
}


