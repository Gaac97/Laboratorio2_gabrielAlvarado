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
public class Clases {
    public String nombre;
    public String seccion;
    public int cantidad;
    public String maestro;
    public int unidades;
    public ArrayList<Clases> ListClases = new ArrayList();

    public Clases() {
    }

    public Clases(String nombre, String seccion, int cantidad, String maestro, int unidades) {
        this.nombre = nombre;
        this.seccion = seccion;
        this.cantidad = cantidad;
        this.maestro = maestro;
        this.unidades = unidades;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSeccion() {
        return seccion;
    }

    public void setSeccion(String seccion) {
        this.seccion = seccion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getMaestro() {
        return maestro;
    }

    public void setMaestro(String maestro) {
        this.maestro = maestro;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public ArrayList<Clases> getListClases() {
        return ListClases;
    }

    public void setListClases(Clases t) {
        ListClases.add(t);
    }

    @Override
    public String toString() {
        return "Clases{" + "nombre=" + nombre + ", seccion=" + seccion + ", cantidad=" + cantidad + ", maestro=" + maestro + ", unidades=" + unidades + '}';
    }
    
}
