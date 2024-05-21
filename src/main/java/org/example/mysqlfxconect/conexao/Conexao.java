package org.example.mysqlfxconect.conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

    public class Conexao {

        private static final String URL = "jdbc:mysql://localhost:3306/cadastro";
        private static final String user = "root";
        private static final String password = "";

        private static Connection conn;

        public static Connection getConexao() {
            try {
                if (conn == null) {
                    conn = DriverManager.getConnection(URL, user, password);
                    return conn;
                } else {
                    return conn;
                }
            } catch (SQLException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
                return null;
            }
        }
    }
