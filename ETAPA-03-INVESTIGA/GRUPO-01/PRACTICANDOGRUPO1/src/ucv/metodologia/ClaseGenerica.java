package ucv.metodologia;

public class ClaseGenerica<T> {
    
    private T objeto;

    public ClaseGenerica(T objeto) {
        this.objeto = objeto;
    }
    
    public void mostrarTipo(){
        
        System.out.println("T es un ==>  " + objeto.getClass().getName());
    }
}