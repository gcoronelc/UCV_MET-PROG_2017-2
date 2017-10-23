package Entrenamiento1;

import java.util.HashSet;
import java.util.Set;

public class Prueba {
    
    public static void main(String[] args) {
        
        //  CREAMOS NUESTROS OBJETOS DE TIPO "CLIENTE"
        
        //  DAMOS EL NOMBRE Y LE PONEMOS LOS PARAMETROS DEL CONSTRUCTOR
        Cliente c1 = new Cliente("luis", "48222681", 2000.0);
        Cliente c2 = new Cliente("jorge", "48254654", 3000.0);
        Cliente c3 = new Cliente("mario", "484564223", 4000.0);
        
        Set<Cliente> tienda = new HashSet<Cliente>();
        
        //  "add" TE PERMITE AGREGAR A UNA COLECCIÓN
       
        tienda.add(c1);
        tienda.add(c2);
        tienda.add(c3);
        
        //  EL CICLO FOR NOS PERMITIRÁ RECORRER LAS COLECCIONES
        for(Cliente i : tienda){
            
            System.out.println(i.getNombre()+" "+i.getDni()+" "+i.getSaldo());
        }             
    }
}