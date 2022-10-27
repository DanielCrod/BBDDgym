package com.mycompany.gymbd;

import Clases.Usuario;
import java.io.IOException;
import java.time.LocalDate;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class SecondaryController {

   @FXML
    private void switchToPrimary() throws IOException {
        App.setRoot("primary");
    }
    
    //Declaración de componentes
    @FXML
    private Button nuevo;
    
    @FXML 
    private Button modificar;
    
    @FXML
    private Button eliminar;
    
    @FXML 
    private Button salir;
    
    @FXML
    private AnchorPane ventanaNuevo;
    
    @FXML
    private TextField dni;
    
    @FXML
    private TextField nombre;
    
    @FXML
    private TextField dniUsuario;
    
    @FXML
    private TextField nombreUsuario;
    
    @FXML
    private DatePicker fecha;
    
    @FXML
    private TableView vista;
    
    
    //Declaración de métodos
    @FXML
    public void nuevo (ActionEvent Event) {
        ventanaNuevo.setVisible(true);
    }
    
    @FXML
    public void añadir (ActionEvent Event) {
        
        Usuario usu = new Usuario(dniUsuario.getText(), nombreUsuario.getText(), fecha.getValue().toString());
       
        dniUsuario.setText("");
        nombreUsuario.setText("");
        fecha.setValue(LocalDate.MIN);
    }
    
    @FXML
    public void cancelar (ActionEvent Event) throws IOException {
        dni.setText("");
        nombre.setText("");
        fecha.setValue(LocalDate.MIN);
        App.setRoot("secondary");
        ventanaNuevo.setVisible(false);
    }
    
    
    @FXML
    public void modificar (ActionEvent Event) {
        
    }
    
    
    
    
    @FXML
    public void eliminar (ActionEvent Event) {
        
    }
  
}