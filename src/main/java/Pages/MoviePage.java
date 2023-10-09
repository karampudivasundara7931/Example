package Pages;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MoviePage {

	WebDriver driver;

	@FindBy(xpath="//div[@label='Genres']")
	WebElement genre;
	public MoviePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void GenreSelect() throws InterruptedException {
	genre.click();
	List<WebElement> options =  driver.findElements(By.xpath("//li[@class='sub-menu-item']"));
	
	for(WebElement option : options) {
		if(option.getText().equalsIgnoreCase("telugu")) {
			option.click();
			break;
		}
	}
	Thread.sleep(3000);
	}
	
public void subtrails() {
		
		List<WebElement> dropdown =  driver.findElements(By.xpath("//div[@class='row-header-title']"));
		System.out.println(dropdown.size());
	
		for(WebElement dd : dropdown) {
			
		System.out.println(dd.getText());
			if(dd.getText().equalsIgnoreCase("Trending Now")) {
				System.out.println(dd.getText());
				break;
	}
	
}
	}
	
}
