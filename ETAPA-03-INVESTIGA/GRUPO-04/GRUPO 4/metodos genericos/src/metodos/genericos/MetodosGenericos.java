
package metodos.genericos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
public class MetodosGenericos {

    
    public static void main(String[] args) {
        Collection<String>lista=new ArrayList<String>(Arrays.asList("a","b","c"));
        Collection<String>nueva=duplicarCollection(lista);
        nueva.forEach(x-> System.out.println(x));
    
}

    public static <T> Collection<T> duplicarCollection(Collection<T> coleccion) {
        coleccion.addAll(coleccion);
        return coleccion;        
    }}
