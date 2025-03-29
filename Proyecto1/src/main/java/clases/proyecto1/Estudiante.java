/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.proyecto1;

/**
 *
 * @author walter
 */
public class Estudiante {
    private int Carnet;
    private String Nombre;
    private int Telefono;
    private String Correo;
    private boolean Estado;
    private String  [] [] tab= new String [20][8];

    public Estudiante(int Carnet, String Nombre, int Telefono, String Correo,String [] [] Tab) {
        this.Carnet = Carnet;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.Correo = Correo;
        Estado=true;
        this.tab=Tab;
    }

    public Estudiante() {
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean Estado) {
        this.Estado = Estado;
    }
    
    public int getCarnet() {
        return Carnet;
    }

    public void setCarnet(int Carnet) {
        this.Carnet = Carnet;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    public void AgregarTabla(int nota){
       int i =1;
       int j=1;
    
    }
    public void AgregarMateria(String Materia){
    int j=1;
        if (j<20) {
           tab [j][0]=Materia; 
           j++;
        }else{
            System.out.println("Ya no se puede llevar mas cursos");
        }
    }
}
