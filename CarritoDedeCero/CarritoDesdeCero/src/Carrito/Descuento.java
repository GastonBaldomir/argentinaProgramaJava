package Carrito;

public abstract class Descuento {
	
	private double montoDescuento;

	public double dameMontoDesc() {
		return montoDescuento;
	}
	public void asignaMonto(double monto) {
		montoDescuento=monto;
	}
	public abstract double montoFinal(double montoInicial);
}
