package com.autoecole.frame;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnexionDB {

	Connection conn = null;
	public static 	Connection Conection() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost/auto_ecole","root","");
			if(conn!=null)
				System.out.println("connexion réussi");
            else 
			System.out.println("echec");
			return conn; 	
			
		}catch(Exception e) {
			System.out.println("SQL Exception" +e);
			return null; 
		}
	
		
	}

}
