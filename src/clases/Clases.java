/*
Juan Diego Reyes Zepeda
5090-18-5233
*/
package clases;
import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import java.util.ArrayList;
import javax.swing.JScrollPane;

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

public class Clases extends JFrame implements ActionListener{
    ArrayList <Alumnos> alum = new ArrayList <>();
    JLabel nombre, apellido, n1, n2, n3, n4; 
    JTextField nom, apell, no1, no2, no3, no4, no5;
    JButton ingresa;
    JPanel panel, panel2;
    JTextArea datos;
    
    public void menu(){
        String opcion;
        int opc;
        do{
            opcion = JOptionPane.showInputDialog("\tMenu"
                    + "\n1) Ingreso de Estudiante");
            opc = Integer.parseInt(opcion);
            switch(opc){
                case 1: ingreso(); break;
                case 2: mostrar(); break;
            }
        }while(opc > 2 || opc < 1 );    
    }
    
    public static void main(String[] args) {
       Clases cd = new Clases();
       cd.menu();
    }
    
    public void ingreso(){
        // JLabel
        nombre = new JLabel("Nombre");
        nombre.setBounds(10, 20, 80, 30);
        apellido = new JLabel("Apellido");
        apellido.setBounds(10, 60, 80, 30);
        n1 = new JLabel("Nota 1");
        n1.setBounds(10, 100, 80, 30);
        n2 = new JLabel("Nota 2");
        n2.setBounds(10, 140, 80, 30);
        n3 = new JLabel("Nota 3");
        n3.setBounds(10, 180, 80, 30);
        n4 = new JLabel("Nota 4");
        n4.setBounds(10, 220, 80, 30);
        
        //JTextfield
        nom = new JTextField();
        nom.setBounds(100, 20, 140, 30);
        apell = new JTextField();
        apell.setBounds(100, 60, 140, 30);
        no1 = new JTextField();
        no1.setBounds(100, 100, 80, 30);
        no2 = new JTextField();
        no2.setBounds(100, 140, 80, 30);
        no3 = new JTextField();
        no3.setBounds(100, 180, 80, 30);
        no4 = new JTextField();
        no4.setBounds(100, 220, 80, 30);

        
        ingresa = new JButton("Ingresar");
        ingresa.setBounds(180, 255, 100, 40);
        ingresa.addActionListener(this);
        
        panel = new JPanel();
        panel.setLayout(null);
        
        panel.add(nombre);
        panel.add(apellido);
        panel.add(n1);
        panel.add(n2);
        panel.add(n3);
        panel.add(n4);
        panel.add(nom);
        panel.add(apell);
        panel.add(no1);
        panel.add(no2);
        panel.add(no3);
        panel.add(no4);
        panel.add(ingresa);
        add(panel);
        setSize(300,345);
        setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==ingresa){
            capturar();
            limpiar();
            panel.setVisible(false);
            menu();
        }
    }
    
    public void capturar(){
        JOptionPane.showMessageDialog(null, "Alumno Ingresado");
        int nota1 = Integer.parseInt(no1.getText());
        int nota2 = Integer.parseInt(no2.getText());
        int nota3 = Integer.parseInt(no3.getText());
        int nota4 = Integer.parseInt(no4.getText());
        double promedio = (nota1 + nota2 + nota3 + nota4)/4;
        alum.add(new Alumnos(nom.getText(),apell.getText(),nota1,nota2,nota3,nota4,promedio));
    }
    
    public void limpiar(){
        nom.setText("");
        apell.setText("");
        no1.setText("");
        no2.setText("");
        no3.setText("");
        no4.setText("");
    }
    
    public void mostrar(){
        
        datos = new JTextArea();

        
        panel2 = new JPanel();
        panel2.setLayout(null);
       JScrollPane scroll = new JScrollPane(datos);
//        scroll.setBounds(10, 10, 250, 300);
        for(int i = 0; i<alum.size(); i++){
            datos.append("Nombre: "+alum.get(i).getNombre());
            datos.append("\tApellido: "+alum.get(i).getApellido()+"\tNota 1: "+alum.get(i).getN1());
            datos.append("\tNota 2: "+alum.get(i).getN2());
            datos.append("\tNota 3: "+alum.get(i).getN3());
            datos.append("\tNota 4: "+alum.get(i).getN4());
            datos.append("\tPromedio: "+alum.get(i).getProm()+"\n");
        }
        
       
        
        this.add(scroll);
        add(panel2);
        setSize(300,345);
        setVisible(true);
        panel.setVisible(false);
    }
    
}
