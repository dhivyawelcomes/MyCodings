package week5day2;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class LearnAttributes {
	@Test(priority=-1)
	public void openLead() {
		System.out.println("Print Lead");
	}
	@Test(priority=1)
	public void mergeLead() {
		System.out.println("Print Lead");
	}
	@Test(dependsOnMethods = {"deleteLead"},alwaysRun=true)
	public void editLead() {
		System.out.println("Print Lead");
	}
	@Test
	
		public void deleteLead() throws Exception {
			System.out.println("Print Lead");
			throw new Exception();
}
}
