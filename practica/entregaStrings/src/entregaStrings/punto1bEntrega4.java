package entregaStrings;

import java.util.Scanner;

public class punto1bEntrega4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner datos= new Scanner(System.in);
		
		System.out.println("Ingrese el primer numero que desea ordenar: ");
		int num1=datos.nextInt();
		System.out.println("Ingrese el siguiente numero que desea ordenar: ");
		int num2=datos.nextInt();
		System.out.println("Ingrese el ultimo numero que desea ordenar: ");
		int num3=datos.nextInt();
		System.out.println("Ingrese a o d, para ordenar ascendente o descenndete:  ");
		char letra= datos.next().charAt(0);
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
		
		vector[0]=mayor;
		vector[1]=aux ; 
		vector[2]=menor;
		
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
		
		vector[0]=menor;
		vector[1]=aux ; 
		vector[2]=mayor;
		
		}
		return vector;
	
 
	}

}
