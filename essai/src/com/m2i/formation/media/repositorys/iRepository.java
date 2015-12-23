package com.m2i.formation.media.repositorys;
import java.io.*;
import java.util.*;

import com.m2i.formation.media.entitys.IEntity;



public interface iRepository <T> {

	String getUri();

	void SetUri(String uri);

	List<T> getAll() throws IOException, Exception;

	T getById(int id) throws IOException;

	List<T> getByPrice(double price) throws IOException;

	List<T> getByTitle(String word) throws IOException;
	
	
// implements iRipository<Book>
}
