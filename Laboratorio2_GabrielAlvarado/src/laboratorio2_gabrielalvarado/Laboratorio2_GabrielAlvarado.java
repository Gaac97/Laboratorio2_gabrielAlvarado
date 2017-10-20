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
        String opcion1 = "";
        while (!opcion1.equalsIgnoreCase("d")) {
            opcion1 = JOptionPane.showInputDialog("MENU\n"
                    + "Elija una opcion\n"
                    + "a.Administracion\n"
                    + "b.Matricula\n"
                    + "c.Login\n"
                    + "d.Salir\n"
            );

            String op = "";
            if (opcion1.equalsIgnoreCase("a")) {
                while (!op.equalsIgnoreCase("c")) {
                    op = JOptionPane.showInputDialog("MENU\n"
                            + "Elija una ocpion\n"
                            + "a.Agregar Clases\n"
                            + "b.Agregar Maestro\n"
                            + "c.Salir\n"
                    );
                    if (op.equalsIgnoreCase("a")) {
                        JOptionPane.showMessageDialog(null, "Clases");
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
                        JOptionPane.showMessageDialog(null, "Maestro");
                        String nombre = JOptionPane.showInputDialog("Ingrese nombre");
                        String seccion = JOptionPane.showInputDialog("Ingrese seccion");
                        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de alumnos"));
                        String maestro = (JOptionPane.showInputDialog("Ingrese maestro"));
                        int unidades = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de unidades"));

                        ListClases.add(new Clases(nombre, seccion, cantidad, maestro, unidades));
                    }
                }
            }

            if (opcion1.equalsIgnoreCase("b")) {
                JOptionPane.showMessageDialog(null, "Matricula");
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

        if (opcion1.equalsIgnoreCase("c")) {
            JOptionPane.showMessageDialog(null, "Login");
            String opcion2 = "";
            opcion2 = JOptionPane.showInputDialog("LOGIN\n"
                    + "a.Iniciar Sesion Profesor\n"
                    + "b.Iniciar Sesion Alumno\n");
            if (opcion2.equalsIgnoreCase("a")) {
                for (Alumno t : ListAlumno) {

                    String usuario = JOptionPane.showInputDialog("Ingrese usuario");
                    String contrasena = JOptionPane.showInputDialog("Ingrese usuario");
                    if (usuario.equalsIgnoreCase(t.getUsuario()) && contrasena.equalsIgnoreCase(t.getContraseña())) {
                        JOptionPane.showMessageDialog(null, "Bienvenido" + t.getUsuario());

                    } else {
                        JOptionPane.showMessageDialog(null, "Contraseña Incorrecta");
                    }
                }
            }

            if (opcion2.equalsIgnoreCase("b")) {
                for (Maestro t : ListMaestro) {

                    String usuario = JOptionPane.showInputDialog("Ingrese usuario");
                    String contrasena = JOptionPane.showInputDialog("Ingrese usuario");
                    if (usuario.equalsIgnoreCase(t.getUsuario()) && contrasena.equalsIgnoreCase(t.getContraseña())) {
                        JOptionPane.showMessageDialog(null, "Bienvenido" + t.getUsuario());

                    } else {
                        JOptionPane.showMessageDialog(null, "Contraseña Incorrecta");
                    }
                }
            }
        }

    }

}
