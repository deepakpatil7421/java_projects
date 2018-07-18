package MainBean;

public class MainBean {
	private String cust_name,product,descrption;
	private long quantity;
	private double unit_prize,total_amount,Due_amount;

	public String getCust_name() {
		return cust_name;
	}
	public void setCust_name(String cust_name) {
		this.cust_name = cust_name;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}
	public String getDescrption() {
		return descrption;
	}
	public void setDescrption(String descrption) {
		this.descrption = descrption;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	public double getUnit_prize() {
		return unit_prize;
	}
	public void setUnit_prize(double unit_prize) {
		this.unit_prize = unit_prize;
	}
	public double getTotal_amount() {
		return total_amount;
	}
	public void setTotal_amount(double total_amount) {
		this.total_amount = total_amount;
	}
	public double getDue_amount() {
		return Due_amount;
	}
	public void setDue_amount(double due_amount) {
		Due_amount = due_amount;
	}

}
