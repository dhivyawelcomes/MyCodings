package week1.day1;

import cucumber.api.cli.Main;

public class Mobile {
public void sendsms() {
System.out.println("Hello Customer");
}
public void snapshot() {
	System.out.println("You are great");
}

	

public static void main(String[]args) {
	Mobile mob=new Mobile();
	mob.sendsms();
	mob.snapshot();
	}

}
