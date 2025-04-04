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
    private String  [] [] tab= new String [20][7];

    public Estudiante(int Carnet, String Nombre, int Telefono, String Correo) {
        this.Carnet = Carnet;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.Correo = Correo;
        Estado=true;
       this.tab=tab;
    }

    public void setTab(String[][] tab) {
        this.tab = tab;
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
    
    public void AgregarTabla(int nota){//Metodo para agregar notas en la matriz
       
       String convert = Integer.toString(nota);
        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 5; j++) {
                if (this.tab[i][j].equals("0")) {
                    this.tab[i][j]=convert;
                    //System.out.println(tab[i][j]);
                    
                    i=20;//Break del ciclo de i
                    break;
                }
                
                
            }
        }
       //metodo de suma de la nota final
       int num=0;
       int total=0;
        for (int i = 1; i < 20; i++) {
            for (int j = 1; j < 6; j++) {
                convert=this.tab[i][j];
                num=Integer.parseInt(convert);
                total=total+num;
            }
            
            this.tab[i][6]=Integer.toString(total);
            total =0;
            
        }
        
    }
    public String nota(int i){//Motodo para ver la bota final
    return tab[i][6];
    }
    
    public void agregarER(int dato1,int i){
        String convert= Integer.toString(dato1);
    tab[i][5]=convert;
    //metodo de suma de la nota final
    
    
       int num=0;
       int total=0;
       for (int k = 1; k < 6; k++) {
                convert=this.tab[i][k];
                num=Integer.parseInt(convert);
                total=total+num;
            }
    this.tab[i][6]=Integer.toString(total);
    }
    
    public void AgregarMateria(String Materia){ //Metodo para agregar materias en la matriz
     for (int i = 1; i < 20; i++) {

            if (tab[i][0].equals("0")) {
                tab[i][0]=Materia;
                break;
            } 
        }
  
    }
    //Funcion para ver el curso a buscar
    public String getCurso(int i){
    String r= tab[i][0];
    return r;
    }
    
    //Imrprimir la tabla de cada estudiante
    public void mostrarTabla(){
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("| "+tab[i][j]+" |");
            }
            System.out.println(" ");
        }
    }
    
    
}
