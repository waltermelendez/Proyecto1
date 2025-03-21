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
        //El arbol debe de esta en cada estudiante como arreglo
        Arbol uno = new Arbol();
        Scanner Entrada = new Scanner(System.in);
        Curso ingresar = new Curso(1,6,"Precalculo");
        Curso ingresar1 = new Curso(2,6,"Calculo I");
        Curso ingresar2 = new Curso(1,4,"Fiscia I");
        Curso ingresar3 = new Curso(1,6,"Calculo II");
        Curso ingresar4 = new Curso(1,4,"Fisica II");
        Cursos[0]=ingresar;
        Cursos[1]=ingresar1;
        Cursos[2]=ingresar2;
        Cursos[3]=ingresar3;
        Cursos[4]=ingresar4;
        String [] [] Tabla = new String [20][8];
        do {            
            
        } while (true);
        
        
    }
}
