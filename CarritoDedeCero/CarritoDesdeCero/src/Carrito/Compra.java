package Carrito;

import java.util.List;

import java.util.ArrayList;
import java.util.Iterator;

public class Compra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cliente cliente1= new Cliente("baldomir gaston", 38103651, "pinzon 123" );
		
		Producto atun =new Producto("atun", 300.50, 555);
		Producto yerba =new Producto("yerba pipo", 255, 222);
		Producto arroz =new Producto("arroz raly", 150, 333);
		
		Carrito carro1= new Carrito(25, cliente1);
		
		//CargarCarrito compra1= new CargarCarrito(carro1, 5 , atun);
		
		List<CargarCarrito>compra;
		compra=new ArrayList<CargarCarrito>();
		
		CargarCarrito item1 = new CargarCarrito( carro1, 0 , atun);
		CargarCarrito item2 = new CargarCarrito( carro1, 10 , yerba);
		CargarCarrito item3 = new CargarCarrito( carro1, 0 , arroz);
		compra.add(item3);
		compra.add(item1);
		compra.add(item2);
		
		//ejecución del programa
		
		carro1.identificarCarro();
		
		Iterator<CargarCarrito>ItCarro = compra.iterator();
		
		while (ItCarro.hasNext()) {
			CargarCarrito item = ItCarro.next();
			item.mostrarCarro();
			carro1.sumarTotal(item);
		}
		System.out.println("Total: "+" "+carro1.dameTotalCarro());
		if (carro1.dameTotalCarro() > 0) {
		
			if ((carro1.dameTotalCarro()<500) && (carro1.dameTotalCarro())>0) {
				DescuentoFijo dFijo = new DescuentoFijo();
				dFijo.asignaMonto(300);
				if(dFijo.montoFinal(carro1.dameTotalCarro())>0) {
					System.out.println("Total con Descuento fijo: "+" "+dFijo.montoFinal(carro1.dameTotalCarro()));
				}else System.out.println("El monto es negativo hay un error");
				
			}else if ((carro1.dameTotalCarro()>501) && (carro1.dameTotalCarro())<1500) {
				DescuentoProp dProp = new DescuentoProp();
				dProp.asignaMontoProp(30);
				if(dProp.montoFinal(carro1.dameTotalCarro())>0) {
					System.out.println("Total con Descuento por Porcentaje: "+" "+dProp.montoFinal(carro1.dameTotalCarro()));
				}else System.out.println("El monto es negativo hay un error");
			}else {
				DescPorConTope dTope = new DescPorConTope();
				dTope.descTope(carro1.dameTotalCarro());
				if(dTope.montoFinal(carro1.dameTotalCarro())>0) {
					System.out.println("Total con Descuento por Porcentajetope: "+" "+dTope.montoFinal(carro1.dameTotalCarro()));
				}else System.out.println("El monto es negativo hay un error");
			}
		}else System.out.println("Error, no se puede aplicar ningun descuento");

		
	}
	
	
}
