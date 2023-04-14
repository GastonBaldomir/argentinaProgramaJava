package Carrito;

public class DescPorConTope extends Descuento {
	
	private double totalConDesc;
	private double descuento;
	
	public void descTope(double totalCarro) {
		double totalConDesc = totalCarro * 0.6;
		double descuento= totalCarro-totalConDesc;
		
		System.out.println(descuento);// es solo para controlar la variable y chequear que haga los descuentos
		if(descuento>=800) {
			descuento=800;
			System.out.println(descuento);// esta linea tambien es solo para chequear
		}
		this.totalConDesc=totalConDesc;
		this.descuento=descuento;
	}
	
	public double montoFinal(double montoInicial) {
		return montoInicial - this.descuento;
	}
	
	
}
