package practice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prac4dropdown {
	
	public static void main (String args[]) {
		
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.whizdomtraining.com/contact-us");
		
		driver.manage().window().maximize();
		
		WebElement abc=driver.findElement(By.name("country_id"));
		Select dropdown=new Select(abc);
		List<WebElement> alloptions=dropdown.getOptions();
		System.out.println(alloptions.size());
		
		/*
		 * for (int i=0;i<alloptions.size();i++) {
		 * System.out.println(alloptions.get(i).getText());
		 * 
		 * 
		 * }
		 */
		for(WebElement option : alloptions){
			//System.out.println(option.getText());
	        if(option.getText().contains("Zimbabwe")) {
	            option.click();
	            break;
	        }
	    }
		
		//driver.close();
		
	}

}
