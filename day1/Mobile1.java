package week1.day1;

public class Mobile1 {
public void makeCall() {
	String mobileModel="Samsung";
	float mobileWeight= 50.9f;
	System.out.println("My Mobile model is " + mobileModel);
	System.out.println("MY Mobile Weight is " + mobileWeight);
}
public void sendMsg() {
	boolean fullCharged = true;
	int mobileCost= 10000;
	System.out.println("Is my Mobile fully charged - "  + fullCharged);
	System.out.println("Cost of my Mobile - " + mobileCost);
	
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Mobile1 details = new Mobile1();
details.makeCall();	
details.sendMsg();
System.out.println("This is my mobile");



	}

}
