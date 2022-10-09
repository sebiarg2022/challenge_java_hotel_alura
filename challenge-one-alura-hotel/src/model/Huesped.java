package model;

import java.sql.Date;

public class Huesped {

	
	private Integer id;
	private String nombre;
	private String apellido;
	private Date fecha_nac;
	private String nacionalidad;
	private String telefono;
	private Integer id_reserva;
	
	
	
	
	
	
	public Huesped(String nombre, String apellido, Date fecha_nac, String nacionalidad, String telefono, Integer id_reserva) {
		this.nombre = nombre;
		this.apellido=apellido;
		this.fecha_nac = fecha_nac;
		this.nacionalidad = nacionalidad;
		this.telefono = telefono;
		this.id_reserva = id_reserva;
	}
	
	public Huesped(Integer id,String nombre, String apellido, Date fecha_nac, String nacionalidad, String telefono, Integer id_reserva) {
		this.id = id;
		this.nombre = nombre;
		this.apellido=apellido;
		this.fecha_nac = fecha_nac;
		this.nacionalidad = nacionalidad;
		this.telefono = telefono;
		this.id_reserva = id_reserva;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	
	public Integer getId() {
		return id;
	}
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	
	
	public Date getFecha_nac() {
		return fecha_nac;
	}
	public void setFecha_nac(Date fecha_nac) {
		this.fecha_nac = fecha_nac;
	}
	
	
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	
	
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	
	
	
	public Integer getId_reserva() {
		return id_reserva;
	}

	
	public void setId_reserva(Integer id_reserva) {
		this.id_reserva = id_reserva;
	}
	
}
