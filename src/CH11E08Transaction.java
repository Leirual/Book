import java.util.Date;

public class CH11E08Transaction extends CH11E08NewAccountClass{

	protected Date date = new Date();
	protected char type;
	protected double ammount;
	protected double balance;
	protected String description;
	
	public Date getDate() {
		return date;
	}
	public char getType() {
		return type;
	}
	public double getAmmount() {
		return ammount;
	}
	public double getBalance() {
		return balance;
	}
	public String getDescription() {
		return description;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setType(char type) {
		this.type = type;
	}
	public void setAmmount(double ammount) {
		this.ammount = ammount;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	protected CH11E08Transaction(char type, double ammount, double balance, String description){
		this.type = type;
		this.ammount = ammount;
		this.balance = balance;
		this.description = getType() + ", " + getAmmount() + ", " + getBalance() + "\n";
	}
}
