package carritoDeCompras;

public class ItemCarrito {
	private Carrito carro;
	private Producto producto;
	private int cantidad;
	private double montoitem;

	public ItemCarrito (Carrito id, Producto producto, int cantidad) {
		this.carro=id;
		this.producto=producto;
		this.cantidad=cantidad;
		montoitem=producto.damePrecioProd() * cantidad;
	}
	
	public String identificar() {
		return carro.dameId();
	}
	public String identificarProducto() {
		return producto.dameNombreProd();
	}
	public int cantidad() {
		return cantidad;
	}
	public double montoItem() {
		return montoitem; 
	}
	public void mostrarItem() {
		System.out.println("Producto: " + producto.dameNombreProd() +" "+ "Precio: " + producto.damePrecioProd()+" "
		+ "cantidad: "+ cantidad +" "+ "SubTotal: "+ " " + montoitem  +" ");
	}
}
