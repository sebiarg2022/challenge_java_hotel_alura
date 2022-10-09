package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Huesped;



public class HuespedDAO {

private Connection connection;
	
	public HuespedDAO(Connection connection) {
		this.connection = connection;
	}
	
	//guardar pasamos objeto del huesped
	public void guardar(Huesped huesped) {
		
		try {
			
			String sqlInsert = " INSERT INTO huespedes(nombre,apellido,fecha_nac,nacionalidad,telefono,id_reserva"
					+ ")"
					+ " VALUES (?,?,?,?,?,?)";
			
			   //pasamos query + sentencia parallaves generadas
			try (PreparedStatement pstm = connection.prepareStatement(sqlInsert, Statement.RETURN_GENERATED_KEYS)) {
				//valores q va a guardar traemos de clae Reserva con los get
				pstm.setString(1, huesped.getNombre());
				pstm.setString(2, huesped.getApellido());
				pstm.setDate(3, huesped.getFecha_nac());
				pstm.setString(4, huesped.getNacionalidad());
				pstm.setString(5, huesped.getTelefono());
				pstm.setInt(6, huesped.getId_reserva());
				
				pstm.executeUpdate();
				//agarramos las llaves generadas
				try(ResultSet rst = pstm.getGeneratedKeys()){
					
					while(rst.next()) {
						huesped.setId(rst.getInt(1));
				
	     /*       pstm.execute();

	            final ResultSet resultSet = pstm.getGeneratedKeys();

	            try (resultSet) {
	                while (resultSet.next()) {
	                    huesped.setId(resultSet.getInt(1));
	                    
	                    System.out.println(String.format("Fue insertado el huesped: %s Correctamente",huesped));
						
			*/		
				}
			}
			}
		}catch(SQLException e) {
			throw new RuntimeException(e);
		}
	
	}

	public List<Huesped> listarHuespedes() {
		List<Huesped> huesped = new ArrayList<Huesped>();
		try {
			String sql = "SELECT id, nombre, apellido, fecha_nac, nacionalidad, telefono, id_reserva FROM huespedes";

			try (PreparedStatement pstm = connection.prepareStatement(sql)) {
				pstm.execute();

				transformarResultSetEnHuesped(huesped, pstm);
			}
			return huesped;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public List<Huesped> buscarId(String id) {
		List<Huesped> huesped = new ArrayList<Huesped>();
		try {

			String sql = "SELECT id, nombre, apellido, fecha_nac, nacionalidad, telefono, id_reserva FROM huespedes WHERE idReserva = ?";

			try (PreparedStatement pstm = connection.prepareStatement(sql)) {
				pstm.setString(1, id);
				pstm.execute();

				transformarResultSetEnHuesped(huesped, pstm);
			}
			return huesped;
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	public void Actualizar(String nombre, String apellido, Date fecha_nac, String nacionalidad, String telefono, Integer id_reserva, Integer id) {
		try (PreparedStatement stm = connection
				.prepareStatement("UPDATE huespedes SET nombre = ?, apellido = ?, fecha_nac = ?, nacionalidad = ?, telefono = ?, id_reserva = ? WHERE id = ?")) {
			stm.setString(1, nombre);
			stm.setString(2, apellido);
			stm.setDate(3, fecha_nac);
			stm.setString(4, nacionalidad);
			stm.setString(5, telefono);
			stm.setInt(6, id_reserva);
			stm.setInt(7, id);
			stm.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	public void Eliminar(Integer id) {
		try (PreparedStatement stm = connection.prepareStatement("DELETE FROM huespedes WHERE id = ?")) {
			stm.setInt(1, id);
			stm.execute();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	
	private void transformarResultSetEnHuesped(List<Huesped> reservas, PreparedStatement pstm) throws SQLException {
		try (ResultSet rst = pstm.getResultSet()) {
			while (rst.next()) {
				Huesped huesped = new Huesped(rst.getInt(1), rst.getString(2), rst.getString(3), rst.getDate(4), rst.getString(5), rst.getString(6), rst.getInt(7));
				reservas.add(huesped);
			}
		}				
	}
	
	
		
}



