/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CLASES;

/**
 *
 * @author danie
 */
public class Usuario {
    private String dni;
    private String nombre;
    private String fecha;
  

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public Usuario(String dni, String nombre, String fecha) {
        this.dni = dni;
        this.nombre = nombre;
        this.fecha = fecha;
    }

    public void getInfo() {
        System.out.println("Los datos del usuario son: "  + this.dni + " , " + this.nombre + " , " + this.fecha);
    }
            

    
    

}
