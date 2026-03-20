package co.edu.unbosque.proyectomodulo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "conductor")
public class Conductor extends Trabajador {

	private String tipoVehiculo;

	public Conductor() {
		// TODO Auto-generated constructor stub
	}

	public Conductor(String tipoVehiculo) {
		super();
		this.tipoVehiculo = tipoVehiculo;
	}

	public Conductor(double salario) {
		super(salario);
		// TODO Auto-generated constructor stub
	}

	public Conductor(String usuario, String contrasenia, double salario) {
		super(usuario, contrasenia, salario);
		// TODO Auto-generated constructor stub
	}

	public Conductor(String usuario, String contrasenia) {
		super(usuario, contrasenia);
		// TODO Auto-generated constructor stub
	}

	public Conductor(String usuario, String contrasenia, String tipoVehiculo) {
		super(usuario, contrasenia);
		this.tipoVehiculo = tipoVehiculo;
	}

	public Conductor(String usuario, String contrasenia, double salario, String tipoVehiculo) {
		super(usuario, contrasenia, salario);
		this.tipoVehiculo = tipoVehiculo;
	}

	public Conductor(double salario, String tipoVehiculo) {
		super(salario);
		this.tipoVehiculo = tipoVehiculo;
	}

	public String getTipoVehiculo() {
		return tipoVehiculo;
	}

	public void setTipoVehiculo(String tipoVehiculo) {
		this.tipoVehiculo = tipoVehiculo;
	}

	@Override
	public String toString() {
		return " |Conductor| Tipo de vehículo: " + tipoVehiculo;
	}

}
