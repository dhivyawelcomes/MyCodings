package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Dhivya");
		driver.findElement(By.name("lastname")).sendKeys("Sivaramakrishnan");
		driver.findElement(By.name("reg_email__")).sendKeys("dhivyawelcomes@gmail.com");
		driver.findElement(By.id("password_step_input")).sendKeys("testleaf");
		WebElement date = driver.findElement(By.id("day"));
		Select date1=new Select(date);
		date1.selectByValue("25");
		WebElement month = driver.findElement(By.id("month"));
		Select month1=new Select(month);
		month1.selectByIndex(3);
		WebElement year = driver.findElement(By.id("year"));
		Select year1=new Select(year);
		year1.selectByVisibleText("1985");
		driver.findElement(By.xpath("//label[text()='Female']")).click();
		
		
		
		
		
		
	}

}
