
package clasegenerica;


public class ClaseGenerica<T> {
    private T elemento;
    public ClaseGenerica(T e){
    
        elemento=e;
    }
    public T getElemento(){
    
        return elemento;
    }
    
    
    public static void main(String[] args) {
        ClaseGenerica<Integer>num=new ClaseGenerica<>(5000);
        System.out.println("el numero es: ");
        ClaseGenerica<String>carac=new ClaseGenerica<>("hola ingeniero de sistemas");
        System.out.println(":"+carac);
        
        
    
}}
