package mouseover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class mouseoveronFashion {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		WebElement cursor=driver.findElement(By.xpath("//div[contains(text(),'Fashion')]"));
		Actions s=new Actions(driver);
		s.moveToElement(cursor).perform();
		driver.findElement(By.xpath("//a[contains(text(),'Men Footwear')]")).click();
		driver.close();
	}

}
