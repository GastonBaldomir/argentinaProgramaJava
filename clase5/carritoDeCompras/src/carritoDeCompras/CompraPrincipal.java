package carritoDeCompras;

public class CompraPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cliente persona = new Cliente("Gaston Baldomir",38103651,"castelli 123");
		Cliente persona2 = new Cliente("Matias Navarro", 3810352, "mitre 333");
		
		Carrito carro1 = new Carrito("c1", persona);
		
		Producto cafe = new Producto("Cafe nini", 50.50);
		Producto yerba = new Producto("Yerba mate", 150.50);
		Producto te = new Producto("Te Helado", 90.00);
		
		ItemCarrito Item[]= new ItemCarrito[3];
		Item[0]= new ItemCarrito(carro1, yerba, 5);
		Item[1]= new ItemCarrito(carro1, te, 1);
		Item[2]= new ItemCarrito(carro1, cafe, 5);
		
		
		mostrarCompra(Item,carro1,persona);//metodo para comprar
		
		Descuento dFijo = new DescuentoFijo();//aplicar descuento fijo.
		dFijo.asignaMonto(150);
		System.out.println("Total con Descuento: "+" "+dFijo.montoFinal(carro1.dameMontoTotal()) );
		
		
		
	}
	public static void mostrarCompra(ItemCarrito CargaItem[], Carrito carro1,Cliente persona) {
		System.out.println("Carro: "+" "+carro1.dameId()+" "+ "Perteneciente a: "+" "+ carro1.personaCarro());
		for (ItemCarrito Item : CargaItem) {
			Item.mostrarItem();
			carro1.sumarTotalCarro(Item);;
		}
		System.out.println("Total: "+" "+carro1.dameMontoTotal());
	}
}
