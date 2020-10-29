package com.cdao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.domain.User;

@Repository
public interface IreadDao extends CrudRepository<User, Integer> {

	/* Select all records */
	public List<User> findAll();

}

//long count()
//void delete(T entity)
//void deleteAll()
//void deleteAll(Iterable<? extends T> entities)
//void deleteById(ID id)
//boolean existsById(ID id)
//Iterable<T> findAll()
//Iterable<T> findAllById(Iterable<ID> ids)
//Optional<T> findById(ID id)
//<S extends T>S save(S entity)
//<S extends T>Iterable<S> saveAll(Iterable<S> entities)
