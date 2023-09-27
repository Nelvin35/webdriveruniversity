package webdriveruniversitypk;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TODOLIST {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nelvin\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://webdriveruniversity.com/To-Do-List/index.html");
		driver.manage().window().maximize();
		
		WebElement newtodo = driver.findElement(By.xpath("//*[@id=\"container\"]/input"));
		newtodo.sendKeys("Testing");
		newtodo.sendKeys(Keys.RETURN);
		

	}

}
