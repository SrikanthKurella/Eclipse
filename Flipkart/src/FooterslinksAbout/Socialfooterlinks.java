package FooterslinksAbout;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Socialfooterlinks {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		driver.navigate().back();
		Thread.sleep(5000);
	//	driver.findElement(By.xpath("//a[text()='Twitter']")).click();
		//driver.navigate().back();
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("//a[text()='YouTube']")).click();
		//driver.navigate().back();
		//driver.close();
		
	}

}
