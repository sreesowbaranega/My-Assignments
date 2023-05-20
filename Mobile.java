package week1.day1;

public class Mobile {
	
	public void makeCall() {
		String mobileModel = "Oneplus";
		float mobileWeight = 2.354f;
		
		System.out.println("make the call");
	}
	
	public void sendMsg() {
		boolean fullyCharged = true;
		int mobileCost = 30000;
		
		System.out.println("Send message");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mobile c = new Mobile();
		c. makeCall();
		c. sendMsg();
		System.out.println("This is my mobile");

	}

}
