package primerEntrega;

public class practica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Punto A.
		
		//int a = 5;
		//int b = 14;
		
		//while (a<=b) {
			//System.out.print(a);
			//a=a+1;
			//}
			
		
		//Punto B.
		//int a = 5;
		//int b = 14;
		
		//while (a<=b) {
			//if(a%2==0) {
			//System.out.print(a);
			//}
			//a=a+1;
		//}
		
		//PUNTO C.
		
		//int a = 5;
		//int b = 14;
		//boolean pares = false;// debo cambiar la variable manualmente para que sea true o false.
		
		//if(pares==true) {
			//while (a<=b) {
				//if(a%2==0) {
					//System.out.print(a);
				//}
				//a=a+1;
			//}
		//}else {
			//while (a<=b) {
			//if(a%2!=0) {
				//System.out.print(a);
				//}
				//a=a+1;
			//}
		//}
		
		//PUNTO D
		
		//int a = 5;
		//int b = 14;
				
		
		//for  (int i=b; b>=a; i-- ) {
			//while (b>=a) {
				//if(b%2!=0) {
					//System.out.print(b);
					//}
					//b=b-1;
				//}
		
		 //PUNTO 2 D
		
		float ingresos= 355000;
		int vehiculos= 2;
		int inmuebles= 1;
		boolean lujos= false;
		
		
		if (((ingresos<489083) && (vehiculos<3)) && ((inmuebles<3)&&(lujos!=true))) {
			System.out.print("la persona no exede los limites, es clase I");
			
		}else {
			System.out.print("La persona excede los limites, es clase III ");
		}
		
		
		
	}

}
