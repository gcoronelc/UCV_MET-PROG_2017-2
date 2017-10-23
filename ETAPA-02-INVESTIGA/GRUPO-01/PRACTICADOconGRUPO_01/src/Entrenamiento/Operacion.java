package Entrenamiento;

import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Operacion {

    ArrayList<Persona> lista;
    Persona objPersona;

    //  CONSTRUCTOR
    public Operacion() {
        
        lista = new ArrayList<Persona>();
        
    }
    public static void main(String[] args) {
        
        Operacion bean = new Operacion();
        
        bean.Adicionar();
        bean.Mostrar();
    }
    public void Adicionar(){
        
        int ope;
        do{
            objPersona = new Persona();
            
            objPersona.setCodigo(JOptionPane.showInputDialog("INGRESE SU CODIGO"));
            objPersona.setNombre(JOptionPane.showInputDialog("INGRESE SU NOMBRE"));
            objPersona.setApellido(JOptionPane.showInputDialog("INGRESE SU APELLIDO"));
            objPersona.setEdad(JOptionPane.showInputDialog("INGRESE SU EDAD"));
            lista.add(objPersona);
            
            ope = Integer.parseInt(JOptionPane.showInputDialog("¿ DESEAS SEGUIR ? \n 1 ==> SI \n 2 ==> NO"));
            
        }while(ope == 1);
    }
    public void Mostrar(){
        
        String acumulador = "";
        for(Persona obj : lista){
            
            acumulador = acumulador+" "+ obj.getCodigo()
                                   +" "+ obj.getNombre()
                                   +" "+ obj.getApellido()
                                   +" "+ obj.getEdad()+"\n";            
        }
        JOptionPane.showMessageDialog(null, acumulador);
    }
}