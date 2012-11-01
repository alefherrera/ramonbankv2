package com.ramonlabs.ramonbank.dbaccess;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "transferencias")
public class Transferencia extends TableBase<Transferencia> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name = "id")
	private int id;
	@Column(name = "Fecha")
	private Date fecha;
	@Column (name = "NroCuentaOrigen")
	private int idCuentaOrigen;
	@Column(name = "NroCuentaDestino")
	private int idCuentaDestino;
	@Column(name = "Interes")
	private double interes;
	@Column (name = "idCliente")
	private int idCliente;
	@Column (name = "idCuenta")
	private int idCuenta;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getFecha() {
		return fecha;
	}
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	public int getIdCuentaOrigen() {
		return idCuentaOrigen;
	}
	public void setIdCuentaOrigen(int idCuentaOrigen) {
		this.idCuentaOrigen = idCuentaOrigen;
	}
	public int getIdCuentaDestino() {
		return idCuentaDestino;
	}
	public void setIdCuentaDestino(int idCuentaDestino) {
		this.idCuentaDestino = idCuentaDestino;
	}
	public double getInteres() {
		return interes;
	}
	public void setInteres(double interes) {
		this.interes = interes;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public int getIdCuenta() {
		return idCuenta;
	}
	public void setIdCuenta(int idCuenta) {
		this.idCuenta = idCuenta;
	}
	
	
}
