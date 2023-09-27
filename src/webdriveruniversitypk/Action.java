package webdriveruniversitypk;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Action {

	public static void main(String[] args) {
		// "Doubt"
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nelvin\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://webdriveruniversity.com/Actions/index.html");
		driver.manage().window().maximize();
		
		
		WebElement sourceElement = driver.findElement(By.xpath("//*[@id=\"draggable\"]"));
		 WebElement targetElement = driver.findElement(By.xpath("//*[@id=\"droppable\"]"));
		 Actions ac = new Actions(driver);
		 ac.clickAndHold(sourceElement).moveToElement(targetElement).release().build().perform();
		 
		 WebElement dcm = driver.findElement(By.xpath("//*[@id=\"double-click\"]"));
			ac.doubleClick(dcm).perform();
		 
			//JavascriptExecutor js = (JavascriptExecutor) driver;
			//WebElement Element=driver.findElement(By.linkText("Hover Over Me First!"));
			//js.executeScript("arguments[0].scrollIntoView();",Element);
			
			//HOVWER 1
			// Locating the Main Menu (Parent element)
			WebElement Hover = driver.findElement(By.xpath("/html/body/div/div[4]"));

			//Instantiating Actions class
			Actions actions = new Actions(driver);

			//Hovering on main menu
			actions.moveToElement(Hover);

			/*// Locating the element from Sub Menu
			WebElement Hover1 = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[1]/button"));

			//To mouseover on sub menu
			actions.moveToElement(Hover1);*/
			
			//WebElement Hover2 = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[2]/button"));
			//actions.moveToElement(Hover2);
			
			WebElement Hover3 = driver.findElement(By.xpath("//*[@id=\"div-hover\"]/div[3]/button"));
			actions.moveToElement(Hover3);

			//build()- used to compile all the actions into a single step 
			actions.click().build().perform();
			
			// Locate the element  by By.xpath. 
		     WebElement ClickandHold = driver.findElement(By.xpath("//*[@id=\"click-box\"]")); 

		/*// Create an object of actions class and pass reference of WebDriver as a parameter to its constructor. 
		     Actions actions = new Actions(driver);*/

		// Move the cursor to the position of element . 
		     actions.moveToElement(ClickandHold); // Call clickAndHold() method to perform click and hold operation. 
		     actions.clickAndHold().perform();
			
			
			
		 

	}

}
