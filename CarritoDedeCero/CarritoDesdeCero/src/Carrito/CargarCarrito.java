package Carrito;

public class CargarCarrito {
	private double totalItems;
	private Producto producto;
	private int cantidad;
	private Carrito carro;
	
	
	public CargarCarrito(Carrito carro, int cantidad, Producto producto) {
		this.carro=carro; 
		this.cantidad=cantidad;
		this.producto=producto;
		totalItems= producto.dimePrecioProd() * cantidad;
	};
	
	public double mostrarTotalItems() {
		return totalItems;
	}
	
	public String mostrarNombreProd() {
		return producto.dameNomProd();
	}
	public int mostrarCantidad() {
		return cantidad;
	}
	public void mostrarCarro() {
		System.out.println("Producto: " +producto.dameNomProd()+" -Precio: "+ producto.dimePrecioProd()+" -Cant: "+ cantidad +" -SubTotal: "+ mostrarTotalItems()); 
	}
}
