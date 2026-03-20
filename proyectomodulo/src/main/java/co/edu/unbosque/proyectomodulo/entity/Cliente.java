package co.edu.unbosque.proyectomodulo.entity;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Cliente extends Persona {

	private double tarifa;
	private String direccion;
	private String cedula;
	private double descuento;

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String usuario, String contrasenia) {
		super(usuario, contrasenia);
		// TODO Auto-generated constructor stub
	}

	public Cliente(double tarifa, String direccion, String cedula, double descuento) {
		super();
		this.tarifa = tarifa;
		this.direccion = direccion;
		this.cedula = cedula;
		this.descuento = descuento;
	}

	public Cliente(String usuario, String contrasenia, double tarifa, String direccion, String cedula,
			double descuento) {
		super(usuario, contrasenia);
		this.tarifa = tarifa;
		this.direccion = direccion;
		this.cedula = cedula;
		this.descuento = descuento;
	}

	public double getTarifa() {
		return tarifa;
	}

	public void setTarifa(double tarifa) {
		this.tarifa = tarifa;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public double getDescuento() {
		return descuento;
	}

	public void setDescuento(double descuento) {
		this.descuento = descuento;
	}

	@Override
	public String toString() {
		return " |Cliente| Tarifa: " + tarifa + " Dirección: " + direccion + " Cédula: " + cedula + " Descuento: "
				+ descuento;
	}

}
