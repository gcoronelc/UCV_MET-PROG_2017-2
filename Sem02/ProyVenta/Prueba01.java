public class Prueba01{
	
	public static void main( String[] args ){
		
		// Datos
		double precio = 567.89;
		int cant = 7;
		
		// Proceso
		AppService service = new AppService();
		double total = service.calcTotal(precio, cant);
		double importe = service.calcImporte(total);
		double impuesto = service.calcImpuesto(total);

		// Reporte
		System.out.println("INPUT");
		System.out.println("Precio: " + precio);
		System.out.println("Cantidad: " + cant);
		System.out.println("OUTPUT");
		System.out.println("Importe: " + importe);
		System.out.println("Impuesto: " + impuesto);
		System.out.println("Total: " + total);
		
	}
	
	
}