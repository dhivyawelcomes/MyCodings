package week4day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.switchTo().frame(0);
		 WebElement drag=driver.findElement(By.xpath("//div[@id='draggable']"));
	        WebElement drop=driver.findElement(By.xpath("//div[@id='droppable']"));
	        Actions drag1=new Actions(driver);
	        drag1.dragAndDrop(drag, drop).perform();
			String text = driver.findElement(By.xpath("//div[@id='droppable']")).getText();
			System.out.println(text);
		
		
	}

}
