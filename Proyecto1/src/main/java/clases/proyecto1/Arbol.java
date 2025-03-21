/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clases.proyecto1;

/**
 *
 * @author walter
 */
public class Arbol {
     Nodo raiz;
    public Arbol()
            {
            raiz =null;
            }
    public void agregar_nodo(int dato){
    Nodo nuevo = new Nodo(dato);
    if(raiz==null){
        //Cuando esta vacio
    raiz = nuevo;
    
    }else
    {
        Nodo Auxiliar= raiz;
        Nodo padre;
        while(true)
        {
        padre= Auxiliar;
        if(dato<Auxiliar.Carnet)//Cuando es menor
        {
            Auxiliar = Auxiliar.Izq;
            if(Auxiliar==null)
            {
            padre.Izq=nuevo;
            return;//Sirve para final el metodo.
            }
        }else //Cuando es mayor
        {
        Auxiliar= Auxiliar.Der;
            if (Auxiliar==null) {
                padre.Der=nuevo;
             return;
            }
        }
        }
    }
    
    }
    public boolean estavacio(){
return raiz == null;
}
    public void InOrder(Nodo R){
        if (R!=null) {
            InOrder(R.Izq);
            System.out.println(R.toString());
            InOrder(R.Der);
          
        }
    
    }
}
