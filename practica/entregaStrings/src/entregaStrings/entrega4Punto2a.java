package entregaStrings;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class entrega4Punto2a {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		File archivo = new File("C:\\\\Users\\\\PC\\\\Desktop\\\\Cursos\\\\Curso Java-ARPRO\\\\practica\\\\DocumentoNum.txt");
		int suma=0;
		int multi=0;
		Scanner datos= new Scanner(System.in);
		System.out.println("Ingrese la operacion: ");
		char operacion= datos.next().charAt(0);
	
		if(operacion== '+') {
			Scanner entradaNum= new Scanner(archivo);
			while(entradaNum.hasNextInt()) {
				suma= suma + entradaNum.nextInt();
			}
			System.out.println("la suma de los numeros es : " + suma);
		}else if(operacion=='*'){
			Scanner entradaNum= new Scanner(archivo);
			while(entradaNum.hasNextInt()) {
				if(multi==0) {
					multi=entradaNum.nextInt();
				}else
					multi= multi * entradaNum.nextInt();
			}
			System.out.println("la multiplicacion de los numeros es : " + multi);
		}
    }
}
