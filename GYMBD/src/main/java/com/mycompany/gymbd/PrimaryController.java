package com.mycompany.gymbd;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class PrimaryController {

    //Declaración de componentes
    @FXML
    private TextField dni;
    
    @FXML 
    private PasswordField pass;
    
    @FXML 
    private Button limpiar;
    
    @FXML
    private Button aceptar;
    
//Declaración de métodos
    @FXML
    public void aceptar (ActionEvent Event) throws IOException {
        if ("1132".equals(pass.getText()) & "12426232E".equals(dni.getText())) {
            App.setRoot("secondary");
        } else {
            System.out.println("DNI o contraseña de administrador incorrecta");
            dni.setText("");
            pass.setText("");
        }
    }
    
    @FXML
    public void limpiar (ActionEvent Event) {
        dni.setText("");
        pass.setText("");
    }
}
