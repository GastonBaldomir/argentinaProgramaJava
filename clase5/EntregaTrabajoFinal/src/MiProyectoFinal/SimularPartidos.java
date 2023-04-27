package MiProyectoFinal;

import java.sql.*;

public class SimularPartidos {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Connection conex = DriverManager.getConnection("jdbc:mysql://localhost:3306/entregafinal","root","Liomessi10!");
			Statement sT= conex.createStatement();
			
			String consulta = "select * from persona";
			ResultSet datosDB = sT.executeQuery(consulta);
			
			int idP=0; String nombrep=""; int res1=0; int res2=0;
			while (datosDB.next()){
				//System.out.println(datosDB.getInt(1)+ datosDB.getString(2)+datosDB.getInt(3)+datosDB.getInt(4));
				 idP=datosDB.getInt(1);
				 nombrep=datosDB.getString(2);
				 res1=datosDB.getInt(3);
				 res2=datosDB.getInt(4); 
				 
			}
			Persona persona1 =new Persona(nombrep,idP);
			Persona persona2 =new Persona(nombrep,idP);
			
			Pronostico PrimerPron=new Pronostico(persona1, res1,res2);
			
			//Pronostico SegundoPron= new Pronostico(Juanita,2,2);
			
			Equipo Argentina = new Equipo("Argentina","Campeon del mundo");
			Equipo Brasil = new Equipo("Brasil","Se fue en cuartos");
			Partido partido1 =new Partido(Argentina,Brasil,3,2);
			
			Equipo Alemania= new Equipo("Alemania","Le gano Japon");
			Equipo España= new Equipo("España", "Campeon 2010");
			Partido partido2 = new Partido(España,Alemania,1,5);
			
			System.out.println("Partido: "+partido1.partidoEnJuego() );
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
				persona1.sumarPuntaje();
			};
			if(resultado2.mostrarResultado()==PrimerPron.pronostico2()) {
				persona1.sumarPuntaje();
			}
		//	if(resultado1.mostrarResultado()== SegundoPron.pronostico1()) {
			//	Juanita.sumarPuntaje();
			//};
			//if(resultado2.mostrarResultado()==SegundoPron.pronostico2()) {
				//Juanita.sumarPuntaje();
			//}
			System.out.println("Puntaje de "+" "+persona1.dameNombre()+" "+persona1.damePuntaje());
			//System.out.println("Puntaje de"+" "+Juanita.dameNombre()+" " +Juanita.damePuntaje());*/
		}catch(Exception e) {
			System.out.println("Error en la conexion");
			System.out.println(e.fillInStackTrace());
		}
		
		}
}
