package com.proyecto.modelo.bean;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the arquitectos database table.
 * 
 */
@Entity
@Table(name="arquitectos")
@NamedQuery(name="Arquitecto.findAll", query="SELECT a FROM Arquitecto a")
public class Arquitecto implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	private String arquitecto;

	@Column(name="num_colegiado")
	private String numColegiado;

	//bi-directional many-to-one association to Edificio
	@OneToMany(mappedBy="arquitecto")
	private List<Edificio> edificios;

	public Arquitecto() {
	}

	public String getArquitecto() {
		return this.arquitecto;
	}

	public void setArquitecto(String arquitecto) {
		this.arquitecto = arquitecto;
	}

	public String getNumColegiado() {
		return this.numColegiado;
	}

	public void setNumColegiado(String numColegiado) {
		this.numColegiado = numColegiado;
	}

//	public List<Edificio> getEdificios() {
//		return this.edificios;
//	}
//
//	public void setEdificios(List<Edificio> edificios) {
//		this.edificios = edificios;
//	}

//	public Edificio addEdificio(Edificio edificio) {
//		getEdificios().add(edificio);
//		edificio.setArquitecto(this);
//
//		return edificio;
//	}
//
//	public Edificio removeEdificio(Edificio edificio) {
//		getEdificios().remove(edificio);
//		edificio.setArquitecto(null);
//
//		return edificio;
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((arquitecto == null) ? 0 : arquitecto.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Arquitecto))
			return false;
		Arquitecto other = (Arquitecto) obj;
		if (arquitecto == null) {
			if (other.arquitecto != null)
				return false;
		} else if (!arquitecto.equals(other.arquitecto))
			return false;
		return true;
	}
	
	

}