package Searchfunctionality;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchWithNoData {

	public static void main(String[] args) {
		
			System.setProperty("webdriver.chrome.driver","D:\\New folder\\chromedriver.exe");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://www.flipkart.com");
			driver.findElement(By.xpath("//button[@class=\"_2KpZ6l _2doB4z\"]")).click();
			driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("");
			driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).click();
			driver.close();

	}

}
