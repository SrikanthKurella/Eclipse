package FooterslinksAbout;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterlinksHelp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		

		driver.findElement(By.xpath("//a[text()='Payments']")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()='Shipping']")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()='Cancellation & Returns']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='FAQ']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='Report Infringement']")).click();
		driver.navigate().back();
		driver.close();
		
	}

}
