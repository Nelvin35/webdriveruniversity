package webdriveruniversitypk;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class pageobject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nelvin\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://webdriveruniversity.com/Page-Object-Model/index.html");
		driver.manage().window().maximize();
		
		WebElement FindOutMore = driver.findElement(By.xpath("//*[@id=\"button-find-out-more\"]"));
		FindOutMore.click();
		
		Alert alert = driver.switchTo().alert();

	}

}
