package carritoDeCompras;

public class Cliente {

	private String nombre;
	private int dni;
	private String direccion;
	
	public Cliente(String nombre, int dni, String direccion) {
		this.nombre=nombre;
		this.dni=dni;
		this.direccion=direccion;
	}
	public String dameNombre() {
		return nombre;
	}
	public int dameDni() {
		return dni;
	}
	public String damedirec(){
		return direccion;
	}
}
