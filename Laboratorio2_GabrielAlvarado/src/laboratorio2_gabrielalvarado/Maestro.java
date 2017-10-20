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
public class Maestro {
    public String nombre;
    public String titulo;
    public String maestria;
    public String salario;
    public String Usuario;
    public String Contraseña;
    public int CantidadClases;
    public ArrayList<String> ListClases = new ArrayList();

    public Maestro() {
    }

    public Maestro(String nombre, String titulo, String maestria, String salario, String Usuario, String Contraseña, int CantidadClases) {
        this.nombre = nombre;
        this.titulo = titulo;
        this.maestria = maestria;
        this.salario = salario;
        this.Usuario = Usuario;
        this.Contraseña = Contraseña;
        this.CantidadClases = CantidadClases;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getMaestria() {
        return maestria;
    }

    public void setMaestria(String maestria) {
        this.maestria = maestria;
    }

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return Contraseña;
    }

    public void setContraseña(String Contraseña) {
        this.Contraseña = Contraseña;
    }

    public int getCantidadClases() {
        return CantidadClases;
    }

    public void setCantidadClases(int CantidadClases) {
        this.CantidadClases = CantidadClases;
    }

    public ArrayList<String> getListClases() {
        return ListClases;
    }

    public void setListClases(ArrayList<String> ListClases) {
        this.ListClases = ListClases;
    }

    @Override
    public String toString() {
        return "Maestro{" + "nombre=" + nombre + ", titulo=" + titulo + ", maestria=" + maestria + ", salario=" + salario + ", Usuario=" + Usuario + ", Contrase\u00f1a=" + Contraseña + ", CantidadClases=" + CantidadClases + ", ListClases=" + ListClases + '}';
    }
    
}
