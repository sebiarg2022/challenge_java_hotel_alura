package model;

import java.sql.Date;

public class Reserva {

	
	private Integer id;
	private Date fecha_entrada;
	private Date fecha_salida;
	private String valor;
	private String forma_pago;
	
	
	
	//no pongo el id porq es auto increment en la BD
	public Reserva(Date fecha_entrada, Date fecha_salida, String valor, String forma_pago) {
		super();
		this.fecha_entrada = fecha_entrada;
		this.fecha_salida = fecha_salida;
		this.valor = valor;
		this.forma_pago = forma_pago;
	}
	
	
	//para futuras busquedas traigo todo los campos 
	public Reserva(Integer id, Date fecha_entrada, Date fecha_salida, String valor, String forma_pago) {
		super();
		this.id = id;
		this.fecha_entrada = fecha_entrada;
		this.fecha_salida = fecha_salida;
		this.valor = valor;
		this.forma_pago = forma_pago;
	}



	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	
	public Date getFecha_entrada() {
		return fecha_entrada;
	}
	public void setFecha_entrada(Date fecha_entrada) {
		this.fecha_entrada = fecha_entrada;
	}
	
	
	public Date getFecha_salida() {
		return fecha_salida;
	}
	public void setFecha_salida(Date fecha_salida) {
		this.fecha_salida = fecha_salida;
	}
	
	
	public String getValor() {
		return valor;
	}
	public void setValor(String valor) {
		this.valor = valor;
	}
	
	
	public String getForma_pago() {
		return forma_pago;
	}
	public void setForma_pago(String forma_pago) {
		this.forma_pago = forma_pago;
	}
	
	
}
