package AddToCart;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class placeAnOrder {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement search=driver.findElement(By.xpath("//input[@title=\"Search for products, brands and more\"]"));
		search.sendKeys("iphone 13");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()=\"APPLE iPhone 13 (Blue, 128 GB)\"]")).click();
		
		 ArrayList tabs = new ArrayList (driver.getWindowHandles());
	        
	        driver.switchTo().window((String) tabs.get(1));
	      driver.findElement(By.xpath("//button[@class='_2KpZ6l _2U9uOA _3v1-ww']")).click();
	      Thread.sleep(4000);
	     
	      driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[3]/div/form/button")).click();
	      Thread.sleep(2000);
	      WebElement mobile=driver.findElement(By.xpath("//input[@autocomplete='off']"));
	      mobile.sendKeys("8886737963");
	      driver.findElement(By.xpath("//button[@type='submit']")).click();
	      Thread.sleep(2000);
	  WebElement pwd=  driver.findElement(By.xpath("//input[@type='password']"));
	    pwd.sendKeys("Shree@123");
	    driver.findElement(By.xpath("//button[@type='submit']")).click();
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//div[@class='_1P2-0f']")).click();
	    Thread.sleep(2000);
	    WebElement name=driver.findElement(By.xpath("(//input[@type='text'])[1]"));
	    name.sendKeys("Srikanth");
	    WebElement phone=driver.findElement(By.xpath("(//input[@type='text'])[2]"));
	    phone.sendKeys("8886737963");
	    driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("504208");
	    driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("Near Gandhi nagar Hanuman temple");
	    driver.findElement(By.xpath("(//textarea[@name='addressLine1'])")).sendKeys("Telangana");
	    driver.findElement(By.xpath("//input[@name=\"city\"]")).sendKeys("");
	    Select state=new Select(driver.findElement(By.xpath("//select[@name=\"state\"]")));
	    state.selectByVisibleText("Telangana");
	    driver.findElement(By.xpath("(//div[@class=\"_1XFPmK\"])[5]")).click();
	    driver.findElement(By.xpath("//button[contains(text(),\"Save and Deliver Here\")]")).click();
	    Thread.sleep(4000);
	  //  driver.findElement(By.xpath("(//button[@class=\"_23FHuj\"])[6]")).click();
	    driver.findElement(By.xpath("//button[text()=\"CONTINUE\"]")).click();
	    driver.findElement(By.xpath("//button[text()=\"Accept & Continue\"]")).click();
	    Thread.sleep(5000);
	    driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[4]/div/div/div[2]/div/label[3]/div[1]")).click();
	    driver.findElement(By.xpath("//input[@name=\"cardNumber\"]")).sendKeys("1234567890123456");
	 Select month=new Select(   driver.findElement(By.xpath("//select[@name='month']")));
	 month.selectByVisibleText("12");
	 Select year=new Select(driver.findElement(By.xpath("//select[@name='year']")));
	 year.selectByVisibleText("55");
	 driver.findElement(By.xpath("//input[@name='cvv']")).sendKeys("215");
	 driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
	 driver.switchTo().window((String)tabs.get(1));
	driver.switchTo().window((String)tabs.get(0));

	 
	 driver.close();
	    
	    
}
}
