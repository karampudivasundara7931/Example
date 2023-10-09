package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	
		WebDriver driver;
		
		
		@FindBy(xpath = "//a[@id='signIn']")
		WebElement Signin; 
	

		public LoginPage(WebDriver driver) {
			// TODO Auto-generated constructor stub
			this.driver = driver;
			PageFactory.initElements(driver, this);
		}

		public void launch(String s) {
			driver.get(s);
		}
		
		public void Signinbutton() {
			Signin.click(); 
			
		}
		
		
		
	

}
