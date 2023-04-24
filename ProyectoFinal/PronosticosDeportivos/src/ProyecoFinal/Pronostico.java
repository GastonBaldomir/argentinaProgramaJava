package ProyecoFinal;

public class Pronostico {
	
	private Persona usuario;
	private int pronostico1;
	private int pronostico2;
	
	public Pronostico(Persona usuario,int pronostico1,int pronostico2) {
		this.usuario=usuario;
		this.pronostico1=pronostico1;
		this.pronostico2=pronostico2;
	}
	public int pronostico1() {
		return pronostico1;
	}
	public int pronostico2() {
		return pronostico2;
	}
	
}
