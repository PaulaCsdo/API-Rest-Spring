package com.proyecto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.proyecto.modelo.bean.Arquitecto;
import com.proyecto.modelo.bean.Edificio;
import com.proyecto.modelo.dao.ArquitectoInt;
import com.proyecto.modelo.dao.EdificioInt;

@RestController
@RequestMapping("/rest")
public class EdificioController {
	
	@Autowired
	private ArquitectoInt arc;
	
	@Autowired
	private EdificioInt edi;
	
	@GetMapping("/verEdificios")
	public List<Edificio> verTodos(){
		return edi.findAll();
	}
	
	@GetMapping("/buscarEdificio/{denominacion}")
	public List<Edificio> buscar(@PathVariable ("denominacion") String denominacion){
		return edi.buscarPorNombre(denominacion);
	}
	
	@PostMapping("/altaArquitecto")
	public String darAltaArq(@RequestBody Arquitecto arquitecto){
		return (arc.insertar(arquitecto)==1)?"Alta realizada":"ERROR en alta";
	}
	
	@PostMapping("/altaEdificio")
	public String darAltaEdi(@RequestBody Edificio edificio){
		return (edi.insertar(edificio)==1)?"Alta realizada":"ERROR en alta";
	}
	
	@PutMapping("/modificar")
	public String modiEvento(@RequestBody Edificio edificio){
		return (edi.modificar(edificio)==1)?"Edificio modificado":"ERROR en modificar";
	}
	
	@DeleteMapping("/eliminar/{id}")
	public String eliminarUnEdificio(@PathVariable ("id") String id){
		return (edi.eliminar(id)==1)?"Eliminado":"NO eliminado";
	}

}
