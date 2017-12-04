package prueba;
import model.Empleados;
import java.util.*;
/*
 * @author gpaculiar
 */
public class UsoEmpleado {
    public static void main(String[]args){
       
       Empleados listaEmpleados[]= new Empleados[5];

       listaEmpleados[0]=new Empleados("Ana",45,200);
       listaEmpleados[1]=new Empleados("Carlos",50,300);
       listaEmpleados[2]=new Empleados("Juan",55,600);
       listaEmpleados[3]=new Empleados("Pedro",60,700);
       listaEmpleados[4]=new Empleados("Pedro",60,700);
              
       for (Empleados e : listaEmpleados) {
            System.out.println(e.DameDatos());
       }
    } 
}
