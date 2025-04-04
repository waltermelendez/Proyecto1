/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package clases.proyecto1;

import java.util.Scanner;

/**
 *
 * @author walte
 */

public class Proyecto1 {

    
    public static void main(String[] args) {
        Curso[] Cursos = new Curso[20];
        Arbol asginacion = new Arbol();
        
        //Metodo para "llenar" la matriz
        String[][] Tabla = new String[20][7];
        for (int i = 0; i < Tabla.length; i++) {
            for (int j = 0; j < 7; j++) {
                Tabla[i][j] = "0";
            }
        }
        //Titulos de la tabla
        Tabla[0][0] = "Curso    ";
        Tabla[0][1] = "PP   ";
        Tabla[0][2] = "SP   ";
        Tabla[0][3] = "ACT  ";
        Tabla[0][4] = "EF   ";
        Tabla[0][5] = "ER";
        Tabla[0][6] = "NF";
        
        //Estudiantes
        Estudiante[] Estudiantes = new Estudiante[20];
        Estudiantes[0] = new Estudiante(3001, "Monica Paz", 22334451, "mpaz@url.edu.gt");
        Estudiantes[0].setTab(Tabla);
        Estudiantes[1] = new Estudiante(3002, "Mateo Moscoso", 22334452, "mmoscoso@url.edu.gt");
        Estudiantes[1].setTab(Tabla);
        Estudiantes[2] = new Estudiante(3003, "Daniela Rodríguez", 22334453, "drodriguez@url.edu.gt");
        Estudiantes[2].setTab(Tabla);
        Estudiantes[3] = new Estudiante(3004, "Luisa Rodas", 22334454, "lrodas@url.edu.gt");
        Estudiantes[3].setTab(Tabla);
        Estudiantes[4] = new Estudiante(3005, "Rodrigo Villatoro", 22334455, "rvillatoro@url.edu.gt");
        Estudiantes[4].setTab(Tabla);

        //Scanners
        Scanner Entrada = new Scanner(System.in);
        Scanner Nombre = new Scanner(System.in);
        Scanner Axuliar = new Scanner(System.in);

        //Cursos pre asignados
        Cursos[0] = new Curso(1, 6, "Precalculo");
        Cursos[1] = new Curso(2, 6, "Calculo I");
        Cursos[2] = new Curso(1, 4, "Fiscia I");
        Cursos[3] = new Curso(1, 6, "Calculo II");
        Cursos[4] = new Curso(1, 4, "Fisica II");

        //Estudaintes ya existentes e ingresados al arbol
        asginacion.agregar_nodo(3001);
        asginacion.agregar_nodo(3002);
        asginacion.agregar_nodo(3003);
        asginacion.agregar_nodo(3004);
        asginacion.agregar_nodo(3005);

        
       
        
        int CU = 5;//Contador de cursos
        int ES = 5;//Contador de estudiantes
        
        //Verificador de la matriz
//        for (int i = 0; i < 20; i++) {
//            for (int j = 0; j < 7; j++) {
//                System.out.print(", " + Tabla[i][j] + ", ");
//            }
//            System.out.println(" ,");
//        }


//Datos de los extudiantes ya existentes en el programa
        Estudiantes[2].AgregarMateria("Precalculo");
        Estudiantes[2].AgregarTabla(10);
        Estudiantes[2].AgregarTabla(15);
        Estudiantes[2].AgregarTabla(30);
        Estudiantes[2].AgregarTabla(30);
        Estudiantes[2].AgregarMateria("Calculo 1");
        Estudiantes[2].AgregarTabla(15);
        Estudiantes[2].AgregarTabla(10);
        Estudiantes[2].AgregarTabla(20);
        Estudiantes[2].AgregarTabla(10);
        Estudiantes[2].AgregarMateria("Fisica 1");
        Estudiantes[2].AgregarTabla(10);
        Estudiantes[2].AgregarTabla(10);
        Estudiantes[2].AgregarTabla(20);
        Estudiantes[2].AgregarTabla(10);
       
        //Datos de estudiante 3003
       
        
        Estudiantes[0].AgregarMateria("Precalculo");
        Estudiantes[0].AgregarTabla(10);
        Estudiantes[0].AgregarTabla(15);
        Estudiantes[0].AgregarTabla(30);
        Estudiantes[0].AgregarTabla(30);
      
        //Datos de estudiante 3001
         
        
        Estudiantes[1].AgregarMateria("Precalculo");
        Estudiantes[1].AgregarTabla(10);
        Estudiantes[1].AgregarTabla(15);
        Estudiantes[1].AgregarTabla(30);
        Estudiantes[1].AgregarTabla(30);
        Estudiantes[1].AgregarMateria("Calculo 1");
        Estudiantes[1].AgregarTabla(15);
        Estudiantes[1].AgregarTabla(10);
        Estudiantes[1].AgregarTabla(20);
        Estudiantes[1].AgregarTabla(10);
        //Datos de estudiante 3002
         
        
        Estudiantes[3].AgregarMateria("Precalculo");
        Estudiantes[3].AgregarTabla(10);
        Estudiantes[3].AgregarTabla(15);
        Estudiantes[3].AgregarTabla(30);
        Estudiantes[3].AgregarTabla(30);
        //Datos de estudiante 3003
         System.out.println("------------------");
        
        Estudiantes[4].AgregarMateria("Precalculo");
        Estudiantes[4].AgregarTabla(10);
        Estudiantes[4].AgregarTabla(15);
        Estudiantes[4].AgregarTabla(30);
        Estudiantes[4].AgregarTabla(30);
        Estudiantes[4].AgregarMateria("Calculo 1");
        Estudiantes[4].AgregarTabla(15);
        Estudiantes[4].AgregarTabla(10);
        Estudiantes[4].AgregarTabla(20);
        Estudiantes[4].AgregarTabla(10);
        Estudiantes[4].AgregarMateria("Fisica 1");
        Estudiantes[4].AgregarTabla(10);
        Estudiantes[4].AgregarTabla(10);
        Estudiantes[4].AgregarTabla(20);
        Estudiantes[4].AgregarTabla(10);
        
        //Datos de estudiante 3005
        
        int dato = 0;
        int opc = 0;
        int dato1 = 0;
        String correo = "";
        String nombre = "";
        String tipo = "";

        boolean est = true;
        boolean ver = true;
        do {
            System.out.println("diga una opc");
            System.out.println("1.... Asignacion de cursos.");
            System.out.println("2.... Ingreso de estudiantes.");
            System.out.println("3.... Desactivacion de cursos.");
            System.out.println("4.... Activacion de cursos.");
            System.out.println("5.... Desactivacion de estudiantes.");
            System.out.println("6.... Activacion de cursos de estudaines");
            System.out.println("7.... Ingreso de notas.");
            System.out.println("8.... Ingreso de asignaciones");
            System.out.println("9.... Listado de cursos asignados por estudiante");
            System.out.println("10... Salir");
            
            opc = Entrada.nextInt();
            switch (opc) {
                case 1 -> {
                    //Asigancion de un curso
                    if (CU < 20) {
                        System.out.println("Diga el nombre del curso");
                        nombre = Nombre.nextLine();
                        System.out.println("Diga el Id del curso");
                        dato = Entrada.nextInt();
                        System.out.println("Diga la cantidad de creditos del curso");
                        dato1 = Entrada.nextInt();
                        Cursos[CU] = new Curso(dato1, dato, nombre);
                        CU++;
                    } else {
                        System.out.println("Ya no se puede asignar mas cursos.");
                    }

                }
                case 2 -> {
                    //Asignacion de estudiantes
                    if (ES < 20) {
                        System.out.println("Diga el nombre del Estudiante");
                        nombre = Nombre.nextLine();
                        System.out.println("Diga el carnet del estudiante");
                        dato = Entrada.nextInt();
                        System.out.println("Diga el numero de telefono del estudiante");
                        dato1 = Entrada.nextInt();
                        System.out.println("Diga el correo del estudiante");
                        correo = Nombre.nextLine();
                        Estudiantes[ES] = new Estudiante(dato, nombre, dato1, correo);
                        asginacion.agregar_nodo(Estudiantes[ES].getCarnet());
                        ES++;
                    } else {
                        System.out.println("Ya no se puede asignar mas estudiantes.");
                    }
                }
                case 3 -> {
                    //Desactivacion de cursos
                    for (int i = 0; i < CU; i++) {
                        if (Cursos[i].isEstado()) {
                            System.out.println(Cursos[i].getNombre());
                        }
                    }
                    System.out.println("Diga el curso que desea desactivar");
                    nombre = Nombre.nextLine();
                    for (int i = 0; i < CU; i++) {
                        if (Cursos[i].getNombre().equals(nombre)) {
                            Cursos[i].setEstado(false);
                            System.out.println("Se ha desactivado " + Cursos[i].getNombre());
                            break;
                        }
                    }
                }
                case 4 -> {
                    //Activacion de cursos
                    for (int i = 0; i < CU; i++) {
                        if (!Cursos[i].isEstado()) {
                            System.out.println(Cursos[i].getNombre());
                        }
                    }
                    System.out.println("Diga el nombre del curso que desea activar");
                    nombre = Nombre.nextLine();
                    for (int i = 0; i < CU; i++) {
                        if (Cursos[i].getNombre().equals(nombre)) {
                            Cursos[i].setEstado(true);
                            System.out.println("Se ha activado el curso: " + Cursos[i].getNombre());
                            break;
                        }
                    }
                }
                case 5 -> {
                    //Desactivacion de Estudiantes
                    for (int i = 0; i < ES; i++) {
                        if (Estudiantes[i].isEstado()) {
                            System.out.println(Estudiantes[i].getNombre() + " " + Estudiantes[i].getCarnet());
                        }
                    }
                    System.out.println("Diga el carnet del estudiante al que quiera desactivar.");
                    dato = Entrada.nextInt();
                    for (int i = 0; i < ES; i++) {
                        if (Estudiantes[i].getCarnet() == dato) {
                            Estudiantes[i].setEstado(false);
                            System.out.println("El nombre del estudiante que fue desactivado fue de:" + Estudiantes[i].getNombre());
                            break;

                        }
                    }
                }
                case 6 -> {
                    //Activacion de estudiantes
                    for (int i = 0; i < ES; i++) {
                        if (!Estudiantes[i].isEstado()) {
                            System.out.println(Estudiantes[i].getNombre() + " " + Estudiantes[i].getNombre());
                        }
                    }
                    System.out.println("Diga el nombre del estudiantes que desea activar");
                    dato = Entrada.nextInt();
                    for (int i = 0; i < ES; i++) {
                        if (Estudiantes[i].getCarnet() == dato) {
                            Estudiantes[i].setEstado(true);
                            System.out.println("Se ha activado al estudiante " + Estudiantes[i].getCarnet());
                            break;

                        }
                    }

                }
                case 7 -> {
                    //Ingreso de notas
                    boolean Nom = false;

                    boolean Cu = false;

                    System.out.println("Diga el carnet del estudiante:");
                    dato = Entrada.nextInt();

                    dato1 = asginacion.buscarNodo(dato);

                    System.out.println("Diga el nombre del curso a ingresar notas");
                    tipo = Axuliar.nextLine();
                    for (int i = 0; i < ES; i++) {
                        if ((Estudiantes[i].getCarnet() == dato1)) {
                            Nom = true;
                            for (int j = 1; j < 20; j++) {
                                
                                if (Estudiantes[i].getCurso(j).equals(nombre)) {
                                    Cu = true;
                                    break;
                                }
                            }
                            if (Cu) {
                                break;
                            }
                        }

                    }
                    if (Cu && Nom) {//<= Agregar metodo para agregar mas notas del cada estudiante
                        //Agregar la parte de validacion la asignacion

                        
                        for (int i = 0; i < ES; i++) {
                            if (tipo.equals(Estudiantes[i].getCurso(i))) {
                                for (int j = 0; j < 7; j++) {
                                    System.out.println("Diga la nota a agregar");
                                    dato = Entrada.nextInt();
                                    Estudiantes[i].AgregarTabla(dato);
                                }
                            }
                        }
                        //Agregar nota de evaluacion reposicion
                        for (int i = 1; i < ES; i++) {
                            for (int j = 1; j < 7; j++) {
                                int convert = Integer.parseInt(Estudiantes[i].nota(j));
                                if (convert <61) {
                                    System.out.println("Diga la nota de evaluacion reposicion");
                                    dato1=Entrada.nextInt();
                                    Estudiantes[i].agregarER(dato1, j);
                                }
                            }
                        }

                    } else {
                        System.out.println("Alguno de los datos a abuscar no esta dispobible");
                    }

                }
                case 8 -> {
                    //Ingreso de asignaciones
                    System.out.println("Diga el curso que desea asignar");
                    nombre = Nombre.nextLine();
                    for (int i = 0; i < Cursos.length; i++) {
                        if (nombre.equals(Cursos[i].getNombre())) {
                            System.out.println("El no se puede agregar una clase que ya exisite.");
                            ver = false;
                            break;
                        }
                    }
                    if (ver) {
                        if (CU < 20) {
                            CU++;
                            Cursos[CU].setNombre(nombre);
                            System.out.println("Se ha aniadido el curso en el ");
                        } else {
                            System.out.println("Ya no es posible agregar mas cursos.");
                        }

                    }

                }
                case 9->{
                    //Mostar listado de cursos de los estudiantes
                    for (int i = 0; i < ES; i++) {
                        System.out.println("Los cursos asignados de: "+Estudiantes[i].getNombre()+" , "+Estudiantes[i].getCarnet());
                        System.out.println("");
                        Estudiantes[i].mostrarTabla();
                        System.out.println("--------------------------------------------------------------");
                    }
                
                }
                case 10->{
                est=false;
                }

                default -> {
                    System.out.println("opcion no disponible.");
                }
            }

        } while (est);

    }
}
