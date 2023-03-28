package week4day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class CreateWindow {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.leafground.com/window.xhtml");
		driver.manage().window().maximize();

		// first window
		driver.findElement(By.xpath("//span[text()='Open']")).click();
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> window = new ArrayList<String>(windowHandles);
		driver.switchTo().window(window.get(1));
		String text = driver.findElement(By.xpath("//span[text()='Hari Radhakrishnan']")).getText();
		System.out.println(text);
		driver.close();

		// second window
		driver.switchTo().window(window.get(0));
		driver.findElement(By.xpath("//span[text()='Open Multiple']")).click();
		Set<String> window2 = driver.getWindowHandles();
		List<String> openmultiple = new ArrayList<String>(window2);
		driver.switchTo().window(openmultiple.get(2));
		Thread.sleep(500);
		String text2 = driver.findElement(By.xpath("//span[text()='Customer Analytics Table']")).getText();
		System.out.println(text2);
		driver.close();
		driver.switchTo().window(openmultiple.get(1));
		driver.close();

		// third window
		driver.switchTo().window(window.get(0));
		driver.findElement(By.xpath("//span[text()='Close Windows']")).click();
		Set<String> window3 = driver.getWindowHandles();
		List<String> closewindow = new ArrayList<String>(window3);
		System.out.println(closewindow.size());
		driver.switchTo().window(closewindow.get(1));
		
		System.out.println(driver.getTitle());
		driver.close();

	driver.switchTo().window(closewindow.get(2));
		
		System.out.println(driver.getTitle());
		driver.close();
	driver.switchTo().window(closewindow.get(3));
		
		
		System.out.println(driver.getTitle());
		driver.close();
		// fourth window
		driver.switchTo().window(window.get(0));
		driver.findElement(By.xpath("//span[text()='Open with delay']")).click();
		Set<String> window4 = driver.getWindowHandles();
		List<String> openwithdelay = new ArrayList<String>(window4);
		driver.switchTo().window(openwithdelay.get(1));
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(openwithdelay.get(2));
		System.out.println(driver.getTitle());
		driver.close();
	}

}
