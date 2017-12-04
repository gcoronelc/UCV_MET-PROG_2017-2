
package arreylist;

import java.util.ArrayList;


public class ArreyList {

    
    public static void main(String[] args) {
        /*/Empleado listaEmpleados[]=new Empleado[5];
        listaEmpleados[0]=new Empleado("ana", 10, 100);
        listaEmpleados[1]=new Empleado("juan", 20, 200);
        listaEmpleados[2]=new Empleado("ana", 40, 1000);
        listaEmpleados[3]=new Empleado("ana", 30, 1000);
        listaEmpleados[4]=new Empleado("ana", 30, 1000);/*/
        
        ArrayList<Empleado>listaEmpleado=new ArrayList<>();
        listaEmpleado.add(new Empleado("juan", 12, 100));
        listaEmpleado.add(new Empleado("juan", 12, 100));
        listaEmpleado.add(new Empleado("juan", 12, 100));
        listaEmpleado.add(new Empleado("juan", 12, 100));
        listaEmpleado.add(new Empleado("juan", 12, 100));
        listaEmpleado.add(new Empleado("juan", 12, 100));
        listaEmpleado.add(new Empleado("juan", 12, 100));
        listaEmpleado.add(new Empleado("juan", 12, 100));
        listaEmpleado.add(new Empleado("juan", 12, 100));
        listaEmpleado.add(new Empleado("juan", 12, 100));
        listaEmpleado.add(new Empleado("juan", 12, 100));
        listaEmpleado.add(new Empleado("juan", 12, 100));
        listaEmpleado.add(new Empleado("juan", 12, 100));
        listaEmpleado.add(new Empleado("juan", 12, 100));
        listaEmpleado.add(new Empleado("juan", 12, 100));
        listaEmpleado.add(new Empleado("juan", 12, 100));
        listaEmpleado.add(new Empleado("juan", 12, 100));
        listaEmpleado.add(new Empleado("juan", 12, 100));
        listaEmpleado.add(new Empleado("juan", 12, 100));
        listaEmpleado.add(new Empleado("juan", 12, 100));
        listaEmpleado.add(new Empleado("juan", 12, 100));
        listaEmpleado.add(new Empleado("juan", 12, 100));
        listaEmpleado.add(new Empleado("juan", 12, 100));
        listaEmpleado.add(new Empleado("juan", 12, 100));
        listaEmpleado.add(new Empleado("juan", 12, 100));
        listaEmpleado.add(new Empleado("juan", 12, 100));
        listaEmpleado.add(new Empleado("ana", 21, 2100));
        
        
        for(Empleado e :listaEmpleado ){
            System.out.println(e.DameDatos());
        
        }
    }
    
}
class Empleado{

    public Empleado(String nombre,int edad,double salario){
    
        this.nombre=nombre;
        this.edad=edad;
        this.salario=salario;
    
    }
    public String DameDatos(){
      return "El empleado se llama  "+nombre+"  tiene  "+edad+"  años  "+"  y un salario  "+salario;  
    }

    
    private int edad;
    private double salario;
    private String nombre;
    
}
   