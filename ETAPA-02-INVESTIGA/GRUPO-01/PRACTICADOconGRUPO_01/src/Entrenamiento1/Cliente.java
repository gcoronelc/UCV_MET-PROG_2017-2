package Entrenamiento1;

public class Cliente {
    
    //  CREAMOS LOS DATOS
    private String nombre;
    private String dni;
    private double saldo;
    
    //  CREAMOS EL CONSTRUCTOR
    public Cliente(String nombre, String dni, double saldo) {
        this.nombre = nombre;
        this.dni = dni;
        this.saldo = saldo;
    }
    
    //  CREAMOS LOS GETER AND SETER
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }    
}