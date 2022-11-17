package mouseover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseoveronlogin {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement cursor=driver.findElement(By.xpath("//a[text()='Login']"));
		Thread.sleep(2000);
		Actions shree=new Actions(driver);
		shree.moveToElement(cursor).perform();
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()=\"My Profile\"]")).click();
		Thread.sleep(5000);
		driver.close();
	
	}

}
