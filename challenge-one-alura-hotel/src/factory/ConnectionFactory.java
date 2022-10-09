package factory;

import java.sql.Connection;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.mchange.v2.c3p0.ComboPooledDataSource;

public class ConnectionFactory {

    private DataSource dataSource;
    
    public ConnectionFactory() {
        ComboPooledDataSource pooledDataSource = new ComboPooledDataSource();
       //declaramos la url
        pooledDataSource.setJdbcUrl("jdbc:mysql://localhost/hotel_alura?useTimeZone=true&serverTimeZone=UTC");
       //usr de la BD
        pooledDataSource.setUser("root");
        //pass de la bd
        pooledDataSource.setPassword("Root1234");
        //maximos pool de conexion que puede existir
        pooledDataSource.setMaxPoolSize(10);
        
        this.dataSource = pooledDataSource;
    }

    public Connection recuperaConexion(){
    	//usamos try y catch y pasamos la excepcion directamente en la conexion
        try {
        	System.out.println("Recuperacion Conexion Exitosa");
			return this.dataSource.getConnection();
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
        
        //De esta forma no tenemos que en cada metodo que llama a recuperarConexion tenga que hacer la excepcion error
    }

}

