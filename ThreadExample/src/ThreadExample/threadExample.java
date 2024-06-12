package ThreadExample;


public class threadExample{

	public static void main(String[] args) {
		odd thread1=new odd();
		even thread2=new even();
		
		thread1.start();
		System.out.println("odd Number");
		try {
			thread1.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		thread2.start();
		System.out.println("Even Number");
		try {
			thread2.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
