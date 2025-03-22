/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.proyecto1;

/**
 *
 * @author walter
 */
public class Curso {
    private  int CodigoCurso;
    private int creditos;
    private String Nombre;
    private boolean estado;

    public Curso(int CodigoCurso, int creditos, String Nombre) {
        this.CodigoCurso = CodigoCurso;
        this.creditos = creditos;
        this.Nombre = Nombre;
        estado=true;
    }

    public Curso() {
    }

    @Override
    public String toString() {
        return "Curso {" + "CodigoCurso=" + CodigoCurso + ", creditos=" + creditos + ", Nombre=" + Nombre + ", estado=" + estado + '}';
    }

    
    public int getCodigoCurso() {
        return CodigoCurso;
    }

    public void setCodigoCurso(int CodigoCurso) {
        this.CodigoCurso = CodigoCurso;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    
}
