package org.example.mysqlfxconect.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import org.example.mysqlfxconect.HelloAplication;

import java.net.URL;
import java.util.ResourceBundle;

public class ControladorMestre implements Initializable {

    @FXML
    protected void voltar(ActionEvent event){
        HelloAplication.changeScreen(0);
    }
    @FXML
    protected void sair(ActionEvent event){
        HelloAplication.closeScreen();
    }
    @FXML
    public void cadastro(ActionEvent event){
        HelloAplication.changeScreen(2);
    }
    @FXML
    protected void logar(ActionEvent event){
        HelloAplication.changeScreen(1);
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

    }
}
