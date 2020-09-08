package TestNG;

public class Runner {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
	
	LoginPromise lo=new LoginPromise();
	lo.setup();
		lo.loginusr();
		lo.addpromise();
		
	}

}
