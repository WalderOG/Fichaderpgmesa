package controller;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import java.io.IOException;
import javafx.application.Application;

public class menu {
    @FXML
    private Button Cadastrar ;
    @FXML
    private Button listarpersona;

    public static void main(String[] args) {
        Application.launch(args);
    }

        // menu
    public void Cadastrar() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/Cadastropersona.fxml"));
        Stage stage = (Stage) Cadastrar.getScene().getWindow();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);


    }
    public void listarpersona() throws IOException {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/fxml/listarpersona.fxml"));
        Stage stage = (Stage) listarpersona.getScene().getWindow();
        Scene scene = new Scene(loader.load());
        stage.setScene(scene);


    }
}
