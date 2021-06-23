package com.bolsadeideas.springboot.backend.apirest.models.services;

import java.util.List;
import java.util.stream.Collectors;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bolsadeideas.springboot.backend.apirest.models.dao.IUserDao;
import com.bolsadeideas.springboot.backend.apirest.models.entity.Users;

//import com.tsbook.app.models.dao.IUserDao;
//import com.tsbook.app.models.entity.User;
//import com.tsbook.app.models.entity.Users;

@Service
public class UserService implements IUsuarioService, UserDetailsService {

	private Logger logger = LoggerFactory.getLogger(UserService.class);

	@Autowired
	private IUserDao userDao;

	@Override
	@Transactional(readOnly = true)
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub

		Users users = userDao.findByUsername(username);

		if (users == null) {
			logger.error("Error en el login: no existe usurio '" + username + "' en el sistema");
			throw new UsernameNotFoundException("Error en el login: no existe usurio '" + username + "' en el sistema");
		}

		List<GrantedAuthority> authorities = users.getRoles().stream()
				.map(role -> new SimpleGrantedAuthority(role.getNombre()))
				.peek(authority -> logger.info("Role: " + authority.getAuthority())).collect(Collectors.toList());
// .map(role -> {return new SimpleGrantedAuthority(role.getNombre());})				
		return new User(users.getUsername(), users.getPassword(), users.getEnabled(), true, true, true, authorities);
	}

	@Override
	@Transactional(readOnly = true)
	public Users findByUsername(String username) {
		return userDao.findByUsername(username);
	}

}
