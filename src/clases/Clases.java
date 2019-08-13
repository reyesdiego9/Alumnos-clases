/*
Juan Diego Reyes Zepeda
5090-18-5233
*/
package clases;


class Alumnos{
    private String nombre;
    private String apellido;
    private int n1,n2,n3,n4;
    private double prom;
    
    Alumnos(String nombre, String apellido, int n1, int n2, int n3, int n4, double prom){
        this.nombre = nombre;
        this.apellido = apellido;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
        this.n4 = n4;
        this.prom = prom;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setN1(int n1){
        this.n1 = n1;
    }
    public void setN2(int n2){
        this.n2 = n2;
    }
    public void setN3(int n3){
        this.n3 = n3;
    }
    public void setN4(int n4){
        this.n4 = n4;
    }
    public void setProm(double prom){
        this.prom = prom;
    }
    
    public String getNombre(){return nombre;}
    public String getApellido(){return apellido;}
    public int getN1(){return n1;}
    public int getN2(){return n2;}
    public int getN3(){return n3;}
    public int getN4(){return n4;}
    public double getProm(){return prom;}
    
}

public class Clases {

    
    public static void main(String[] args) {
       
    }
    
}
