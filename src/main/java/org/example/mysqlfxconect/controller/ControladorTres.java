package org.example.mysqlfxconect.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;
import org.example.mysqlfxconect.HelloAplication;
import org.example.mysqlfxconect.conexao.Conexao;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ControladorTres extends ControladorMestre {
    @FXML
    private String nomeConf, senhaConf;

    @FXML
    private TextField edtLogin, edtSenha;


    @FXML
    protected void logar(ActionEvent event){
        String nome, senha;
        nome = edtLogin.getText();
        senha = edtSenha.getText();

        try {
            String sql = "select * from usuarios where nome = ? and senha = ?";
            PreparedStatement ps = Conexao.getConexao().prepareStatement(sql);
            ps.setString(1, nome);
            ps.setString(2, senha);

            ResultSet rs = ps.executeQuery();

            if(rs.next()){
                nomeConf = (rs.getString("nome"));

                JOptionPane.showMessageDialog(null,"Login feito com sucesso!");

                HelloAplication.changeScreen(3);

            }else{
                JOptionPane.showMessageDialog(null, "Usuario ou senha invalidos! ");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null,e);

            }

    }
}