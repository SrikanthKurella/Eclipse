package HeaderLinks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HeaderlinkTravel {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		Thread.sleep(5000);

		driver.findElement(By.xpath("//div[text()='Travel']")).click();
		Select from=new Select(driver.findElement(By.xpath("(//input[@class='_1w3ZZo _1YBGQV _2EjOJB lZd1T6 _2vegSu _2mFmU7'])")));
		from.selectByValue("Hyderabad, HYD - Rajiv Gandhi International Airport");
		Thread.sleep(5000);
		Select to=new Select(driver.findElement(By.xpath("(//input[@class='_1w3ZZo _1YBGQV _2EjOJB lZd1T6 _2dqBfU _2mFmU7'])")));
		to.selectByValue("Mumbai, BOM - Chatrapati Shivaji International Airport");
		
	}

}
