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
    static ArrayList<Maestro> ListSecciones = new ArrayList();

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
                    if (op.equalsIgnoreCase("b")) {
                        JOptionPane.showMessageDialog(null, "Maestro");
                        String nombre = JOptionPane.showInputDialog("Ingrese nombre");
                        String maestria = JOptionPane.showInputDialog("Ingrese Maestria");
                        String titulo = JOptionPane.showInputDialog("Ingrese titulo");
                        String salario = (JOptionPane.showInputDialog("Ingrese salario"));
                        String Usuario = JOptionPane.showInputDialog("Ingrese usuario");
                        String Contraseña = JOptionPane.showInputDialog("Ingrese contraseña");
                        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad"));
                        String clases = JOptionPane.showInputDialog("Ingrese clases");
                        ListMaestro.add(new Maestro(nombre, titulo, maestria, salario, Usuario, Contraseña, cantidad));
                    }
                    if (op.equalsIgnoreCase("a")) {
                        JOptionPane.showMessageDialog(null, "Clases");
                        String nombre = JOptionPane.showInputDialog("Ingrese nombre");
                        String seccion = JOptionPane.showInputDialog("Ingrese seccion");
                        int cantidad = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de alumnos"));
                        String maestro = (JOptionPane.showInputDialog("Ingrese maestro"));
                        int unidades = Integer.parseInt(JOptionPane.showInputDialog("Ingrese cantidad de unidades"));
                        for (Maestro r : ListSecciones) {
                            r.getListClases().add(seccion);
                        }
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
            String opcion2 = "";
            if (opcion1.equalsIgnoreCase("c")) {

                JOptionPane.showMessageDialog(null, "Login");

                opcion2 = JOptionPane.showInputDialog("LOGIN\n"
                        + "a.Iniciar Sesion Alumno\n"
                        + "b.Iniciar Sesion Maestro\n"
                        + "c.Salir\n");
                System.out.println(opcion2);
                if (opcion2.equalsIgnoreCase("a")) {

                    for (Alumno t : ListAlumno) {
                        JOptionPane.showMessageDialog(null, "Login Alumno");
                        String usuario = JOptionPane.showInputDialog("Ingrese usuario");
                        String contrasena = JOptionPane.showInputDialog("Ingrese usuario");
                        if (usuario.equalsIgnoreCase(t.getUsuario()) && contrasena.equalsIgnoreCase(t.getContraseña())) {
                            JOptionPane.showMessageDialog(null, "Bienvenido" + t.getUsuario());
                            String cad = "";

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

                            JOptionPane.showMessageDialog(null, "Bienvenido\n" + t.getUsuario());

                            String cad = "";
                            while (!cad.equalsIgnoreCase("d")) {
                                cad = JOptionPane.showInputDialog("MENU\n"
                                        + "a.Modificar informacion\n"
                                        + "b.Ver secciones\n"
                                        + "c.Lista Alumnos\n"
                                        + "d.Salir\n");

                                if (cad.equalsIgnoreCase("a")) {

                                    for (int i = 0; i < ListMaestro.size(); i++) {
                                        if (ListMaestro.get(i).getUsuario().equalsIgnoreCase(usuario) && ListMaestro.get(i).getContraseña().equalsIgnoreCase(contrasena)) {
                                            JOptionPane.showInputDialog("Entro");

                                            String nombre = JOptionPane.showInputDialog("Ingrese nombre");
                                            String maestria = JOptionPane.showInputDialog("Ingrese Maestria");
                                            String titulo = JOptionPane.showInputDialog("Ingrese titulo");
                                            String salario = (JOptionPane.showInputDialog("Ingrese salario"));
                                            String Usuario = JOptionPane.showInputDialog("Ingrese usuario");
                                            String Contraseña = JOptionPane.showInputDialog("Ingrese contraseña");
                                            ListMaestro.get(i).setTitulo(titulo);
                                            ListMaestro.get(i).setContraseña(Contraseña);
                                            ListMaestro.get(i).setMaestria(maestria);
                                            ListMaestro.get(i).setNombre(nombre);
                                            ListMaestro.get(i).setSalario(salario);

                                        }

                                    }

                                }
                                if (cad.equalsIgnoreCase("b")) {
                                    String p = "";
                                    for (Maestro a : ListSecciones) {
                                        for (String q : a.getListClases()) {
                                            p += ListSecciones.indexOf(q) + "" + ((Maestro) a);
                                        }
                                        JOptionPane.showMessageDialog(null, p);
                                    }
                                }
                                if (cad.equalsIgnoreCase("c")) {
                                    String w = "";
                                    for (Alumno b : ListAlumno) {

                                        w += ListSecciones.indexOf(b) + "" + ((Alumno) b);

                                    }
                                    JOptionPane.showMessageDialog(null, w);
                                } else {
                                    JOptionPane.showMessageDialog(null, "Contraseña Incorrecta");
                                }
                            }

                        }
                    }
                }

            }

        }
    }
}
