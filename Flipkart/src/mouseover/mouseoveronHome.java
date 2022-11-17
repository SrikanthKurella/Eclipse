package mouseover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseoveronHome {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement cursor=driver.findElement(By.xpath("//div[contains(text(),'Home')]"));
		Actions s=new Actions(driver);
		s.moveToElement(cursor).perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[contains(text(),'Living Room Furniture')]")).click();
		driver.close();
	}

}
