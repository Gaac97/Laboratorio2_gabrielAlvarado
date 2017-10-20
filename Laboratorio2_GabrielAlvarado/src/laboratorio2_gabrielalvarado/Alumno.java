/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2_gabrielalvarado;

import java.util.ArrayList;

/**
 *
 * @author Gabriel Alvarado
 */
public class Alumno {
    public String nombre;
    public String cuenta;
    public String carrera;
    public int edad;
    public int dinero;
    public String Usuario;
    public String contrasena;
    public ArrayList<Clases> ListClases = new ArrayList();
    public ArrayList<Mensajes> ListMensajes = new ArrayList();

    public Alumno() {
    }

    public Alumno(String nombre, String cuenta, String carrera, int edad, int dinero, String Usuario, String contrasena) {
        this.nombre = nombre;
        this.cuenta = cuenta;
        this.carrera = carrera;
        this.edad = edad;
        this.dinero = dinero;
        this.Usuario = Usuario;
        this.contrasena = contrasena;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getDinero() {
        return dinero;
    }

    public void setDinero(int dinero) {
        this.dinero = dinero;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return contrasena;
    }

    public void setContraseña(String contraseña) {
        this.contrasena = contraseña;
    }

    public ArrayList<Clases> getListClases() {
        return ListClases;
    }

    public void setListClases(Clases s) {
       ListClases.add(s);
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public ArrayList<Mensajes> getListMensajes() {
        return ListMensajes;
    }

    public void setListMensajes(ArrayList<Mensajes> ListMensajes) {
        this.ListMensajes = ListMensajes;
    }

    @Override
    public String toString() {
        return "Alumno{" + "nombre=" + nombre + ", cuenta=" + cuenta + '}';
    }

    

   
    
    
}
