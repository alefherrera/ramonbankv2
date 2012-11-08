package com.ramonlabs.ramonbank.dbaccess;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "cuentas")
public class Cuenta extends TableBase<Cuenta> implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name = "id")
	private int id;
	@Column(name = "cliente_id")
	private int idCliente;
	@Column(name = "Tipo")
	private int tipo;
	@Column(name = "Estado")
	private boolean estado;
	@Column(name = "Saldo")
	private double saldo;
	@Column(name = "Descubierto")
	private double descubierto;
	@OneToMany(targetEntity=Movimiento.class,fetch=FetchType.EAGER,mappedBy="idCuenta")
	private Set<Movimiento> movimientos = new HashSet<Movimiento>(0);
	@OneToMany(targetEntity=PagoServicio.class,fetch=FetchType.EAGER,mappedBy="idServicio")
	private Set<PagoServicio> pagoServicios = new HashSet<PagoServicio>(0);
	@OneToMany(targetEntity=Prestamo.class,fetch=FetchType.EAGER,mappedBy="idCuenta")
	private Set<Prestamo> prestamos = new HashSet<Prestamo>(0);
	
	/*@ManyToOne
	@JoinColumn(name="idCliente")
	private Cliente cliente;*/
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdCliente() {
		return idCliente;
	}
	public void setIdCliente(int idCliente) {
		this.idCliente = idCliente;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public boolean isEstado() {
		return estado;
	}
	public void setEstado(boolean estado) {
		this.estado = estado;
	}
	public double getSaldo() {
		return saldo;
	}
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public double getDescubierto() {
		return descubierto;
	}
	public void setDescubierto(double descubierto) {
		this.descubierto = descubierto;
	}
	
	
}