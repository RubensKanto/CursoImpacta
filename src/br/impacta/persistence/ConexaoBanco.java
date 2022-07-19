package br.impacta.persistence;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoBanco {
	
	//private static String USERNAME = "root";
	//private static String PASSWORD = "root";
	private static String USERNAME = "uubsjpgkeacq3amk";
	private static String PASSWORD = "KvYTi42faV1vxIWLg856";
	
	//private static String DATABASE_URL = "jdbc:mysql://localhost:3306/programador?useTimezone=true&serverTimezone=UTC";
	private static String DATABASE_URL = "jdbc:mysql://bp1c1smulikg13sbvuft-mysql.services.clever-cloud.com:3306/bp1c1smulikg13sbvuft?useTimezone=true&serverTimezone=UTC";
	
	public static Connection criaConexaoComMySql() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection(DATABASE_URL,USERNAME,PASSWORD);
		
		return connection;
	}

}
