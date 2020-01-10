package practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Prac3Alert {
	
	public static void main (String args[]) throws InterruptedException {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10000, TimeUnit.SECONDS);
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(1000);
		
		WebDriverWait w= new WebDriverWait(driver, 20);
		w.until(ExpectedConditions.alertIsPresent());
		
		Alert givealert= driver.switchTo().alert();
		
		String abc=givealert.getText();
		givealert.accept();
		Thread.sleep(5000);
		System.out.println(abc);
		driver.findElement(By.id("login1")).sendKeys("shilpam");
		//System.out.println("test");
		driver.findElement(By.name("proceed")).click();
		//driver.close();
		driver.quit();
		
	}
}
