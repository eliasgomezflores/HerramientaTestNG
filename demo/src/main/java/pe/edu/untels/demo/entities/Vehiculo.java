package pe.edu.untels.demo.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

@Entity
@Table(name = "Vehiculo")
public class Vehiculo implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idVehiculo;

	@Column(name = "licensePlateVehiculo", length = 60, nullable = false)
	private String licensePlateVehiculo;

	@Column(name = "manufacturingDateVehiculo")
	@JsonSerialize(using = ToStringSerializer.class)
	private LocalDate manufacturingDateVehiculo;

	@ManyToOne
	@JoinColumn(name = "idPropietario", nullable = false)
	private Propietario propietario;

	public Vehiculo(int idVehiculo, String licensePlateVehiculo, LocalDate manufacturingDateVehiculo, Propietario propietario) {
		this.idVehiculo = idVehiculo;
		this.licensePlateVehiculo = licensePlateVehiculo;
		this.manufacturingDateVehiculo = manufacturingDateVehiculo;
		this.propietario = propietario;
	}

	public Vehiculo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getIdVehiculo() {
		return idVehiculo;
	}

	public void setIdVehiculo(int idVehiculo) {
		this.idVehiculo = idVehiculo;
	}

	public String getLicensePlateVehiculo() {
		return licensePlateVehiculo;
	}

	public void setLicensePlateVehiculo(String licensePlateVehiculo) {
		this.licensePlateVehiculo = licensePlateVehiculo;
	}

	public LocalDate getManufacturingDateVehiculo() {
		return manufacturingDateVehiculo;
	}

	public void setManufacturingDateVehiculo(LocalDate manufacturingDateVehiculo) {
		this.manufacturingDateVehiculo = manufacturingDateVehiculo;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

}
