package com.proyecto.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.proyecto.modelo.bean.Edificio;


public interface EdificioRepository extends JpaRepository<Edificio, String>{
	
	@Query ("select e from Edificio e Where e.denominacion like %?1%")
	
	public List<Edificio> buscarPorNombre (String denominacion);

}
