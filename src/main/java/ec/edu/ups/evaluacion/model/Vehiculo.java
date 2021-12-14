package ec.edu.ups.evaluacion.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Vehiculo implements Serializable{
	
	@Id
	@Column(name = "vehi_placa")
	private String placa;
	@Column(name = "vehi_marca")
	private String marca;
	@Column(name ="vehi_modelo")
	private String modelo;
	@Column(name="vehi_color")
	private String color;
	

	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
}
