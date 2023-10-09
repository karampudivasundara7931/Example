package Classes;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.MoviePage;
import Pages.SignInPage;

public class LoginTestNG {

	WebDriver driver = new ChromeDriver();	
	LoginPage lp = new LoginPage(driver);
	SignInPage sp = new SignInPage(driver);
	HomePage hp = new HomePage(driver);
	MoviePage mp = new MoviePage(driver);
	
	@Test
	public void LaunchButton() {
		
		String s ="https://www.netflix.com/in/";
		lp.launch(s);
		lp.Signinbutton();
		
	}
	@Test
	public void MainLaunchButton() throws IOException {
		sp.username("rohinibahukutumbi98@gmail.com", "cowdog");
		sp.Checkbox();
		sp.signclick();
		//sp.errorsnap();
	}
	
	@Test(dependsOnMethods = {"MainLaunchButton"})
	public void HomeLaunch() throws InterruptedException {
		
		hp.Profile();
		hp.Home();
		hp.Movies();
		Thread.sleep(3000);

}
	@Test(dependsOnMethods = {"HomeLaunch"})
	public void MovieLaunch() throws InterruptedException   {
		
		mp.GenreSelect();
		
		
		
	}
	
	@Test(dependsOnMethods = {"MovieLaunch"})
	public void subTrailLaunch() {
		
		mp.subtrails();
	}
	
}
