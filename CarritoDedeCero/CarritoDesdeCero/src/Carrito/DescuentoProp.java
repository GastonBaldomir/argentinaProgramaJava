package Carrito;

public class DescuentoProp extends Descuento{

	private double descuentoProp;
	
	public double dameMontoProp() {
		return descuentoProp;
	}
	public void asignaMontoProp(double montoProp) {
		if (montoProp==20) {//hacer todos estos if, seguramente no es lo mas optimo, pero tengo la duda si se hace esta 
			montoProp=0.80;// logica dentro de la clase descuentoPropor o si se hace desde la compraPrincipal
		}
		if (montoProp==30) {
			montoProp=0.70;  
		}
		if (montoProp==5) {
			montoProp=0.95;  
		}
		descuentoProp=montoProp;
	}
		
	public double montoFinal(double montoInicial) {
		return montoInicial * this.dameMontoProp();
	}
	
	
}
