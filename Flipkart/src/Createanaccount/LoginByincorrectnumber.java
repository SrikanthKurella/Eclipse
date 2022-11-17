package Createanaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginByincorrectnumber {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();	
		driver.findElement(By.xpath("//a[contains(text(),'Login')]")).click();
		Thread.sleep(2000);
		WebElement phone=driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[2]"));		WebElement mobile= driver.findElement(By.xpath("(//input[@type='text'])[2]"));
		phone.sendKeys("00000000000");
		WebElement pwd=driver.findElement(By.xpath("(//input[@autocomplete=\"off\"])[3]"));
		pwd.sendKeys("Shree@123");
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@type=\"submit\"])[2]")).click();
		Thread.sleep(4000);
		driver.close();
	}

}
