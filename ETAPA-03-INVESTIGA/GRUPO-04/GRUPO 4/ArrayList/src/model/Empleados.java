
package model;

/*
 * @author gpaculiar
 */
public class Empleados {
    private String  nombre;
    private int edad;
    private double salario;

    public Empleados(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }
    
    public Empleados() {
    }
    
    public String DameDatos(){
        return "El nombre es: "+nombre+". Tiene la edad: "+edad+". Y gana de Sueldo: "+salario;
    }
}
