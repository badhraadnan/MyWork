package DatabaseConnection;

public class Account {
	private String accno,accname;
	private int balance;
	public Account() {
		
	}
	public Account(String accno, String accname, int balance) {
		this.accno = accno;
		this.accname = accname;
		this.balance = balance;
	}
	public String getAccno() {
		return accno;
	}
	public void setAccno(String accno) {
		this.accno = accno;
	}
	public String getAccname() {
		return accname;
	}
	public void setAccname(String accname) {
		this.accname = accname;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	@Override
	public String toString() {
		return "Account [accno=" + accno + ", accname=" + accname + ", balance=" + balance + "]";
	}
	
}
