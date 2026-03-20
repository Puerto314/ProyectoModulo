package co.edu.unbosque.proyectomodulo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "admin")
public class Admin extends Trabajador {

	private String codigoAdmin;

	public Admin() {
		// TODO Auto-generated constructor stub
	}

	public Admin(double salario) {
		super(salario);
		// TODO Auto-generated constructor stub
	}

	public Admin(String usuario, String contrasenia, double salario) {
		super(usuario, contrasenia, salario);
		// TODO Auto-generated constructor stub
	}

	public Admin(String usuario, String contrasenia) {
		super(usuario, contrasenia);
		// TODO Auto-generated constructor stub
	}

	public Admin(String usuario, String contrasenia, String codigoAdmin) {
		super(usuario, contrasenia);
		this.codigoAdmin = codigoAdmin;
	}

	public Admin(String usuario, String contrasenia, double salario, String codigoAdmin) {
		super(usuario, contrasenia, salario);
		this.codigoAdmin = codigoAdmin;
	}

	public Admin(double salario, String codigoAdmin) {
		super(salario);
		this.codigoAdmin = codigoAdmin;
	}

	public Admin(String codigoAdmin) {
		super();
		this.codigoAdmin = codigoAdmin;
	}

	public String getCodigoAdmin() {
		return codigoAdmin;
	}

	public void setCodigoAdmin(String codigoAdmin) {
		this.codigoAdmin = codigoAdmin;
	}

	@Override
	public String toString() {
		return " |Admin| Código: " + codigoAdmin;
	}

}
