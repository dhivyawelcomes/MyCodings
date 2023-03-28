package week4day2;
import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;


public class Amazon {


			public static void main(String[] args) throws IOException, InterruptedException {
				ChromeOptions options = new ChromeOptions();
				options.addArguments("--remote-allow-origins=*");
				ChromeDriver driver = new ChromeDriver(options);
				driver.get("https://www.amazon.in/");
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
				driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("oneplus 9 Pro",Keys.ENTER);
				String text = driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]")).getText();
				System.out.println("The first displayed phone rate is: "+text);
				String text2 = driver.findElement(By.xpath("(//span[@class='a-size-base'])[1]")).getText();
				System.out.println("Overall ratings: "+text2);
				driver.findElement(By.xpath("(//a[@class='a-popover-trigger a-declarative'])[1]")).click();
				//Actions builder=new Actions(driver);
				//builder.moveToElement(stars).perform();
				String text3 = driver.findElement(By.xpath("(//a[@href='/product-reviews/B0BS74XLTB/ref=acr_search_hist_5?ie=UTF8&filterByStar=five_star&reviewerType=all_reviews#reviews-filter-bar'])[3]")).getText();
				System.out.println("5 Stars percentage is: "+text3);
				driver.findElement(By.xpath("(//span[@class='a-size-medium a-color-base a-text-normal'])[1]")).click();
				Set<String> windowHandles = driver.getWindowHandles();
				List<String> listWindow=new ArrayList<String>(windowHandles);
				driver.switchTo().window(listWindow.get(1));
				System.out.println("Title of the new Window is: "+driver.getTitle());
				File screenshotAs = driver.getScreenshotAs(OutputType.FILE);
				File save=new File("./snap/img.png");
				FileUtils.copyFile(screenshotAs, save);
				driver.findElement(By.xpath("//input[@id='add-to-cart-button']")).click();
				Thread.sleep(12000);
				driver.findElement(By.xpath("//a[@class='a-link-normal close-button']")).click();
				driver.findElement(By.xpath("//div[@id='nav-cart-count-container']")).click();
				String text4 = driver.findElement(By.xpath("//span[@id='sc-subtotal-amount-activecart']")).getText();
				System.out.println(text4);
				if(text!=text4) {
					System.out.println("SubTotal is verified");
				}
				else {
					System.out.println("Amount mismatch");	

		}}}
	


