package ProyecoFinal;

public class Resultado {

	//no tiene constructor, solamente un metodo
	
	
	private int resultado;
	private String ganador;

	public String mostrarGanador() {
		return ganador;
	}
	
	public int mostrarResultado() {
		
		return resultado;
	}
	
	public void asignaGanador(Resultado resultado, Partido partido) {
		if(resultado.mostrarResultado()==1) {
			ganador="ganador"+" "+partido.equipo1();
		}else if(resultado.mostrarResultado()==2) {
			ganador="ganador"+" "+partido.equipo2();
		}else {
			ganador="Empate";
		}
	}
	
	public void asignaResultado(Partido partido) {
		
			if(partido.damegoles1() > partido.damegoles2()) {
				resultado=1;
			}
			else if(partido.damegoles1() < partido.damegoles2()) {
				resultado=2;
			}else {
				resultado=0;
			}
		}
	
}
	

