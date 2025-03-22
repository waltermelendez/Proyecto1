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
        Curso [] Cursos = new Curso [20];
        
        Estudiante [] Estudiantes = new Estudiante [20];
        Estudiantes[0]=new Estudiante(3001,"Monica Paz",22334451,"mpaz@url.edu.gt");
        Estudiantes[1]=new Estudiante(3002,"Mateo Moscoso",22334452,"mmoscoso@url.edu.gt");
        Estudiantes[2]=new Estudiante(3003,"Daniela Rodríguez",22334453,"drodriguez@url.edu.gt");
        Estudiantes[3]=new Estudiante(3004,"Luisa Rodas",22334454,"lrodas@url.edu.gt");
        Estudiantes[4]=new Estudiante(3005,"Rodrigo Villatoro",22334455,"rvillatoro@url.edu.gt");
        
        //El arbol debe de esta en cada estudiante como arreglo
        Arbol uno = new Arbol();
        Scanner Entrada = new Scanner(System.in);
        Scanner Nombre=new Scanner(System.in);
        //Cursos pre asignados
        Cursos[0]= new Curso(1,6,"Precalculo");
        Cursos[1]= new Curso(2,6,"Calculo I");
        Cursos[2]= new Curso(1,4,"Fiscia I");
        Cursos[3]= new Curso(1,6,"Calculo II");
         Cursos[4]= new Curso(1,4,"Fisica II");
         
        int CU=5;
        int ES=5;
        String [] [] Tabla = new String [20][8];
        
        int dato=0;
        int opc =0;
        int dato1=0;
        String correo="";
        String nombre="";
        boolean est=true;
        do {      
            System.out.println("diga una opc");
            opc=Entrada.nextInt();
            switch (opc) {
                case 1 -> {
                    //Asigancion de un curso
                    if (CU<20) {
                        System.out.println("Diga el nombre del curso");
                    nombre=Nombre.nextLine();
                    System.out.println("Diga el Id del curso");
                    dato = Entrada.nextInt();
                    System.out.println("Diga la cantidad de creditos del curso");
                    dato1 = Entrada.nextInt();
                    Cursos[CU]=new Curso(dato1,dato,nombre);
                    CU++;
                    } else {
                        System.out.println("Ya no se puede asignar mas cursos.");
                    }
                  
                }
                case 2->{
                    //Asignacion de estudiantes
                    if (ES<20) {
                        System.out.println("Diga el nombre del Estudiante");
                        nombre=Nombre.nextLine();
                        System.out.println("Diga el carnet del estudiante");
                        dato=Entrada.nextInt();
                        System.out.println("Diga el numero de telefono del estudiante");
                        dato1=Entrada.nextInt();
                        System.out.println("Diga el correo del estudiante");
                        correo=Nombre.nextLine();
                        Estudiantes[ES]= new Estudiante(dato,nombre,dato1,correo);
                    } else {
                         System.out.println("Ya no se puede asignar mas estudiantes.");
                    }
                }
                case 3->{
                    //Desactivacion de cursos
                    for (int i = 0; i < CU; i++) {
                        if (Cursos[i].isEstado()) {
                            System.out.println(Cursos[i].getNombre());
                        }
                    }
                    System.out.println("Diga el curso que desea desactivar");
                    nombre=Nombre.nextLine();
                    for (int i = 0; i < CU; i++) {
                        if (Cursos[i].getNombre().equals(nombre)) {
                            Cursos[i].setEstado(false);
                            System.out.println("Se ha desactivado "+Cursos[i].getNombre());
                            break;
                        }
                    }
                }
                case 4 ->{
                //Desactivacion de Estudiantes
                    for (int i = 0; i < ES; i++) {
                        if (Estudiantes[i].isEstado()) {
                            System.out.println(Estudiantes[i].getNombre()+" "+Estudiantes[i].getCarnet());
                        }
                    }
                    System.out.println("Diga el carnet del estudiante al que quiera desactivar.");
                    dato = Entrada.nextInt();
                    for (int i = 0; i < ES; i++) {
                        if (Estudiantes[i].getCarnet()==dato) {
                            Estudiantes[i].setEstado(false);
                            System.out.println("Se ha desactivado al estudiante: "+Estudiantes[i].getNombre());
                        }
                    }
                }
                default -> {
                    System.out.println("opcion no disponible.");
                }
            }
            
        } while (est);
        
       
    }
}
