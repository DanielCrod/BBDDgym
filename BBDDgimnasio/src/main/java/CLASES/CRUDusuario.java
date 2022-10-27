/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author danie
 */
public class CRUDusuario {
    public static void insertarUsuario(Connection con, Usuario usu)  {
     PreparedStatement ps;  
    String sql;
     
     try {
             sql = "insert into usuario (dni, nombre, fecha) values + (?, ?, ?)";
             ps = con.prepareStatement(sql);
         
            ps.setString(1,usu.getDni());
            ps.setString(2, usu.getNombre());
            ps.setString(3, usu.getFecha());
            ps.executeUpdate();
           
            
        } catch (SQLException e) {
            System.out.print("ERROR AL INSERTAR");
        }}
}
