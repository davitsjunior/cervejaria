package br.com.klab.rest.controller;

import static org.springframework.http.HttpStatus.*;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.klab.domain.entity.Produto;
import br.com.klab.service.GetProdutoFeing;
import br.com.klab.service.ProdutoService;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping("/api/produtos")
@Data
public class ProdutoController {
	
	private final ProdutoService produtoService; 
	private final GetProdutoFeing getProdutoFeing;
		
	@PostMapping
	@ResponseStatus(CREATED)
	public Produto save() { 
		
		Produto p = getProdutoFeing.buscarProduto();
		return produtoService.save(p);
	}
	
	@PutMapping("{id}")
	@ResponseStatus(OK)
	public void update(@PathVariable Integer id, @RequestBody Produto produto) {
		
		produtoService.update(id, produto);
	}
	
	@DeleteMapping("{id}")
	@ResponseStatus(OK)
	public void deleteById(@PathVariable Integer id) {
		
		produtoService.deleteById(id);
	}
	
	@GetMapping("{id}")
	public ResponseEntity<Produto> findById(@PathVariable Integer id) {
		
		return ResponseEntity.ok(produtoService.findById(id));
	}
}
