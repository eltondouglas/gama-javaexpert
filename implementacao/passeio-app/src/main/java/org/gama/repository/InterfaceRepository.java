package com.gama.repository;

import java.util.List;

public interface InterfaceRepository<E> {
	
	public void incluir(E entidade);
	public E buscar(Integer id);
	public void alterar(E entidade);
	public List<E> listar();

}
