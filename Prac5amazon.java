package practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Prac5amazon {

	
	public static void main(String args[]) throws InterruptedException {
		
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		//driver.findElement(By.link("nav-a nav-a-2 nav-active"));
		driver.findElement(By.xpath("//*[@class='hm-icon nav-sprite']")).click();
		Thread.sleep(1000);
		
		driver.findElement(By.id("hmenu-customer-name")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@type='email']")).sendKeys("7032919414");
		driver.findElement(By.xpath("//*[@type='submit']")).click();
		driver.findElement(By.xpath("//*[@type='password']")).sendKeys("Leela143@");
		driver.findElement(By.xpath("//*[@id='signInSubmit']")).click();
		
		//driver.findElement(By.xpath("//*[@id='nav-link-accountList']/span[1][@class='nav-line-1'])")).click();
		
		//driver.close();
		
	}
}
