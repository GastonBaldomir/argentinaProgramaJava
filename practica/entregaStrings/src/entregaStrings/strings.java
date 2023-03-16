package entregaStrings;

public class strings {
	
	public static void main(String[] args) {
		
		// ejercicio 1 a.
		
		//String frase = "Buenas tardes para todos";
		//char letra = 'a';
		//int contador= 0;
		//int posicion= 0;
		
		//posicion= frase.indexOf(letra);//posicion toma el valor de la primer coincidencia
		
		//while (posicion != (-1)) {
			//contador ++;
			//posicion= frase.indexOf(letra, posicion+1);
		//}
		//System.out.print("la letra" +  letra +  "se repite" + contador  + "veces");
		
		//ejercicio 1 b.
		
		//int []numeros = {3,5,1};
		//int num1 = numeros[0]; 
		//int num2 = numeros[1]; 
		//int num3= numeros[2];
		//int menor = 0;
		//int mayor = 0;
		//int aux=0;
	
		//if ((num1<num2) && (num1<num3)){
			// menor=num1;
			//if (num2<num3){
					//mayor = num3;
					//aux=num2;
				//}
				//else { 
				//mayor = num2;
				//aux = num3;}
			
			
		//}else if
			//((num1<num2 && num1>num3) && (num3 < num2)){
				//menor = num3;
				//if (num1<num2){
					// mayor=num2;
					 //aux = num1;
				//}
				//else{ 
				//mayor=num1;
				//aux=num2;}
		//}	 	
			
			//else { 
			//menor = num2;
				//if(num1 > num3) {
					//mayor=num1;
					//aux=num3;
				//}else 
					//{mayor=num3;
					//aux=num1;}
			//}
		
		//numeros[2]=mayor;
		//numeros[1]=aux ; 
		//numeros[0]=menor;
		//System.out.print(numeros[0]);
		//System.out.print(numeros[1]);
		//System.out.print(numeros[2]);
		
		//ejercicio 1-c.
		
		int []numlist = {8,4,11,3,7,15,4,12,1};
		int numX=6;
		int resultado=0;
		
		for(int i=0; i<numlist.length;i++ ) {
			if(numlist[i]>numX) {
				resultado= resultado + numlist[i];
			}
		};
		System.out.print(resultado);
		//ejercicio 2.
		
		//String nombres = "Gaston/Nahuel/Leonel/Franco/ldana/Yamila/Noelia/Ayelen/Nerea/Gisela";
		//String nombresSplit[] = nombres.split("/");
		
		//for (String elemento : nombresSplit) {
			//System.out.println(elemento);
		//}
	}

	
}
