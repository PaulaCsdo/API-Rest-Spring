package com.proyecto.modelo.dao;

import java.util.List;

import com.proyecto.modelo.bean.Edificio;
public interface EdificioInt {
	
	List<Edificio> findAll();
	Edificio verUno (String id);
	int insertar (Edificio edificio);
	int modificar (Edificio edificio);
	int eliminar (String id);
	List<Edificio> buscarPorNombre (String denominacion);

	

}
