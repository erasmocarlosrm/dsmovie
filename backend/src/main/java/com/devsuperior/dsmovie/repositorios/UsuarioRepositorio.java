package com.devsuperior.dsmovie.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entidade.Nota;
import com.devsuperior.dsmovie.entidade.NotaPK;
import com.devsuperior.dsmovie.entidade.Usuario;

public interface UsuarioRepositorio extends JpaRepository<Usuario, NotaPK> {
	
	Usuario findByEmail (String emailString);

	
}
