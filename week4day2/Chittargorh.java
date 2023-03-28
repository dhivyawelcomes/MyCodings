package week4day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Chittargorh {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(options);
		driver.get("https://www.chittorgarh.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//a[@class='ch-bar-item ch-button'])[3]")).click();
		driver.findElement(By.xpath("//a[text()='NSE Bulk Deals']")).click();
		List<WebElement> rowCount = driver.findElements(By.xpath("//table[contains(@class,'table table-bordered')]//tr"));
		List<String> lst=new ArrayList<String>();
		
		System.out.println(rowCount.size());
		for (int i = 1; i <rowCount.size()-1; i++) {
		
		 String text = driver.findElement(By.xpath("//table[contains(@class,'table table-bordered')]//tr["+i+"]/td[1]")).getText();
		
		// System.out.println( text);
		 lst.add(text);

	
		}
		Set<String> dupSet=new LinkedHashSet<String>( lst);
		System.out.println(dupSet.size());
		System.out.println(lst.size());
		
		if(lst.size()==dupSet.size()) {
			System.out.println("Present");
		}
		else{
			System.out.println("No duplicate");
		}
		System.out.println(dupSet);
	}
}
