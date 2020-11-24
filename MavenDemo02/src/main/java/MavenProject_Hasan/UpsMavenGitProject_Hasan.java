package MavenProject_Hasan;
/*

Name: Hasan Ahmed
Date: 11/24/2020
Selenium Assignment 02


*/

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UpsMavenGitProject_Hasan {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver ();
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");//qqq
		System.currentTimeMillis();
		driver.get("https://wwwapps.ups.com/doapp/signup");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();//qqq
		
		
		WebElement cookies= driver.findElement(By.xpath(" //*[@id=\'__tealiumImplicitmodal\']/div/button/span[1]"));
		cookies.click();

		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);	
		
		System.out.println(driver.getTitle());
		
		WebElement name= driver.findElement(By.id("ups-full_name_input"));
		
		WebElement email= driver.findElement(By.name("email_input"));
		// driver.findElement(By.name("email_input").sendKeys("hsnahmed79@gmail.com"));
		WebElement userid= driver.findElement(By.id("ups-user_id_input"));
	
		WebElement password= driver.findElement(By.xpath("//*[@id=\'ups-user_password_input\']"));
	
	
		WebElement acceptbox= driver.findElement(By.className("ups-checkbox-custom-label"));
		//WebElement acceptbox= driver.findElement(By.cssSelector("#ups-checkbox_group > div > label"));
		
		WebElement signup= driver.findElement(By.xpath("//*[@id=\'main\']/div/fullpage-doa/main-component/div/login-register/div/div/div[2]/div[2]/form/div[4]/div[3]/div/button/span"));

		//WebElement signup= driver.findElement(By.className("ups-hasAlerts ups-headFixed\r\n"));
		
		name.sendKeys("Hasan Ahmed");
		email.sendKeys("hsnahmed79@gmail.com");
		userid.sendKeys("Hasan123");
		password.sendKeys("talentech123");
		cookies.click();
		
   		acceptbox.click();
		signup.click();
		
		//Thread.sleep(2000);
		//driver.quit();
		
		

	}

}
