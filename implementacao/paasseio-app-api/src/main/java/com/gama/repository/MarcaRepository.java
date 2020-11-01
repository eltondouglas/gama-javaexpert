package com.gama.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.gama.model.Marca;

public interface MarcaRepository extends CrudRepository<Marca, Integer>{

	
	public Marca findByNome(String nome);
	
	public List<Marca> findByNomeContaining(String nome);
}
