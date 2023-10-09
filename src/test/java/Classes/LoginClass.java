package Classes;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.LoginPage;
import Pages.SignInPage;

public class LoginClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();	
		LoginPage lp = new LoginPage(driver);
		String s ="https://www.netflix.com/in/";
		lp.launch(s);
		lp.Signinbutton();
		String user = "vasu@1234";
		String pass ="12345678";
		
		SignInPage sp = new SignInPage(driver);
		sp.username(user, pass);
		sp.Checkbox();
		sp.signclick();
		
	}

}
