package week4day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class MergeContact {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
ChromeDriver driver = new ChromeDriver(options);
driver.get("http://leaftaps.com/opentaps/control/login");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.partialLinkText("CRM/SFA")).click();
driver.findElement(By.linkText("Contacts")).click();
driver.findElement(By.linkText("Merge Contacts")).click();

driver.findElement(By.xpath("(//img[@src='/images/fieldlookup.gif'])[1]")).click();
Set<String> windowHandles = driver.getWindowHandles();
List<String> window=new ArrayList<String>(windowHandles);
driver.switchTo().window(window.get(1));
Thread.sleep(2000);
driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
driver.switchTo().window(window.get(0));
driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
Set<String> windowHandles1 = driver.getWindowHandles();
List<String> window1=new ArrayList<String>(windowHandles1);
driver.switchTo().window(window1.get(1));
Thread.sleep(2000);
driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[2]")).click();
driver.switchTo().window(window.get(0));
driver.findElement(By.className("buttonDangerous")).click();
Alert alert = driver.switchTo().alert();
alert.getText();
alert.accept();
System.out.println(driver.getTitle());
	}
	
	

}
