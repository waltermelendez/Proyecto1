/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.proyecto1;

/**
 *
 * @author walter
 */
public class Nodo {
    public int Carnet;
    public Nodo Izq;
    public Nodo Der;
   
    public Nodo(int Carnet) {
        this.Carnet = Carnet;
        this.Der=null;
        this.Izq=null;
        
    }

    @Override
    public String toString() {
        return "Nodo{" + "Carnet=" + Carnet + '}';
    }
    
}
