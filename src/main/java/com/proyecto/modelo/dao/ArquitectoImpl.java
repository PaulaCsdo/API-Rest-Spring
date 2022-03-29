package com.proyecto.modelo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.proyecto.modelo.bean.Arquitecto;
import com.proyecto.repository.ArquitectoRepository;

@Repository
public class ArquitectoImpl implements ArquitectoInt{

	@Autowired
	private ArquitectoRepository arepo;
	
	@Override
	public List<Arquitecto> findAll() {
		return arepo.findAll();
	}

	@Override
	public int insertar(Arquitecto arquitect) {
		if(verUno(arquitect.getArquitecto())==null) {
			arepo.save(arquitect);
			return 1;
		}else {
			return 0;
		}		
	}

	@Override
	public int modificar(Arquitecto arquitect) {
		if(verUno(arquitect.getArquitecto())!=null) {
			arepo.save(arquitect);
			return 1;
		}else {
			return 0;
		}
	}

	@Override
	public int eliminar(String arquitecto) {
		if(verUno(arquitecto)!=null) {
			arepo.deleteById(arquitecto);
			return 1;
		}else {
			return 0;
		}
	}

	@Override
	public Arquitecto verUno(String arquitecto) {
		return arepo.findById(arquitecto).orElse(null);
	}

}
