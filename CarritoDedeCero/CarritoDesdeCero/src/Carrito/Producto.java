package Carrito;

public class Producto {
	
	private String nombreProd;
	private double precio;
	private int idCod;

	public Producto (String nombre,double precio,int id) {
		nombreProd=nombre;
		this.precio=precio;
		idCod=id;
	}
	
	public String dameNomProd() {
		return nombreProd;
	}
	public double dimePrecioProd() {
		return precio;
	}
}
