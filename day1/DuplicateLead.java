package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DuplicateLead {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.partialLinkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Dhivya");
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sivaramakrishnan");
driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("Dhivs");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Automation Testing");
driver.findElement(By.id("createLeadForm_description")).sendKeys("I Love Programming");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("dhivyawelcomes@gmail.com");
driver.findElement(By.name("submitButton")).click();
String title = driver.getTitle();
System.out.println(title);
String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
driver.findElement(By.linkText("Duplicate Lead")).click();
driver.findElement(By.id("createLeadForm_companyName")).clear();
driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Krishna Enterprises");
driver.findElement(By.id("createLeadForm_firstName")).clear();
driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Vijay");
driver.findElement(By.id("createLeadForm_lastName")).clear();
driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Seetharaman");
driver.findElement(By.name("submitButton")).click();
String title1 = driver.getTitle();
System.out.println(title1);
String text1= driver.findElement(By.id("viewLead_companyName_sp")).getText();
System.out.println(text1);
	}	
}