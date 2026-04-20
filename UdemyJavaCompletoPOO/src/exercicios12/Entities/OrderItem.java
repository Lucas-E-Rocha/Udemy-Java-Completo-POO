package exercicios12.Entities;

public class OrderItem {
	private int quantity;
	private Double price;
	private Product product;

	public OrderItem(int quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Double subTotal() {
		return quantity * price;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(product.getName() + ", ");
		sb.append("$" + String.format("%.2f", product.getPrice() + ", "));
		sb.append("Quantity: " + quantity + ", ");
		sb.append("Subtotal: $" + String.format("%.2f", subTotal()));

		return sb.toString();
	}
}
