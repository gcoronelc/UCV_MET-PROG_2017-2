package pe.egcc.app.prueba;

import pe.egcc.app.service.Clase1;
import pe.egcc.app.service.Clase4;

public class Prueba03 {
    
    public static void main(String[] args) {
        
        Clase4 bean = new Clase4();
        
        Clase1 otroBean = bean;
        
        int s = otroBean.sumar(5, 3);
        
        System.out.println("S: " + s);
        
    }
}
