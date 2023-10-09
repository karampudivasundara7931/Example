package Pages;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import dev.failsafe.internal.util.Durations;

import org.apache.commons.io.FileUtils;

public class SignInPage {

	WebDriver driver;
	@FindBy(id = "id_userLoginId")
	WebElement username;
	
	@FindBy(id = "id_password")
	WebElement password;
	
	@FindBy(xpath = "//button[contains(text(),'Sign In')]")
	WebElement Sign;
	
	@FindBy(xpath="//input[@id='bxid_rememberMe_true']")
	WebElement checkbox;
	
	public SignInPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	public void username(String user, String pass) {
		
		username.sendKeys(user);
		password.sendKeys(pass);
	
	}
	//need to check for clicking
	public void Checkbox() {
	//checkbox.click();
		System.out.println(checkbox.isEnabled());
		
	}
	
	public void signclick() {
		Sign.click();
		
	}
	public void errorsnap() throws IOException {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='ui-message-contents']")));
		WebElement name = driver.findElement(By.cssSelector("div[class='ui-message-contents']"));
		File src = name.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\karampudi.vasundara\\Documents\\vasu\\error.png"));

	}
}
