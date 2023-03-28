package week4day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class CreateAlert {
@Test
	public void main() throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
		Alert simple = driver.switchTo().alert();
		String text = simple.getText();
		System.out.println(text);
		simple.accept();
		
		driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
		Alert confirm = driver.switchTo().alert();
		String text2 = confirm.getText();
		System.out.println(text2);
		confirm.dismiss();
		
		driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
		Thread.sleep(1000);
		String text3 = driver.findElement(By.xpath("//span[text()='Dismiss']")).getText();
		System.out.println(text3);
		driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
		
		
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		Alert prompt = driver.switchTo().alert();
		String text4 = simple.getText();
		System.out.println(text4);
		prompt.sendKeys("Amazing");
		prompt.accept();
		driver.close();
	}


}
