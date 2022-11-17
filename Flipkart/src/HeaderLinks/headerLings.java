package HeaderLinks;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class headerLings {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		driver.findElement(By.xpath("//div[text()=\"Appliances\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//img[@class=\"kJjFO0 _3DIhEh\"])[2]")).click();
	Thread.sleep(4000);
		driver.findElement(By.xpath("//div[contains(text(),\"Hisense A71F Series \")]")).click();
		ArrayList tab= new ArrayList (driver.getWindowHandles());
		driver.switchTo().window((String)tab.get(1));
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("//input[@id=\"pincodeInputId\"]")).sendKeys("504208");
		Thread.sleep(4000);
		driver.close();
//	WebElement pincode=driver.findElement(By.xpath("//input[@id=\"pincodeInputId\"]"));
	//	pincode.sendKeys("504208");
	
	}

}
