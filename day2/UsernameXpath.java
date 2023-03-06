package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class UsernameXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("demosalesmanager");
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("crmsfa");
driver.findElement(By.xpath("//input[@class='decorativeSubmit']")).click();

	}

}
