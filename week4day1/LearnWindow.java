package week4day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
ChromeDriver driver = new ChromeDriver(options);
driver.get("https://www.irctc.co.in/nget/train-search");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.findElement(By.xpath("(//a[text()=' FLIGHTS '])")).click();
System.out.println(driver.getTitle());
Set<String> windowHandles = driver.getWindowHandles();
List<String> list1=new ArrayList<String>(windowHandles);
driver.switchTo().window(list1.get(1));
System.out.println(driver.getTitle());
driver.close();
driver.switchTo().window(list1.get(0));
System.out.println(driver.getTitle());
driver.quit();
	}

}
