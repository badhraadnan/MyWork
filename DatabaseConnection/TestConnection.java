package DatabaseConnection;

import java.util.Scanner;

public class TestConnection {

	public static void main(String[] args) {
		
		Account ac=new Account();
		
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("Enter Acount Number..");
		ac.setAccno(sc.nextLine());
		
		System.out.println("Enter Acount Holder Name..");
		ac.setAccname(sc.nextLine());
		
		System.out.println("Enter Balance..");
		ac.setBalance(sc.nextInt());
		
		databaseConnection.getConnection();
		
		
		CRUDOperation crd=new CRUDOperation();
		
//		crd.insert(ac.getAccno(),ac.getAccname(),ac.getBalance());
//		crd.delete(ac.getAccno());
//		crd.update(ac.getAccname(),ac.getAccno());
		
//		crd.getData();
		



}
}

