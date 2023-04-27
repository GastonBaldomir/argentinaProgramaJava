package MiProyectoFinal;

public class Equipo {

	private String nombre;
	private String descripcion;
	
	public Equipo(String nombre, String descripcion) {
		this.nombre=nombre;
		this.descripcion=descripcion;
	}
	
	public String dameEquipo() {
		return nombre;
	}
	public String descripcionEquipo() {
		return descripcion;
	}
}
