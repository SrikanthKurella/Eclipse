package HomePageNavigations;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class validateFilterbutton {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		
		WebElement search=driver.findElement(By.xpath("//input[@class=\"_3704LK\"]"));
		search.sendKeys("sunglasses");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Gender']")).click();
		driver.findElement(By.xpath("//div[text()='Boys']")).click();
		Select min=new Select(driver.findElement(By.xpath("(//select[@class=\"_2YxCDZ\"])[1]")));
		min.selectByValue("300");
		Select max=new Select(driver.findElement(By.xpath("(//select[@class=\"_2YxCDZ\"])[2]")));
		max.selectByValue("2000");
		
		driver.findElement(By.xpath("//div[@class=\"_24_Dny _3tCU7L\"]")).click();
		Thread.sleep(5000);
		//Select search=new Select (driver.findElement(By.xpath("")));
		//driver.findElement(By.xpath("//div[text()='Brand']")).click();
		WebElement type=driver.findElement(By.xpath("//input[@class=\"_34uFYj\"]"));
				type.sendKeys("FOSSIL");
		driver.findElement(By.xpath("(//div[@class=\"_3879cV\"])[3]")).click();
	//	Thread.sleep(3000);
	//	driver.findElement(By.xpath("//div[text()='Style']")).click();
		//driver.findElement(By.xpath("(//div[@class=\"_3879cV\"])[9]")).click();
		Thread.sleep(4000);
	driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[6]/div[1]/div")).click();
		driver.findElement(By.xpath("//div[text()='Aviator']")).click();
	//	driver.findElement(By.xpath("(//div[text()='Large'])")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div/div[1]/div/section[7]/div/div")).click();
		driver.findElement(By.xpath("(//div[text()='Large'])")).click();
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("(//div[text()='Lens Color'])")).click();
		driver.findElement(By.xpath("//div[text()='Violet']")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[text()='Frame Color']")).click();
		driver.findElement(By.xpath("//div[text()='Black']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[text()='Discount']")).click();
		driver.findElement(By.xpath("//div[text()='70% or more']")).click();
		
	}

}
