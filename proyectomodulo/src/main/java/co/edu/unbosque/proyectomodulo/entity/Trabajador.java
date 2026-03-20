package co.edu.unbosque.proyectomodulo.entity;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public abstract class Trabajador extends Persona {

	private double salario;

	public Trabajador() {
		// TODO Auto-generated constructor stub
	}

	public Trabajador(double salario) {
		super();
		this.salario = salario;
	}

	public Trabajador(String usuario, String contrasenia, double salario) {
		super(usuario, contrasenia);
		this.salario = salario;
	}

	public Trabajador(String usuario, String contrasenia) {
		super(usuario, contrasenia);
		// TODO Auto-generated constructor stub
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	@Override
	public String toString() {
		return " |Trabajador| Salario: " + salario;
	}

}
