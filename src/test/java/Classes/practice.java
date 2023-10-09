package Classes;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class practice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.netflix.com/in/");
		driver.findElement(By.xpath("//a[@id='signIn']")).click();
		driver.findElement(By.id("id_userLoginId")).sendKeys("rohinibahukutumbi98@gmail.com");
		driver.findElement(By.id("id_password")).sendKeys("cowdog");
		driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[@class='profile-icon'][1]")).click();
		
		driver.findElement(By.xpath("//a[contains(text(),'Movies')]")).click();
		
		driver.findElement(By.xpath("//div[@label='Genres']")).click();
		List<WebElement> options =  driver.findElements(By.xpath("//li[@class=\"sub-menu-item\"]"));
		
		for(WebElement option : options) {
			if(option.getText().equalsIgnoreCase("telugu")) {
				option.click();
				break;
			}
		}

	}

}
