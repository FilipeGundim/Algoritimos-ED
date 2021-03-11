package lista4;

public class Produto {
	private int id;
	private String name;
	private double value;
	private int quantity;

	public Produto(int id, String name, double value, int quantity) {
		// endereço de memoria
		this.id = id;
		this.name = name;
		this.value = value;
		this.quantity = quantity;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
}
