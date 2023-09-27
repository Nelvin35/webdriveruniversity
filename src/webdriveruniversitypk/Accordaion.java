package webdriveruniversitypk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Accordaion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nelvin\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://webdriveruniversity.com/Accordion/index.html");
		driver.manage().window().maximize();
		
		//WebElement manual = driver.findElement(By.xpath("//*[@id=\"manual-testing-accordion\"]"));
		//manual.click();
		//WebElement cucum = driver.findElement(By.xpath("//*[@id=\"cucumber-accordion\"]"));
		//cucum.click();
		//WebElement automatiom = driver.findElement(By.xpath("//*[@id=\"automation-accordion\"]"));
		//automatiom.click();
		WebElement keepc = driver.findElement(By.xpath("//*[@id=\"click-accordion\"]/text()"));
		keepc.click();
		

	}

}
