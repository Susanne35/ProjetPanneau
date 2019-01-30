package fr.panneauaffichage.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import fr.panneauaffichage.dal.DALException;



public class DbbConnexion {
	
	public static Connection getConnection() throws DALException{
		
		String url = ParametreC.lire("dbUrl");
		String user = ParametreC.lire("dbUser");
		String password = ParametreC.lire("dbPassword");
		Connection connection = null;
		
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			//DriverManager.registerDriver(new SQLServerDriver());
			connection =  DriverManager.getConnection(url, user, password);
		} catch (ClassNotFoundException e) {
			throw new DALException("Probleme de chargement du driver "+e.getMessage());
		} catch (SQLException e1){
			throw new DALException("Probleme de connexion "+e1.getMessage());
		}
		return connection;		
	}

	
}

