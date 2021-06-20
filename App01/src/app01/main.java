/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app01;

import java.util.Scanner;

/**
 *
 * @author 
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Alumno alumno = datosInicialesAlumno();
        Maestro maestro=datosInicialesMaestro();
        Tutor tutor=datosInicialesTutor(alumno);

        System.out.print("------------------\n");
        System.out.print("Datos de alumno\n");
        alumno.imprimirPerfil();
        System.out.print("Calificacion de alumno: ");
        alumno.mostrarCalificaciones();

        System.out.print("------------------\n");
        System.out.print("Datos de Maestro\n");
        maestro.imprimirPerfil();
        
        System.out.print("------------------\n");
        System.out.print("Datos de Tutor\n");
        tutor.imprimirPerfil();
        System.out.print("Calificacion de alumno: ");
        tutor.mostrarCalificaciones();

        int opcionSeleccionada = 0;

        while (opcionSeleccionada != 8) {
            opcionSeleccionada = mostrarMenu();

            switch (opcionSeleccionada) {
                case 1:
                    maestro = modificarMaestro();
                    break;
                case 2:
                    alumno = modificarAlumno();
                    break;
                case 3:
                    tutor = modificarTutor();
                    break;
                case 4:
                    System.out.print("-----------------------\n");
                    System.out.print("Datos de Maestro\n");
                    maestro.imprimirPerfil();
                    break;
                case 5:
                    System.out.print("-----------------------\n");

                    System.out.print("Datos de Alumno\n");
                    alumno.imprimirPerfil();
                    break;
                case 6:
                    System.out.print("-----------------------\n");

                    System.out.print("Datos de Tutor\n");
                    tutor.imprimirPerfil();
                    break;
                case 7:
                    System.out.print("-----------------------\n");
                    alumno.mostrarCalificaciones();
                    break;
                default:
                    break;
            }
        }

    }

    public static Maestro datosInicialesMaestro() {
        Maestro maestro = new Maestro();
        maestro.setId("65667");
        maestro.setNombre("Jose");
        maestro.setApellido("Soto");
        maestro.setCorreoElectronico("jose@gamil.com");
        
        return maestro;                
    }

    public static Alumno datosInicialesAlumno() {
        Alumno alumno = new Alumno();
        alumno.setId("43094309");
        alumno.setNombre("Jose");
        alumno.setApellido("Soto");
        alumno.setCorreoElectronico("jose@gamil.com");
        alumno.guardarCalificacion(89);
        
        return alumno;
    }

    public static Tutor datosInicialesTutor(Alumno alumno) {
        Tutor tutor = new Tutor();
        tutor.setId("65667");
        tutor.setNombre("Maria");
        tutor.setApellido("Hidalgo");
        tutor.setCorreoElectronico("maria@gamil.com");
        tutor.setAlumno(alumno);
        
        return tutor;
    }
    
    public static int mostrarMenu() {

        int selection;
        Scanner input = new Scanner(System.in);

        /**
         * ************************************************
         */
        System.out.println("Escoja la opcion deseada");
        System.out.println("-------------------------\n");
        System.out.println("1 - Modificar datos Maestro");
        System.out.println("2 - Modificar datos Alumno");
        System.out.println("3 - Modificar datos Tutor");
        System.out.println("4 - Imprimir datos Maestro");
        System.out.println("5 - Imprimir datos Alumno");
        System.out.println("6 - Imprimir datos Tutor");
        System.out.println("7 - Imprimir calificacion Alumno");
        System.out.println("8 - Salir del programa");

        selection = input.nextInt();
        return selection;
    }

    public static Maestro modificarMaestro() {
        Maestro datos = new Maestro();

        Scanner input = new Scanner(System.in);
        System.out.println("Escriba el id");
        datos.setId(input.nextLine());

        input = new Scanner(System.in);
        System.out.println("Escriba el nombre");
        datos.setNombre(input.nextLine());

        input = new Scanner(System.in);
        System.out.println("Escriba el apellido");
        datos.setApellido(input.nextLine());

        input = new Scanner(System.in);
        System.out.println("Escriba el correo");
        datos.setCorreoElectronico(input.nextLine());

        return datos;
    }

    public static Alumno modificarAlumno() {
        Alumno datos = new Alumno();

        Scanner input = new Scanner(System.in);

        System.out.println("Escriba el id");
        datos.setId(input.nextLine());

        input = new Scanner(System.in);
        System.out.println("Escriba el nombre");
        datos.setNombre(input.nextLine());

        input = new Scanner(System.in);
        System.out.println("Escriba el apellido");
        datos.setApellido(input.nextLine());

        input = new Scanner(System.in);
        System.out.println("Escriba el correo");
        datos.setCorreoElectronico(input.nextLine());

        System.out.println("Escriba la calificacion");
        input = new Scanner(System.in);
        while (!input.hasNextInt()) {
            System.out.println("Datos invalidos, no son numericos.");
            input.nextLine();
        }
        datos.setCalificacion(input.nextInt());

        return datos;
    }

    public static Tutor modificarTutor() {
        Tutor datos = new Tutor();

        Scanner input = new Scanner(System.in);

        System.out.println("Escriba el id");
        datos.setId(input.nextLine());

        input = new Scanner(System.in);
        System.out.println("Escriba el nombre");
        datos.setNombre(input.nextLine());

        input = new Scanner(System.in);
        System.out.println("Escriba el apellido");
        datos.setApellido(input.nextLine());

        input = new Scanner(System.in);
        System.out.println("Escriba el correo");
        datos.setCorreoElectronico(input.nextLine());

        return datos;
    }

   

}
