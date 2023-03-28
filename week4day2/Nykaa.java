package week4day2;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;



public class Nykaa {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		options.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		WebElement brand = driver.findElement(By.xpath("//a[text()='brands']"));
		Actions builder=new Actions(driver);
		builder.moveToElement(brand).perform();
		driver.findElement(By.xpath("//input[@id='brandSearchBox']")).sendKeys("Loreal");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class='css-ov2o3v']//a")).click();
		String title = driver.getTitle();
		System.out.println("Title: "+title);
		driver.findElement(By.xpath("//span[@class='sort-name']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		driver.findElement(By.xpath("(//li[@class='MegaDropdownHeadingbox'])[3]")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> listWindow=new ArrayList<String>(windowHandles);
		driver.switchTo().window(listWindow.get(1));
		System.out.println("Title of the new Window is: "+driver.getTitle());
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Color Protection");
		driver.findElement(By.xpath("//label[@for='checkbox_Color Protection_10764']")).click();
		String text = driver.findElement(By.xpath("//div[@class='css-1emjbq5']")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//img[@src='https://images-static.nykaa.com/media/catalog/product/tr:w-220,h-220,cm-pad_resize/c/6/c65a2c6NYBNDLP000013_0.jpg']")).click();
		Set<String> windowHandles2 = driver.getWindowHandles();
		List<String> listwindows2=new ArrayList<String>(windowHandles2);
		driver.switchTo().window(listwindows2.get(2));
		String mrp = driver.findElement(By.xpath("//span[@class='css-1jczs19']")).getText();
		System.out.println("Price of the product is: "+mrp);
		driver.findElement(By.xpath("(//span[text()='Add to Bag'])[1]")).click();
		WebElement bag = driver.findElement(By.xpath("//span[@class='cart-count']"));
		builder.doubleClick(bag).perform();
		driver.switchTo().frame(0);
		String total = driver.findElement(By.xpath("(//p[@class='css-masf0q eka6zu20'])[2]")).getText();
		System.out.println("Total amount: "+total);
		driver.findElement(By.xpath("//span[text()='Proceed']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[text()='Continue as guest']")).click();
		if(mrp!=total) {
			System.out.println("Amount Matches");
		}
		else {
			System.out.println("Amount Mismatches");
		}
		Thread.sleep(5000);
		driver.close();
		driver.quit();
		
	}
	
	}


