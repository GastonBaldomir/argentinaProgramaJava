package carritoDeCompras;

public class Carrito {

	private String id;
	private Cliente client;// string o cliente? si pongo la clase cliente no me funciona.
	private double montoTotal;
	
	public Carrito(String id,Cliente client) {
		this.id=id;
		this.client=client;
		montoTotal=0.0;
	}
	
	public String dameId() {
		return id;
	}
	public double dameMontoTotal() {
		return montoTotal;
	}
	public String personaCarro() { ///No se si este paso era necesario, para saber que persona
		return client.dameNombre();// es la propietaria del carro. 
	}
	public void sumarTotalCarro(ItemCarrito montoItem) {
		montoTotal= montoTotal+ montoItem.montoItem();
		
	}
}
