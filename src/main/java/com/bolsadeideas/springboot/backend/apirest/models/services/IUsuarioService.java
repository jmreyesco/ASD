package com.bolsadeideas.springboot.backend.apirest.models.services;

import com.bolsadeideas.springboot.backend.apirest.models.entity.Users;

public interface IUsuarioService {

	public Users findByUsername(String username);

}
