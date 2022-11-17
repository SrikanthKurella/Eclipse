package AddToCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ValidatingAddtoCart {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Cart']")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("8886737963");
		driver.findElement(By.xpath("//input[@class=\"_2IX_2- _3mctLh VJZDxU\"]")).sendKeys("Shree@123");
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
		Thread.sleep(4000);

		driver.findElement(By.xpath("(//button[@class=\"_23FHuj\"])[2]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("(//button[@class=\"_23FHuj\"])[1]")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//div[text()='Save for later'])[1]")).click();
		Thread.sleep(4000);
	//	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div[1]")).click();
		//driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div/div[1]/div[2]/div[2]/div/div[2]/div[2]/div[2]")).click();
		driver.findElement(By.xpath("//button[text()='Change']")).click();
		driver.close();
	}

}
