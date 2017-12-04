
package metodosgenericos;

import java.util.ArrayList;


public class MetodosGenericos {

    
    public static void main(String[] args) {
        String nombres[]={"jose","ana","alfredo","pepe","wilmer","coronel","PEPE"};
        String elementos=MisMatrices.getElementos(nombres);
        System.out.println(elementos);
        
        
    }
    
}
class MisMatrices{

    public static <T> String getElementos(T[]a){

        return "el array tiene : "+a.length+" elementos";
}


}
