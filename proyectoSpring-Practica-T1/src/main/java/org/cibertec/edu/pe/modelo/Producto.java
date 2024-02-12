package org.cibertec.edu.pe.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "producto")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int codigo;
	private String descripcion;
	private double pCompra;
	private double pVenta;
	private int existencia;
	
		
	public Producto() {
	}


	public Producto(int id, int codigo, String descripcion, double pCompra, double pVenta, int existencia) {
		this.id = id;
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.pCompra = pCompra;
		this.pVenta = pVenta;
		this.existencia = existencia;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getCodigo() {
		return codigo;
	}


	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public double getpCompra() {
		return pCompra;
	}


	public void setpCompra(double pCompra) {
		this.pCompra = pCompra;
	}


	public double getpVenta() {
		return pVenta;
	}


	public void setpVenta(double pVenta) {
		this.pVenta = pVenta;
	}


	public int getExistencia() {
		return existencia;
	}


	public void setExistencia(int existencia) {
		this.existencia = existencia;
	}
	
	

}
