package br.com.klab.domain.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor

@Entity
public class Produto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@NotNull(message = "Nome obrigatório")
	@Column(name = "name")
	private String name;

	@NotNull(message = "IBU obrigatório")
	@Column(name = "ibu")
	private long ibu;

	@NotNull(message = "Preço obrigatório")
	@Column(name = "preco")
	private double preco;
}
