package pe.ucv.pagoapp.prueba;

import pe.ucv.pagoapp.model.PagoModel;
import pe.ucv.pagoapp.service.PagoService;

public class Prueba01 {

	public static void main(String[] args) {
		
		// Datos
		PagoModel bean = new PagoModel(6, 20, 140);
		
		// Proceso
		PagoService service = new PagoService();
		bean = service.procesar(bean);
		
		// Reporte
		System.out.println("Ingresos: " + bean.getIngresos());
		System.out.println("Renta: " + bean.getRenta());
		System.out.println("Neto: " + bean.getNeto());
		
	}
}
