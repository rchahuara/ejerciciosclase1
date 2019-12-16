package com.senati.camara;

public class Camara {
	String descripcion;
	String modelo;
	float precio;
	String marca;
	public Camara(String descripcion, String modelo, float precio, String marca) {
		super();
		this.descripcion = descripcion;
		this.modelo = modelo;
		this.precio = precio;
		this.marca = marca;
	}
	public Camara() {
		super();
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Camara [descripcion=" + descripcion + ", modelo=" + modelo + ", precio=" + precio + ", marca=" + marca
				+ "]";
	}
	
	
}
