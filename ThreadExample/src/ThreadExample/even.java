package ThreadExample;

public class even extends Thread{
	public void run() {
		for(int i=1;i<=50;i++) {
			if(i%2 ==0) {
				try {
					sleep(100);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				System.out.println(i);
			}
			
		}
		
	}

}
