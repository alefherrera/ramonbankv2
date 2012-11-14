package com.ramonlabs.ramonbank.dbaccess;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

import utils.Enums;

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
	@Column(name = "Activo")
	private boolean activo;
	
	/*@ManyToOne
	@JoinColumn(name="idCliente")
	private Cliente cliente;*/
	
	public String getTipo_nombre() {
		return Enums.TIPO_CUENTA.get_enum(this.tipo).getNombre();
	}

	public String getNombre_combo(){
		return Enums.TIPO_CUENTA.get_enum(this.tipo).getNombre() + " " + String.valueOf(this.getSaldo());
	}
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
	public Set<Movimiento> getMovimientos() {
		return movimientos;
	}
	public void setMovimientos(Set<Movimiento> movimientos) {
		this.movimientos = movimientos;
	}
	public Set<PagoServicio> getPagoServicios() {
		return pagoServicios;
	}
	public void setPagoServicios(Set<PagoServicio> pagoServicios) {
		this.pagoServicios = pagoServicios;
	}
	public Set<Prestamo> getPrestamos() {
		return prestamos;
	}
	public void setPrestamos(Set<Prestamo> prestamos) {
		this.prestamos = prestamos;
	}
	public boolean isActivo() {
		return activo;
	}
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
	
	public void Copy(Cuenta cuenta){
		this.id = cuenta.id;
		this.idCliente = cuenta.idCliente;
		this.tipo = cuenta.tipo;
		this.estado = cuenta.estado;
		this.saldo = cuenta.saldo;
		this.descubierto = cuenta.descubierto;
		this.activo = cuenta.activo;
	}
}
