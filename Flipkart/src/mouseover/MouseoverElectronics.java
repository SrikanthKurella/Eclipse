package mouseover;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.TargetLocator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseoverElectronics {

	public static void main(String[] args) throws InterruptedException {


			System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com/");
			Thread.sleep(4000);
			driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
			
			WebElement cursor=driver.findElement(By.xpath("//div[text()='Electronics']"));
			Thread.sleep(5000);
			Actions shree=new Actions(driver);
			shree.moveToElement(cursor).perform();
			WebElement drop=driver.findElement(By.xpath("//a[text()='Audio']"));
			Thread.sleep(5000);
			Actions s=new Actions(driver);
			s.moveToElement(drop).perform();
			driver.findElement(By.xpath("//a[text()='Bluetooth Headphones']")).click();
			Thread.sleep(5000);
			
			Select drop1=new Select(driver.findElement(By.xpath("(//select[@class=\"_2YxCDZ\"])[1]")));
			drop1.selectByValue("1500");
			Select dropDown=new Select(driver.findElement(By.xpath("(//select[@class=\"_2YxCDZ\"])[2]")));
			dropDown.selectByValue("5000");
			Thread.sleep(4000);
			driver.findElement(By.xpath("(//a[contains(text(),\"Boult Audio AirBass Combuds Bluetooth Headset\")])[1]")).click();
			
			driver.close();
	}

}
