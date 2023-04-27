package MiProyectoFinal;

public class Persona {

	private String nombre;
	private int id;
	private int puntaje;
	
	public Persona (String nombre, int id) {
		this.nombre=nombre;
		this.id=id;
		puntaje=0;
	}
	
	public String dameNombre() {
		return nombre;
	}
	public int damePuntaje() {
		return puntaje;
	}
	public void sumarPuntaje() {
		puntaje=puntaje+1;
	}
}