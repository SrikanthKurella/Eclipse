package FooterslinksAbout;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class footerLinks {

	public static void main(String[] args)  {
		
		System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();

		driver.findElement(By.xpath("//a[text()='Contact Us']")).click();
		
		
		driver.findElement(By.xpath("//a[text()='About Us']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='Careers']")).click();
		driver.navigate().back();

		
		driver.findElement(By.xpath("//a[text()='Flipkart Stories']")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()='Press']")).click();
		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()='Flipkart Wholesale']")).click();
		 ArrayList tabs = new ArrayList (driver.getWindowHandles());
	        
	        driver.switchTo().window((String) tabs.get(1));

		driver.navigate().back();
		
		driver.findElement(By.xpath("//a[text()='Corporate Information']")).click();
		driver.navigate().back();
		driver.close();
		
		
		

	}

}
