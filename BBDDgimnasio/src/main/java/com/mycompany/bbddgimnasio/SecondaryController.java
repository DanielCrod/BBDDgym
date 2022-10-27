package com.mycompany.bbddgimnasio;

import CLASES.CRUDusuario;
import CLASES.ConnectionDB;
import static CLASES.ConnectionDB.getConexion;
import CLASES.Usuario;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.time.LocalDate;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;


public class SecondaryController {

    Connection con;

    public SecondaryController() throws SQLException {
        this.con = getConexion();
    }
    
    
    
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
    private Button elim;
    
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
    private TextField dniMod;
    
    @FXML
    private TextField nombreMod;
    
    @FXML
    private DatePicker fechaMod;
    
    @FXML
    private TableView vista;
    
    @FXML 
    private Button cancelarMod;
    
    @FXML
    private Button mod;
    
    @FXML 
    private AnchorPane ventanaModificar;
    
    @FXML 
    private AnchorPane ventanaEliminar;
    
    @FXML
    private Button cancelarEliminacion;
    
    @FXML
    private TextField dniElim;
    
    
    //Declaración de métodos
    @FXML
    public void nuevo (ActionEvent Event) {
        ventanaNuevo.setVisible(true);
    }
    
    @FXML
    public void añadir (ActionEvent Event) throws SQLException {
        Usuario usu = new Usuario(dniUsuario.getText(), nombreUsuario.getText(), fecha.getValue().toString());
        usu.getInfo();
        con = getConexion();
        CRUDusuario.insertarUsuario(con, usu);
    }
    
    @FXML
    public void cancelar (ActionEvent Event) throws IOException {
        ventanaNuevo.setVisible(false);
        dni.setText("");
        nombre.setText("");
        fecha.setValue(LocalDate.MIN);
        App.setRoot("secondary");
    }
    
    
    @FXML
    public void modificar (ActionEvent Event) {
        ventanaModificar.setVisible(true);
    }
    
    @FXML
    public void cancelarMod (ActionEvent Event) throws IOException {
        ventanaModificar.setVisible(false);
        dni.setText("");
        nombre.setText("");
        fecha.setValue(LocalDate.MIN);
        App.setRoot("secondary");
    }
    
    @FXML 
    public void mod (ActionEvent Event) {
        
    }
    
    @FXML
    public void eliminar (ActionEvent Event) {
        ventanaEliminar.setVisible(true);
    }
    
    @FXML 
    public void cancelarElim (ActionEvent Event) throws IOException {
        ventanaEliminar.setVisible(false);
        dni.setText("");
        App.setRoot("secondary");
    }
    
    @FXML
    public void exit (ActionEvent Event) throws IOException {
        ConnectionDB.desconectar();
        App.setRoot("primary");
    }
    
}