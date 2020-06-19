package com.corinto.demoajax.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.corinto.demoajax.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {

}
