package com.proyecto.modelo.dao;

import java.util.List;

import com.proyecto.modelo.bean.Arquitecto;


public interface ArquitectoInt {
	
	List <Arquitecto> findAll();
	Arquitecto verUno (String arquitecto);
	int insertar (Arquitecto arquitect);
	int modificar (Arquitecto arquitect);
	int eliminar (String arquitecto);	

}
