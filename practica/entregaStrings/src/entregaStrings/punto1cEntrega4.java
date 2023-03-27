package entregaStrings;

import java.util.Scanner;

public class punto1cEntrega4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1=' ';
		int num2=2;
		int num3=5;
		char letra=' ';
		Scanner datos= new Scanner(System.in);
		
		
		if(num1==' ') {
		System.out.println("Ingrese el primer numero que desea ordenar: ");
		  num1=datos.nextInt();
		}
			
		if(num2==' ') {
		System.out.println("Ingrese el siguiente numero que desea ordenar: ");
		 num2=datos.nextInt();
		}
		if(num3==' ') {
		System.out.println("Ingrese el ultimo numero que desea ordenar: ");
		 num3=datos.nextInt();
		}
		 if(letra==' ') {
		System.out.println("Ingrese a o d, para ordenar ascendente o descenndete:  ");
		 letra= datos.next().charAt(0);
		 }
		 
		datos.close();
		int vector[] = new int[3];
		
		vector = ordenar(num1,num2,num3, letra);
		
		
		System.out.println(vector[0] +" " + vector[1]+" "  + vector[2]);
	}
	
	
	static int[] ordenar(int num1,int num2,int num3,char letra){
		int vector[] = new int[3];
		int menor;
		int mayor;
		int aux;
		if(letra == 'a') {
			if ((num1<num2) && (num1<num3)){
			 menor= num1;
			if (num2<num3){
					mayor = num3;
					aux=num2;
				}
				else { 
				mayor = num2;
				aux = num3;}
			
			
		}else if
			((num1<num2 && num1>num3) && (num3 < num2)){
				menor = num3;
				if (num1<num2){
				 mayor=num2;
					 aux = num1;
				}
				else{ 
				mayor=num1;
				aux=num2;}
		}	 	
			
			else { 
			menor = num2;
				if(num1 > num3) {
					mayor=num1;
					aux=num3;
				}else 
					{mayor=num3;
					aux=num1;}
			}
		
		vector[2]=mayor;
		vector[1]=aux ; 
		vector[0]=menor;
		
		}
		else if(letra=='d') {
			if ((num1<num2) && (num1<num3)){
			 menor= num1;
			if (num2<num3){
					mayor = num3;
					aux=num2;
				}
				else { 
				mayor = num2;
				aux = num3;}
			
			
		}else if
			((num1<num2 && num1>num3) && (num3 < num2)){
				menor = num3;
				if (num1<num2){
				 mayor=num2;
					 aux = num1;
				}
				else{ 
				mayor=num1;
				aux=num2;}
		}	 	
			
			else { 
			menor = num2;
				if(num1 > num3) {
					mayor=num1;
					aux=num3;
				}else 
					{mayor=num3;
					aux=num1;}
			}
		
		vector[2]=menor;
		vector[1]=aux ; 
		vector[0]=mayor;
		
		}
		return vector;
	
	}

}
