package co.edu.unbosque.proyectomodulo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente extends Persona {

	private String direccion;
	private String cedula;
	private String tipoCliente;

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public Cliente(String direccion, String cedula, String tipoCliente) {
		super();
		this.direccion = direccion;
		this.cedula = cedula;
		this.tipoCliente = tipoCliente;
	}

	public Cliente(String usuario, String contrasenia, String direccion, String cedula, String tipoCliente) {
		super(usuario, contrasenia);
		this.direccion = direccion;
		this.cedula = cedula;
		this.tipoCliente = tipoCliente;
	}

	public Cliente(String usuario, String contrasenia) {
		super(usuario, contrasenia);
		// TODO Auto-generated constructor stub
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

	public String getTipoCliente() {
		return tipoCliente;
	}

	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}

	@Override
	public String toString() {
		return "Cliente [direccion=" + direccion + ", cedula=" + cedula + ", tipoCliente=" + tipoCliente + "]";
	}

}
