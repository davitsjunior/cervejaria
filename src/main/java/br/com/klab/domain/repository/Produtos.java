package br.com.klab.domain.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.klab.domain.entity.Produto;

public interface Produtos extends JpaRepository<Produto, Integer> {

}
