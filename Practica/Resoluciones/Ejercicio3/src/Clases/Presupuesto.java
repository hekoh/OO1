package Clases;
import java.time.LocalDate; 
import java.util.List;
import java.util.ArrayList;

public class Presupuesto {
	private LocalDate fecha;
	private String cliente;
	private List<Item> items;

	
	public Presupuesto() {
		this.fecha = LocalDate.now();
		this.items = new ArrayList<Item>();
	}
	
	public Presupuesto(String cliente) {
		this.fecha = LocalDate.now();
		this.cliente = cliente;
		this.items = new ArrayList<Item>();
	}
	
	public void setCliente(String Cliente) {
		this.cliente = Cliente;
	}
	
	public void agregarItem(Item item) {
		this.items.add(item);
	}
	
	public double calcularTotal() {
		double total = 0;
		for(int i = 0; i < items.size(); i++) {
			total += items.get(i).costo();
		}
		return total;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public String getCliente() {
		return cliente;
	}
	
	
	
	
}
