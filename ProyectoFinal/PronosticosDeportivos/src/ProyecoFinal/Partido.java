package ProyecoFinal;

public class Partido {

	private Equipo equipo1;
	private Equipo equipo2;
	private int golesEquipo1;
	private int golesEquipo2;
	
	public Partido(Equipo equipo1, Equipo equipo2, int goles1,int goles2) {
		this.equipo1=equipo1;
		this.equipo2=equipo2;
		golesEquipo1=goles1;
		golesEquipo2=goles2;
	}
	public String equipo1() {
		return equipo1.dameEquipo();
	}
	public String equipo2() {
		return equipo2.dameEquipo();
	}
	public int damegoles1() {
		return golesEquipo1;
	}
	public int damegoles2() {
		return golesEquipo2;
		}
	public String partidoEnJuego() {
		return equipo1.dameEquipo() +" "+ "Vs"+" "+ equipo2.dameEquipo();
	}
	public String resultadoPartidoEnNum() {
		return  equipo1.dameEquipo()+" "+ this.golesEquipo1 +" "+ equipo2.dameEquipo()+" "+ this.golesEquipo2;
	}
	

}
