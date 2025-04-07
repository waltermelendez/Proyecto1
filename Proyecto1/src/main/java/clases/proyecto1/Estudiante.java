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
    private String[][] tab = new String[20][7];
    private int contadornota;

    public Estudiante(int Carnet, String Nombre, int Telefono, String Correo, String[][] TAB) {
        this.Carnet = Carnet;
        this.Nombre = Nombre;
        this.Telefono = Telefono;
        this.Correo = Correo;
        Estado = true;
        this.tab = new String[TAB.length][TAB[0].length];
        for (int i = 0; i < TAB.length; i++) {
            for (int j = 0; j < TAB[0].length; j++) {
                this.tab[i][j] = TAB[i][j];
            }
        }
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

    public void setdato(int i, int j, int k) {
        String convert = Integer.toString(k);
        tab[i][j] = convert;

    }

    public void setnombreM(int i, int j, String k) {

        tab[i][j] = k;

    }

    public String getdato(int i, int j) {
        return tab[i][j];
    }

    public int AgregarTabla(int i) {//Metodo para sumar notas en la matriz
        int total=0;
        String convert;
        for (int j = 1; j < 6; j++) {
            convert=tab[i][j];
            total=total+Integer.parseInt(convert);
        }
        return total;

    }

    public String nota(int i) {//Motodo para ver la bota final
        return tab[i][6];
    }



    //Funcion para ver el curso a buscar
    public String getCurso(int i) {
        String r = tab[i][0];
        return r;
    }

    public boolean buscarmateria(String i) {
        //Metodo para las asignaciones
        for (int j = 1; j < 20; j++) {
            if (tab[j][0].equals(i)) {
                return false;
            }
        }
        return true;
    }
    public boolean EF(){
        for (int i = 0; i < 20; i++) {
            if (tab[i][5].equals("0")) {
                return true;
            }
        }
        return false;
    }
    public boolean ER(){
        for (int i = 0; i < 20; i++) {
            if (tab[i][6].equals("0")) {
                return true;
            }
        }
        return false;
    }
    public int buscarM(String i) {
        //Metodo para las asignaciones
        for (int j = 1; j < 20; j++) {
            if (tab[j][0].equals(i)) {
                return j;
            }
        }
        return 0;
    }
    public int buscarvacio(){
    for (int j = 1; j < 20; j++) {
            if (tab[j][0].equals("0")) {
                return j;
            }
        }
        return 0;
    
    }

}
