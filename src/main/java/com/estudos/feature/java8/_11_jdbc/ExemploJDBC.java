package com.estudos.feature.java8._11_jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExemploJDBC {
	
	 public static void main(String[] args) {
	        Connection conn = null;

	        try {
	            // Carregar o driver JDBC para MySQL
	        	//utilizando java 5
	            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	            
	            //a partir do java 8
	            //driver a partir do próprio fornecedor do banco de dados
	            Class.forName("com.mysql.jdbc.Driver");

	            String url = "jdbc:mysql://localhost:3306/seu_banco_de_dados";
	            String user = "seu_usuario";
	            String password = "sua_senha";

	            conn = DriverManager.getConnection(url, user, password);
	            
	            if (conn != null) {
	                System.out.println("Conexão bem sucedida!");
	            } else {
	                System.out.println("Falha na conexão!");
	            }

	        } catch (ClassNotFoundException e) {
	            System.out.println("Driver JDBC não encontrado!");
	            e.printStackTrace();
	        } catch (SQLException e) {
	            System.out.println("Falha ao conectar-se ao banco de dados!");
	            e.printStackTrace();
	        } finally {
	            try {
	                if (conn != null) {
	                    conn.close();
	                }
	            } catch (SQLException e) {
	                System.out.println("Erro ao fechar a conexão!");
	                e.printStackTrace();
	            }
	        }
	    }

}
