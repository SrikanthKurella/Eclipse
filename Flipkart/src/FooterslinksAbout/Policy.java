package FooterslinksAbout;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Policy {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//a[text()='Return Policy']")).click();
		driver.navigate().back();
		//driver.findElement(By.xpath("//img[@title='Flipkart']")).click();
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Terms Of Use']")).click();
		driver.navigate().back();

		//Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Security']")).click();
		driver.navigate().back();

		driver.findElement(By.xpath("//a[text()='Privacy']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='Sitemap']")).click();
		driver.navigate().back();
		driver.findElement(By.xpath("//a[text()='EPR Compliance']")).click();
		driver.navigate().back();
		driver.close();
	}

}
