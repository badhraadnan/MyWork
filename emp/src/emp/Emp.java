package emp;
import java.util.Scanner;

public class Emp {
	String mail,name;
	

	public String getMail() {
		return mail;
	}


	public void setMail(String mail) {
		this.mail = mail;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	@Override
	public String toString() {
		return "Emp [mail=" + mail + ", name=" + name + "]";
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your name");
		String sname=sc.next();
		System.out.println("Enter your mail");
		String smail=sc.next();
		
		Emp e=new Emp();
		
		e.setName(sname);
		e.setMail(smail);
		
		System.out.println(e);
	}

}
