package week5day2;

import org.testng.annotations.Test;

public class LearnInvocation {
	@Test(invocationCount=5,invocationTimeOut = 3000,threadPoolSize = 4)
public void add() {
	System.out.println("Addition");
}
}
