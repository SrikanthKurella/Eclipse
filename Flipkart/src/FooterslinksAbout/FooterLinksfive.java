package FooterslinksAbout;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FooterLinksfive {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
	//	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("(//span[text()='Become a Seller'])[2]")).click();
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='Advertise'])")).click();
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='Gift Cards'])")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//span[text()='Help Center'])")).click();
		driver.navigate().back();
		driver.close();
	}

}
