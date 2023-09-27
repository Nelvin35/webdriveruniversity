package webdriveruniversitypk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login_portal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nelvin\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://webdriveruniversity.com/Login-Portal/index.html");
		driver.manage().window().maximize();
		
		WebElement Username = driver.findElement(By.xpath("//*[@id=\"text\"]"));
		Username.sendKeys("Pulchadipvt");
		WebElement Comment = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		Comment.sendKeys("Ramananrockzzz");
		WebElement Login = driver.findElement(By.xpath("//*[@id=\"login-button\"]"));
		Login.click();

	}

}
