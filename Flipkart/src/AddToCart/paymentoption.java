package AddToCart;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class paymentoption {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/checkout/init?loginFlow=true");
	//	driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@class=\"_2IX_2- VJZDxU\"]")).sendKeys("8886737963");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Shree@123");
		driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2HKlqd _3AWRsL\"]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[text()='Place Order']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//button[text()='Deliver Here']")).click();
		driver.findElement(By.xpath("//button[text()='CONTINUE']")).click();
		driver.findElement(By.xpath("//button[text()='Accept & Continue']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//label[text()='Wallets']")).click();
		WebElement num=driver.findElement(By.xpath("//input[@class=\"_1w3ZZo _38v77k _2mFmU7\"]"));
		num.sendKeys("8886737963");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a[text()='Link Now']")).click();
		//driver.findElement(By.xpath("//button[contains(text(),'CONTINUE')]")).click();
		
	}

}
