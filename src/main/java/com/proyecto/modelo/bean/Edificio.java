package com.proyecto.modelo.bean;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the edificios database table.
 * 
 */
@Entity
@Table(name="edificios")
@NamedQuery(name="Edificio.findAll", query="SELECT e FROM Edificio e")
public class Edificio implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//@GeneratedValue(strategy=GenerationType.IDENTITY)

	@Id
	private String id;

	private String acceso;

	private String categoria;

	private String centro;

	private String cronologia;

	private String denominacion;

	@Lob
	private String descripcion;

	private String exposicion;

	private String formaDeIngreso;

	private String historia;

	private String objetoODocumento;

	private String otrasDenominaciones;

	private String procedencia;

	private String signatura;

	private String tecnicas;

	private String thumbnail;

	private String tipologia;

	private String ubicacionHabitual;

	private String volumen;

	//bi-directional many-to-one association to Arquitecto
	@ManyToOne
	@JoinColumn(name="Autores")
	private Arquitecto arquitecto;

	public Edificio() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAcceso() {
		return this.acceso;
	}

	public void setAcceso(String acceso) {
		this.acceso = acceso;
	}

	public String getCategoria() {
		return this.categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public String getCentro() {
		return this.centro;
	}

	public void setCentro(String centro) {
		this.centro = centro;
	}

	public String getCronologia() {
		return this.cronologia;
	}

	public void setCronologia(String cronologia) {
		this.cronologia = cronologia;
	}

	public String getDenominacion() {
		return this.denominacion;
	}

	public void setDenominacion(String denominacion) {
		this.denominacion = denominacion;
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getExposicion() {
		return this.exposicion;
	}

	public void setExposicion(String exposicion) {
		this.exposicion = exposicion;
	}

	public String getFormaDeIngreso() {
		return this.formaDeIngreso;
	}

	public void setFormaDeIngreso(String formaDeIngreso) {
		this.formaDeIngreso = formaDeIngreso;
	}

	public String getHistoria() {
		return this.historia;
	}

	public void setHistoria(String historia) {
		this.historia = historia;
	}

	public String getObjetoODocumento() {
		return this.objetoODocumento;
	}

	public void setObjetoODocumento(String objetoODocumento) {
		this.objetoODocumento = objetoODocumento;
	}

	public String getOtrasDenominaciones() {
		return this.otrasDenominaciones;
	}

	public void setOtrasDenominaciones(String otrasDenominaciones) {
		this.otrasDenominaciones = otrasDenominaciones;
	}

	public String getProcedencia() {
		return this.procedencia;
	}

	public void setProcedencia(String procedencia) {
		this.procedencia = procedencia;
	}

	public String getSignatura() {
		return this.signatura;
	}

	public void setSignatura(String signatura) {
		this.signatura = signatura;
	}

	public String getTecnicas() {
		return this.tecnicas;
	}

	public void setTecnicas(String tecnicas) {
		this.tecnicas = tecnicas;
	}

	public String getThumbnail() {
		return this.thumbnail;
	}

	public void setThumbnail(String thumbnail) {
		this.thumbnail = thumbnail;
	}

	public String getTipologia() {
		return this.tipologia;
	}

	public void setTipologia(String tipologia) {
		this.tipologia = tipologia;
	}

	public String getUbicacionHabitual() {
		return this.ubicacionHabitual;
	}

	public void setUbicacionHabitual(String ubicacionHabitual) {
		this.ubicacionHabitual = ubicacionHabitual;
	}

	public String getVolumen() {
		return this.volumen;
	}

	public void setVolumen(String volumen) {
		this.volumen = volumen;
	}

	public Arquitecto getArquitecto() {
		return this.arquitecto;
	}

	public void setArquitecto(Arquitecto arquitecto) {
		this.arquitecto = arquitecto;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!(obj instanceof Edificio))
			return false;
		Edificio other = (Edificio) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}