package week2.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Lead {

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
		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select drop=new Select(source);
		drop.selectByVisibleText("Employee");
		WebElement pay = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select value=new Select(pay);
		value.selectByValue("9001");
		WebElement own = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select own1=new Select(own);
		own1.selectByIndex(5);
		WebElement country = driver.findElement(By.id("createLeadForm_generalCountryGeoId"));
		Select country1=new Select(country);
		country1.selectByVisibleText("India");
		driver.findElement(By.name("submitButton")).click();		
		String title = driver.getTitle();
		System.out.println(title);
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if(text.contains("Testleaf(15417")) {
			System.out.println("Lead created successfully");
		}
			else {
				System.out.println("Lead is not created");
		}
		
		driver.close();
	}

}
