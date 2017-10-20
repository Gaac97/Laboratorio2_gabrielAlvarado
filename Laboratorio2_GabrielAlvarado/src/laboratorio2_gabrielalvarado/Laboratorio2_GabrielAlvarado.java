/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio2_gabrielalvarado;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Alvarado
 */
public class Laboratorio2_GabrielAlvarado {

    static ArrayList<Clases> ListClases = new ArrayList();
    static ArrayList<Alumno> ListAlumno = new ArrayList();
    static ArrayList<Maestro> ListMaestro = new ArrayList();

    public static void main(String[] args) {
        String op = "";
        while (!op.equalsIgnoreCase("d")) {
            op = JOptionPane.showInputDialog("MENU\n"
                    + "Elija una ocpion\n"
                    + "a.Agregar Clases\n"
                    + "b.Agregar Maestro\n"
                    + "c.Agregar Alumno\n"
                    + "d.Salir\n"
            );
            if (op.equalsIgnoreCase("a")) {
                String nombre = JOptionPane.showInputDialog("Ingrese nombre");
                String maestria = JOptionPane.showInputDialog("Ingrese Maestria");
                String titulo = JOptionPane.showInputDialog("Ingrese titulo");
                String salario = (JOptionPane.showInputDialog("Ingrese salario"));
                String Usuario = JOptionPane.showInputDialog("Ingrese usuario");
                String Contraseña = JOptionPane.showInputDialog("Ingrese contraseña");
                int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad"));
                String clases = JOptionPane.showInputDialog("Ingrese clases");
                ListMaestro.add(new Maestro(nombre, titulo, salario, salario, Usuario, Contraseña, cantidad));
            }
            if (op.equalsIgnoreCase("b")) {
                String nombre = JOptionPane.showInputDialog("Ingrese nombre");
                String seccion = JOptionPane.showInputDialog("Ingrese seccion");
                int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de alumnos"));
                String maestro = (JOptionPane.showInputDialog("Ingrese maestro"));
                int unidades = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de unidades"));

                ListClases.add(new Clases(nombre, seccion, cantidad, maestro, unidades));
            }
            if (op.equalsIgnoreCase("d")) {
                String nombre = JOptionPane.showInputDialog("Ingrese nombre");
                String cuenta = JOptionPane.showInputDialog("Ingrese cuenta");
                String carrera = JOptionPane.showInputDialog("Ingrese carrera");
                String Usuario = JOptionPane.showInputDialog("Ingrese usuario");
                String Contraseña = JOptionPane.showInputDialog("Ingrese contraseña");
                int edad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese edad"));
                String clases = JOptionPane.showInputDialog("Ingrese clases");
                ListAlumno.add(new Alumno(nombre, cuenta, carrera, edad, edad, Usuario, Contraseña));

            }
            

        }

    }
}
