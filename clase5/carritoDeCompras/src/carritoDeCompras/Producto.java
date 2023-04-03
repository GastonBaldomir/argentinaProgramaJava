package carritoDeCompras;

public class Producto {

	private String nombreProd;
	private double precio;
	
	public Producto(String nombreProd, double precio) {
		this.nombreProd=nombreProd;
		this.precio=precio;
	}
	
	public String dameNombreProd() {
		return nombreProd;
	}
	public double damePrecioProd() {
		return precio;
	}
}
