package co.edu.unbosque.proyectomodulo.entity;

import java.util.Objects;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "paquete")
public class Paquete {

	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) long id;
	private String tipoPaquete;
	private String contenido;
	private double precio;
	private double tiempoEntregaMaximo;

	public Paquete() {
		// TODO Auto-generated constructor stub
	}

	public Paquete(String tipoPaquete, String contenido, double precio, double tiempoEntregaMaximo) {
		super();
		this.tipoPaquete = tipoPaquete;
		this.contenido = contenido;
		this.precio = precio;
		this.tiempoEntregaMaximo = tiempoEntregaMaximo;
	}

	public String getTipoPaquete() {
		return tipoPaquete;
	}

	public void setTipoPaquete(String tipoPaquete) {
		this.tipoPaquete = tipoPaquete;
	}

	public String getContenido() {
		return contenido;
	}

	public void setContenido(String contenido) {
		this.contenido = contenido;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public double getTiempoEntregaMaximo() {
		return tiempoEntregaMaximo;
	}

	public void setTiempoEntregaMaximo(double tiempoEntregaMaximo) {
		this.tiempoEntregaMaximo = tiempoEntregaMaximo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Paquete other = (Paquete) obj;
		return id == other.id;
	}

	@Override
	public String toString() {
		return " |Paquete| Tipo de paquete: " + tipoPaquete + " Contenido: " + contenido + " Precio: " + precio
				+ " Tiempo de entrega máximo: " + tiempoEntregaMaximo;
	}

}
