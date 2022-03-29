package com.proyecto.modelo.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.proyecto.modelo.bean.Edificio;
import com.proyecto.repository.EdificioRepository;

@Repository
public class EdificioImpl implements EdificioInt{

	@Autowired
	private EdificioRepository erepo;
	
	@Override
	public List<Edificio> findAll() {
		return erepo.findAll();
	}

	@Override
	public int insertar(Edificio edificio) {
		if(verUno(edificio.getId())!=null) {
			erepo.save(edificio);
			return 1;
		}else {
			return 0;
		}
	}

	@Override
	public int modificar(Edificio edificio) {
		if(verUno(edificio.getId())!=null) {
			erepo.save(edificio);
			return 1;
		}else {
			return 0;
		}
	}

	@Override
	public int eliminar(String id) {
		if(verUno(id)!=null) {
			erepo.deleteById(id);
			return 1;
		}else {
			return 0;
		}
	}

	@Override
	public List<Edificio> buscarPorNombre(String denominacion) {
		// TODO Auto-generated method stub
		return erepo.buscarPorNombre(denominacion);
	}

	@Override
	public Edificio verUno(String id) {
		// TODO Auto-generated method stub
		return erepo.findById(id).orElse(null);
	}

}
