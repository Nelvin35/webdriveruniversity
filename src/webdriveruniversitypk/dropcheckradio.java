package webdriveruniversitypk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class dropcheckradio {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nelvin\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
		driver.manage().window().maximize();
		Select Drop = new Select(driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-1\"]")));
		Drop.selectByValue("python");
		Select Drop2 = new Select(driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-2\"]")));
		Drop2.selectByValue("testng");
		Select Drop3 = new Select(driver.findElement(By.xpath("//*[@id=\"dropdowm-menu-3\"]")));
		Drop3.selectByValue("css");
		
		WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[1]"));
		checkbox.click();
		WebElement checkbox2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[3]"));
		checkbox2.click();
		WebElement Radio = driver.findElement(By.xpath("//*[@id=\"radio-buttons\"]/input[2]"));
		Radio.click();
		WebElement Radio1 =driver.findElement(By.xpath("//*[@id=\"radio-buttons-selected-disabled\"]/input[1]"));
		Radio1.click();
	
		Select drop4 = new Select(driver.findElement(By.xpath("//*[@id=\"fruit-selects\"]")));
		drop4.selectByValue("apple");

	}

}
