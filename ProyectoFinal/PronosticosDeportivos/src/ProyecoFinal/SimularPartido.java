package ProyecoFinal;

public class SimularPartido {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Equipo Argentina = new Equipo("Argentina","Campeon del mundo");
		Equipo Brasil = new Equipo("Brasil","Se fue en cuartos");
		Partido partido1 =new Partido(Argentina,Brasil,3,2);
		
		System.out.println("Partido: "+ partido1.partidoEnJuego());
		System.out.println(partido1.resultadoPartidoEnNum());
		Resultado resultado1 = new Resultado();
		resultado1.asignaResultado(partido1);
		resultado1.asignaGanador(resultado1, partido1);
		System.out.println(resultado1.mostrarGanador());
		
		
	}

}
