import java.util.ArrayList;
import java.util.Date;

public class CH11E08NewAccountClass {

	public static void main(String[] args) {
		
		CH11E08NewAccountClass account = new CH11E08NewAccountClass("George", 1122, 1000);
		account.setAnnualInterestRate(0.015);
		account.deposit(30);
		account.deposit(40);
		account.deposit(50);
		account.withdraw(5);
		account.withdraw(4);
		account.withdraw(2);
		
		System.out.println("Account holder name: " + account.getName() + " Interest rate is: " + account.getAnnualInterestRate()
		+ " Balance is: " + account.getBalance() + " The transactions are as follows: " + account.getTransactions().toString() );
	}

	private int id = 0;
	private double balance = 0;
	private double annualInterestRate = 0;
	private Date dateCreated = new Date();
	private String name;
	protected ArrayList<CH11E08Transaction> transactions = new ArrayList<>();
	
	
	public CH11E08NewAccountClass(){
	}
	public CH11E08NewAccountClass(int id, double balance){
		this.id = id;
		this.balance = balance;
	}
	public CH11E08NewAccountClass(String name, int id, double balance){
		this.name = name;
		this.id = id;
		this.balance = balance;
	}
	
	
	public ArrayList<CH11E08Transaction> getTransactions() {
		return transactions;
	}
	public void setTransactions(ArrayList<CH11E08Transaction> transactions) {
		this.transactions = transactions;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public double getBalance() {
		return balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public java.util.Date getDateCreated() {
		return dateCreated;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}

	public double getMonthlyInterestRate(){
		double monthlyRate = annualInterestRate / 12;
		return monthlyRate;
	}

	public double getMonthlyInterest(){
		double monthlyInterest = balance * getMonthlyInterestRate();
		return monthlyInterest;
	}
	
	public void withdraw(double ammount){
		balance = balance - ammount;
		String description = "W, " + ammount + ", " + balance;
		CH11E08Transaction transaction = new CH11E08Transaction('W', ammount, balance, description);
		transactions.add(transaction);
	}
	
	public void deposit(double ammount){
		balance = balance + ammount;
		CH11E08Transaction transaction = new CH11E08Transaction('D', ammount, balance, 'D' + ", " + ammount + ", " + balance + "\n");
		transactions.add(transaction);
	}
}
