package entregaStrings;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Entrega4Punto3 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		String nombres = "Gaston/Nahuel/Leonel/Franco/ldana/Yamila/Noelia/Ayelen/Nerea/Gisela";
		String nombresSplit[] = nombres.split("/");
		
		for (String elemento : nombresSplit) {
			System.out.println(elemento);
		}
		Files.writeString(Paths.get("C:\\Users\\PC\\Desktop\\Cursos\\Curso Java-ARPRO\\practica\\Nombres.txt"), nombres);
		System.out.println("Tarea realizada");
	}

}
