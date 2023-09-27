package webdriveruniversitypk;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class contact_us {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nelvin\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://webdriveruniversity.com/Contact-Us/contactus.html");
		driver.manage().window().maximize();
		
		WebElement Firstname = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[1]"));
		Firstname.sendKeys("Nelvin");
		WebElement Lastname = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[2]"));
		Lastname.sendKeys("Sabu");
		WebElement Email = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/input[3]"));
		Email.sendKeys("nelvinsabu@2002gmail.com");
		WebElement Comment = driver.findElement(By.xpath("//*[@id=\"contact_form\"]/textarea"));
		Comment.sendKeys("Adipoli");
		//WebElement Submit = driver.findElement(By.xpath("//*//*[@id=\"form_buttons\"]/input[2]"));
		//Submit.click();
		WebElement Reset = driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[1]"));
		Reset.click();

	}

}
