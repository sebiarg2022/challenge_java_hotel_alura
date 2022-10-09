package controller;

import java.sql.Connection;
import java.sql.Date;
import java.util.List;

import dao.ReservaDAO;
import factory.ConnectionFactory;
import model.Reserva;

public class ReservaController {
private ReservaDAO reservaDAO;   //llamamos a DAO que media controllers con las VIEWs
	
//llamamos a la conexion
public ReservaController() {
	Connection connection = new ConnectionFactory().recuperaConexion();
	this.reservaDAO = new ReservaDAO(connection);	
}
	
//metodo guardar q llama la view con objeto reserva
public void guardar(Reserva reserva) {
	this.reservaDAO.guardar(reserva); //llamamos a reservaDAO para que guarde el objeto reserva pasado en la view
}

public List<Reserva> buscar() {
	return this.reservaDAO.buscar();
}

public List<Reserva> buscarId(String id) {
	return this.reservaDAO.buscarId(id);
}

public void actualizar(Date fechaE, Date fechaS, String valor, String forma_pago, Integer id) {
	this.reservaDAO.Actualizar(fechaE, fechaS, valor, forma_pago, id);
}

public void Eliminar(Integer id) {
	this.reservaDAO.Eliminar(id);
}
}
