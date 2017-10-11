package pe.egcc.app.service;

public class Clase2 extends Clase1{

    public Clase2() {
        super("Gustavo");
    }

    @Override
    public int sumar(int n1, int n2) {
        int s;
        s = (n1 + n2) * (n1 - n2);
        return s;
    }
    
    public int producto(int n1, int n2){
        return (n1 * n2);
    }

}
