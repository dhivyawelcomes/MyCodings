package week4day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnFrame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
ChromeDriver driver = new ChromeDriver(options);
driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.switchTo().frame("iframeResult");
driver.findElement(By.xpath("//button[text()='Try it']")).click();
Alert alert = driver.switchTo().alert();
String text = alert.getText();
System.out.println(text);
alert.accept();
String text2 = driver.findElement(By.xpath("//p[@id='demo']")).getText();
System.out.println(text2);
	}

}
