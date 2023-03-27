package entregaStrings;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

public class entrega4Punto2 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
				
		File archivo = new File("C:\\\\Users\\\\PC\\\\Desktop\\\\Cursos\\\\Curso Java-ARPRO\\\\practica\\\\DocumentoNum.txt");
		int suma=0;
		
		Scanner entradaNum= new Scanner(archivo);
		while(entradaNum.hasNextInt()) {
			suma= suma + entradaNum.nextInt();
		}
		System.out.println("la suma de los numeros es : " + suma);
		
	}
	
	
	}



