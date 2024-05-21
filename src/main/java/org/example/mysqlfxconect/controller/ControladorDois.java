package org.example.mysqlfxconect.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import org.example.mysqlfxconect.HelloAplication;
import org.example.mysqlfxconect.usuario.Usuario;
import org.example.mysqlfxconect.usuariodao.UsuarioDAO;
import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ControladorDois extends ControladorMestre implements Initializable {

    @FXML
    private TextField lblNome, lblEmail, lblSenha;

    @FXML
    public void cadastrarUsuarios(ActionEvent event) throws IOException {

        Usuario u = new Usuario();
        u.setNome(lblNome.getText());
        u.setSenha(lblSenha.getText());
        u.setEmail(lblEmail.getText());

        new UsuarioDAO().cadastrarUsuario(u);

        JOptionPane.showMessageDialog(null,"Usuario cadastrado com sucesso!");

        HelloAplication.changeScreen(0);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
    }
}
