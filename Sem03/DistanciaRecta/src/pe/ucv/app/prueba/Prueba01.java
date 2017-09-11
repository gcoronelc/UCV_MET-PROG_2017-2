package pe.ucv.app.prueba;

import pe.ucv.app.service.Punto;

public class Prueba01 {
	
	public static void main(String[] args) {
		
		Punto p1 = new Punto();
		
		p1.setValorx(0);
		p1.setValory(0);
		
		System.out.println("X = " + p1.getValorx());
		System.out.println("Y = " + p1.getValory());
		System.out.println("Cuadrante: " 
				+ p1.obtenerCuadrante());
		
	}

}
