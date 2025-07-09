package com.MyAzienda.SpringJDBC.repositories;

import java.util.List;

public interface IRepositoryWrite<T> {
	
	// Scrittura -> Data Manipulation Language
	boolean create(T obj);
	boolean update(T obj);
	boolean delete(int id);

}
