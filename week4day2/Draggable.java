package week4day2;

import java.time.Duration;
import org.openqa.selenium.Point;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class Draggable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.leafground.com/drag.xhtml");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		   driver.switchTo().frame(0);
		   WebElement source = driver.findElement(By.id("form:drag_content"));
			WebElement drop = driver.findElement(By.id("form:drop_content"));
				Actions DragDrop= new Actions(driver);
				DragDrop.dragAndDrop(source, drop).perform();
				System.out.println(drop.getCssValue("background-color"));
				
		WebElement source1 = driver.findElement(By.xpath("//span[text()='Drag me around']"));
		       Point location = source1.getLocation();
				int x = location.getX();
				System.out.println(x);
				int y = location.getY();
				System.out.println(y);
				DragDrop.dragAndDropBy(source1, 100, 100).perform();
				System.out.println(source1.getLocation().getX());

	}

}
