package org.example.mysqlfxconect.usuariodao;

import java.sql.Connection;
import java.sql.PreparedStatement;


import org.example.mysqlfxconect.conexao.Conexao;
import org.example.mysqlfxconect.usuario.Usuario;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {

    Connection conn;

    public void cadastrarUsuario(Usuario usuario) {
        String sql = "INSERT INTO USUARIOS (NOME, EMAIL, SENHA) VALUES (?, ?, ?)";

        PreparedStatement ps = null;

        try {
            ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, usuario.getNome());
            ps.setString(2, usuario.getEmail());
            ps.setString(3, usuario.getSenha());

            ps.execute();
            ps.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    public void autenticarUsuario(Usuario usuario){

    }
}
