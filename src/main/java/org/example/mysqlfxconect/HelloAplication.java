package org.example.mysqlfxconect;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloAplication extends Application {
    private static Stage primaryStage;
    private static Scene view, view1, view2, view3;

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader janela = new FXMLLoader(getClass().getResource("view.fxml"));
        FXMLLoader janela1 = new FXMLLoader(getClass().getResource("view1.fxml"));
        FXMLLoader janela2 = new FXMLLoader(getClass().getResource("view2.fxml"));
        FXMLLoader janela3 = new FXMLLoader(getClass().getResource("view3.fxml"));

        primaryStage = stage;

        Parent parentJanela = janela.load();
        Parent parentJanela1 = janela1.load();
        Parent parentJanela2 = janela2.load();
        Parent parentJanela3 = janela3.load();

        view = new Scene(parentJanela);
        view1 = new Scene(parentJanela1);
        view2 = new Scene(parentJanela2);
        view3 = new Scene(parentJanela3);
        primaryStage.setTitle("Tela Usuario");
        stage.setScene(view);
        stage.show();
    }

    public static void changeScreen(int opcao){
        switch (opcao){
            case 0:
                primaryStage.setScene(view);
                primaryStage.setTitle("Tela Usuario");
                break;
            case 1:
                primaryStage.setScene(view1);
                primaryStage.setTitle("Login");
                break;
            case 2:
                primaryStage.setScene(view2);
                primaryStage.setTitle("Cadastro");
                break;
            case 3:
                primaryStage.setScene(view3);
                primaryStage.setTitle("Bem Vindo");
                break;
        }
    }
    public static void closeScreen(){
       primaryStage.close();
    }

    public static void main(String[] args) {
        launch();
    }

}