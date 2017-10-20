/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2_gabrielalvarado;

/**
 *
 * @author Gabriel Alvarado
 */
public class Mensajes {
    public String emisor;
    public String receptor;
    public int nivel;
    public String mensaje;

    public Mensajes(String emisor, String receptor, int nivel, String mensaje) {
        this.emisor = emisor;
        this.receptor = receptor;
        this.nivel = nivel;
        this.mensaje = mensaje;
    }

    

    public String getEmisor() {
        return emisor;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public String getReceptor() {
        return receptor;
    }

    public void setReceptor(String receptor) {
        this.receptor = receptor;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    @Override
    public String toString() {
        return "Mensajes{" + "emisor=" + emisor + ", receptor=" + receptor + ", nivel=" + nivel + '}';
    }
    
    
    
}
