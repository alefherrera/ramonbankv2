package com.ramonlabs.ramonbank.dbaccess;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "prestamos")
public class Servicios extends TableBase<Servicios> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name = "id")
	private int id;
	@Column(name = "Descripcion")
	private String descripcion;
	@Column(name = "MontoFijo")
	private double monto;
	@OneToMany(targetEntity=PagoServicio.class,fetch=FetchType.EAGER,mappedBy="idServicio")
	private Set<PagoServicio> pagoServicios = new HashSet<PagoServicio>(0);
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public double getMonto() {
		return monto;
	}
	public void setMonto(double monto) {
		this.monto = monto;
	}
}
