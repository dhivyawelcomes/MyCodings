package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id='accountName']")).sendKeys("Debit Limited Account");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		driver.findElement(By.xpath("//input[@id='groupNameLocal']")).sendKeys("Dhivya");
		driver.findElement(By.xpath("//input[@id='officeSiteName']")).sendKeys("Platform Testleaf");
		driver.findElement(By.xpath("//input[@id='annualRevenue']")).sendKeys("1000000");
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select industry1=new Select(industry);
		industry1.selectByValue("IND_SOFTWARE");
		WebElement own = driver.findElement(By.name("ownershipEnumId"));
		Select ownership=new Select(own);
		ownership.selectByVisibleText("S-Corporation");
		WebElement source = driver.findElement(By.id("dataSourceId"));
		Select source1=new Select(source);
		source1.selectByValue("LEAD_EMPLOYEE");
		WebElement market = driver.findElement(By.id("marketingCampaignId"));
		Select market1=new Select(market);
		source1.selectByIndex(6);
		WebElement state = driver.findElement(By.id("generalStateProvinceGeoId"));
		Select state1=new Select(state);
		state1.selectByValue("TX");
		driver.findElement(By.xpath("//input[@class='smallSubmit']")).click();
		
		
		
		
	
	
	
	
	}

}
