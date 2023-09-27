package webdriveruniversitypk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {

	public static void main(String[] args) {
		// "DOUBT"
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nelvin\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://webdriveruniversity.com/Scrolling/index.html");
		driver.manage().window().maximize();
		
		
		WebElement Scroll = driver.findElement(By.xpath("//*[@id=\"zone1\"]"));
		Actions actions = new Actions(driver);
		actions.moveToElement(Scroll);

		WebElement ScrollMe = driver.findElement(By.xpath("/html/body/div/div[2]"));
		actions.moveToElement(ScrollMe);
		
		WebElement ScrollMe2 = driver.findElement(By.xpath("//*[@id=\"zone2\"]"));
		actions.moveToElement(ScrollMe2);
		WebElement ScrollMe3 = driver.findElement(By.xpath("//*[@id=\"zone3\"]"));
		actions.moveToElement(ScrollMe3);
		WebElement ScrollMe4 = driver.findElement(By.xpath("//*[@id=\"zone4\"]"));
		actions.moveToElement(ScrollMe4);
		actions.click().build().perform();
		

	}

}
