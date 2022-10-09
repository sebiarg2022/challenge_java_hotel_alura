package controller;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

import dao.HuespedDAO;
import factory.ConnectionFactory;
import model.Huesped;


public class HuespedController {
private HuespedDAO huespedDAO;   //llamamos a DAO que media controllers con las VIEWs
			
		//llamamos a la conexion
		public HuespedController() {
	Connection connection = new ConnectionFactory().recuperaConexion();
	this.huespedDAO = new HuespedDAO(connection);	
	}
			
	//metodo guardar q llama la view con objeto reserva
	public void guardar(Huesped huesped) {
		this.huespedDAO.guardar(huesped); //llamamos a huespedDAO para que guarde el objeto huesped pasado en la view
	}

	public List<Huesped> listarHuespedes() {
		return this.huespedDAO.listarHuespedes();
	}
	
	public List<Huesped> listarHuespedesId(String id) {
		return this.huespedDAO.buscarId(id);
	}
	
	public void actualizar(String nombre, String apellido, Date fecha_nac, String nacionalidad, String telefono, Integer id_reserva, Integer id) {
		this.huespedDAO.Actualizar(nombre, apellido, fecha_nac, nacionalidad, telefono, id_reserva, id);
	}
	
	public void Eliminar(Integer id) {
		this.huespedDAO.Eliminar(id);
	}
}
