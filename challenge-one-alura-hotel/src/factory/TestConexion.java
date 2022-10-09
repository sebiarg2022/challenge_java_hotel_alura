package factory;

import java.sql.Connection;
import java.sql.SQLException;

public class TestConexion {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection conexion = connectionFactory.recuperaConexion();
		
		System.out.println("Cerrando conexion");
		
		conexion.close();
	}
	
}
