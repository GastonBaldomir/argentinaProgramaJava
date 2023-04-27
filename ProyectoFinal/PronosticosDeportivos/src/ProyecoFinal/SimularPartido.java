package ProyecoFinal;


public class SimularPartido{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Persona Juan =new Persona("Juan",1);
		Persona Juanita =new Persona("Juanita",2);
		
		Pronostico PrimerPron=new Pronostico(Juan, 1,2);
		Pronostico SegundoPron= new Pronostico(Juanita,2,2);
		
		Equipo Argentina = new Equipo("Argentina","Campeon del mundo");
		Equipo Brasil = new Equipo("Brasil","Se fue en cuartos");
		Partido partido1 =new Partido(Argentina,Brasil,3,2);
		
		Equipo Alemania= new Equipo("Alemania","Le gano Japon");
		Equipo España= new Equipo("España", "Campeon 2010");
		Partido partido2 = new Partido(España,Alemania,1,5);
	
		System.out.println("Partido: "+ partido1.partidoEnJuego());
		System.out.println(partido1.resultadoPartidoEnNum());
		Resultado resultado1 = new Resultado();
		resultado1.asignaResultado(partido1);
		resultado1.asignaGanador(resultado1, partido1);
		System.out.println(resultado1.mostrarGanador());
		
		System.out.println("Partido: "+ partido2.partidoEnJuego());
		System.out.println(partido2.resultadoPartidoEnNum());
		Resultado resultado2 = new Resultado();
		resultado2.asignaResultado(partido2);
		resultado2.asignaGanador(resultado2, partido2);
		System.out.println(resultado2.mostrarGanador());
		
		
		if(resultado1.mostrarResultado()== PrimerPron.pronostico1()) {
			Juan.sumarPuntaje();
		};
		if(resultado2.mostrarResultado()==PrimerPron.pronostico2()) {
			Juan.sumarPuntaje();
		}
		if(resultado1.mostrarResultado()== SegundoPron.pronostico1()) {
			Juanita.sumarPuntaje();
		};
		if(resultado2.mostrarResultado()==SegundoPron.pronostico2()) {
			Juanita.sumarPuntaje();
		}
		System.out.println("Puntaje de "+" "+Juan.dameNombre()+" "+Juan.damePuntaje());
		System.out.println("Puntaje de"+" "+Juanita.dameNombre()+" " +Juanita.damePuntaje());
	}

}
