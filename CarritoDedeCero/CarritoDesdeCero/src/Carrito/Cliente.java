package Carrito;

public class Cliente {
	private String nombreCliente;
	private int dni;
	private String direccion;
	
	public Cliente (String nombre, int dni, String direccion) {
		nombreCliente=nombre;
		this.dni=dni;
		this.direccion=direccion;
	}
	public String dameNombreCliente() {
		return nombreCliente;
	}
	public String infoCliente() {
		return nombreCliente +" " +direccion + dni;
	}
}
