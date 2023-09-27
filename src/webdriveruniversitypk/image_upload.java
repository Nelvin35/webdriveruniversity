package webdriveruniversitypk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class image_upload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nelvin\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://webdriveruniversity.com/File-Upload/index.html");
		driver.manage().window().maximize();
		WebElement image = driver.findElement(By.xpath("//*[@id=\"myFile\"]"));
		image.sendKeys("C:\\Users\\Nelvin\\Downloads\\wp10552826-itachi-for-pc-wallpapers.jpg");
		WebElement Submit = driver.findElement(By.xpath("//*[@id=\"submit-button\"]"));
		Submit.click();
		driver.switchTo().alert().accept();
		

	}

}
