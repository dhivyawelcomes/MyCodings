package week4day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.leafground.com/frame.xhtml");
		driver.manage().window().maximize();
		//driver.switchTo().frame(0);
		
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@src='default.xhtml']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		String text = driver.findElement(By.xpath("//button[text()='Hurray! You Clicked Me.']")).getText();
		System.out.println(text);
		
		driver.switchTo().defaultContent();
		
		WebElement frame2 = driver.findElement(By.xpath("//iframe[@src='nested.xhtml']"));
		driver.switchTo().frame(frame2);
		String text2 = driver.findElement(By.xpath("//button[text()='Count Frames']")).getText();
		System.out.println(text2);
		
		
		driver.switchTo().defaultContent();
		
		
		WebElement nested = driver.findElement(By.xpath("//iframe[@src='page.xhtml']"));
		
		driver.switchTo().frame(nested);
		driver.switchTo().frame("frame2");
		driver.findElement(By.xpath("//button[text()='Click Me']")).click();
		
		
		
		//
		
	}

}
