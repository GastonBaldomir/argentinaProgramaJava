package Carrito;

public class Carrito {

	private int numCarro;
	private Cliente cliente;
	private double totalCarro;
	
	public Carrito (int numero,Cliente cliente) {
		numCarro=numero;
		this.cliente=cliente;
		totalCarro=0.0;
	}
	public void identificarCarro() {
		System.out.println("Cliente: " + clienteCarro()+ " Numero de Carro: " +numCarro());
	}
	public String clienteCarro() {
		return cliente.dameNombreCliente();
	}
	public int numCarro() {
		return numCarro;
	}
	public double dameTotalCarro() {
		return totalCarro;
	}
	public void sumarTotal(CargarCarrito totalItems) {
		totalCarro= totalCarro + totalItems.mostrarTotalItems();
	}
}
