package webdriveruniversitypk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Button_clicks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nelvin\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://webdriveruniversity.com/Click-Buttons/index.html");
		driver.manage().window().maximize();
		//WebElement ClickMe1 = driver.findElement(By.xpath("//*[@id=\"button1\"]/p"));
		//ClickMe1.click();
		//WebElement ClickMe2 = driver.findElement(By.xpath("//*[@id=\"button2\"]"));
		//ClickMe2.click();
		WebElement ClickMe3 = driver.findElement(By.xpath("//*[@id=\"button3\"]"));
		ClickMe3.click();

	}

}
