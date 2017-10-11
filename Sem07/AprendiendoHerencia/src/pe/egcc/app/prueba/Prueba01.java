package pe.egcc.app.prueba;

import pe.egcc.app.service.Clase4;

public class Prueba01 {
    
    public static void main(String[] args) {
        Clase4 bean = new Clase4();
        
        int s = bean.sumar(5, 3);
        
        System.out.println("S: " + s);
    }
}
