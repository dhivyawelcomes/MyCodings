package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafGround {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
ChromeDriver driver=new ChromeDriver();
driver.get("https://leafground.com/select.xhtml");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
WebElement drop= driver.findElement(By.className("ui-selectonemenu"));
Select drop1=new Select(drop);
drop1.selectByVisibleText("Selenium");
driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-triangle-1-s ui-c']")).click();
driver.findElement(By.id("j_idt87:country_3")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[2]")).click();
driver.findElement(By.xpath("//li[text()='Chennai']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("//button[contains(@class,'ui-autocomplete-dropdown')][1]")).click();
driver.findElement(By.xpath("//li[text()='Selenium WebDriver']")).click();

Thread.sleep(2000);
driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[3]")).click();
driver.findElement(By.xpath("//li[text()='Tamil']")).click();
Thread.sleep(2000);
driver.findElement(By.xpath("(//span[@class='ui-icon ui-icon-triangle-1-s ui-c'])[4]")).click();
driver.findElement(By.xpath("//li[text()='இரண்டு']")).click();
}

}
