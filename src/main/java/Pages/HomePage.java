package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	//Netflix label
	//@FindBy(xpath = "//a[@aria-label='Netflix']")
	//WebElement Actual;
	WebDriver driver;
	@FindBy(xpath = "//a[@class='current active']")
	WebElement Homeclick;
	
	@FindBy(xpath = "//a[@class='current active']/parent::*/following-sibling::li[2]")
	WebElement MovieClick;
	
	@FindBy(xpath = "//div[@class='profile-icon'][1]")
	WebElement Profile;
	
	
	
	public HomePage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
	}
	
	public void Profile() {
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		Profile.click();
	}

	public void Home() {
		
		System.out.println(Homeclick.getText());
		
	}
	
	public void Movies() {
		MovieClick.click();
	}
	
	

}
