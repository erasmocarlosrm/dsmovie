package com.devsuperior.dsmovie.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsmovie.entidade.Filme;

public interface FilmeRepositorio extends JpaRepository<Filme, Long> {

}
