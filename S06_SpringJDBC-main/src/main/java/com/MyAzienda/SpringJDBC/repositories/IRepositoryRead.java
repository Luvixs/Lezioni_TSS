package com.MyAzienda.SpringJDBC.repositories;

import java.util.List;

public interface IRepositoryRead<T> {
	
	// Lettura -> Query Language
	T getById(int id);
	List<T> getAll();
	

}
