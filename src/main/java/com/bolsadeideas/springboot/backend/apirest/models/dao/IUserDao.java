package com.bolsadeideas.springboot.backend.apirest.models.dao;

import org.springframework.data.repository.CrudRepository;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Users;

public interface IUserDao extends CrudRepository<Users, Long> {

	public Users findByUsername(String username);

//	alternativo, ?1 es una variable que sera remplazada por el argumento (username)

//	@Query("select u from Users u where u.username=?1")
//	public Users findByUsername2(String username);

}
