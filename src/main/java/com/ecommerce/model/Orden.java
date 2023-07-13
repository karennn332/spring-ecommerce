package com.ecommerce.model;

import java.util.Date;

public class Orden {
	private Integer id;
	private String numero;
	private Date fechaCreacion;
	private Date echaRecibida;
	private Double total;
	
	public Orden() {
	}

	public Orden(Integer id, String numero, Date fechaCreacion, Date echaRecibida, Double total) {
		super();
		this.id = id;
		this.numero = numero;
		this.fechaCreacion = fechaCreacion;
		this.echaRecibida = echaRecibida;
		this.total = total;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public Date getEchaRecibida() {
		return echaRecibida;
	}

	public void setEchaRecibida(Date echaRecibida) {
		this.echaRecibida = echaRecibida;
	}

	public Double getTotal() {
		return total;
	}

	public void setTotal(Double total) {
		this.total = total;
	}

	@Override
	public String toString() {
		return "Orden [id=" + id + ", numero=" + numero + ", fechaCreacion=" + fechaCreacion + ", echaRecibida="
				+ echaRecibida + ", total=" + total + "]";
	}
	
	
	
  
	
}
