package entregaStrings;

public class entrega4 {
	public static void main(String[] args) {
		
		int num1=12;
		int num2=22;
		int num3=43;
		char letra= 'a';
		int vector[] = new int[2];
		ordenar(num1,num2,num3, letra);
		
	}
	
	
	static int[] ordenar(int num1,int num2,int num3,char letra){
		int vector[] = new int[2];
		int menor;
		int mayor;
		int aux;
		if(letra=='a') {
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
		return vector;
	
} 
}

