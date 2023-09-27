package webdriveruniversitypk;

import java.sql.Driver;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class popup {

	public static void main(String[] args) {
		// "DOUBT" (Ajaxloder,Pop-up)//
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Nelvin\\Desktop\\Automation\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); 
		driver.get("https://webdriveruniversity.com/Popup-Alerts/index.html");
		driver.manage().window().maximize();
	    //WebElement ClickMe = driver.findElement(By.xpath("//*[@id=\"button1\"]"));
	    //ClickMe.click();
		//driver.switchTo().alert().accept();
	    //WebElement ClickMe1 = driver.findElement(By.xpath("//*[@id=\"button2\"]"));
	    //ClickMe1.click();
	    //driver.switchTo().alert().dismiss();
	    //Alert alert = driver.switchTo().alert();
	    //alert.dismiss();
	    //driver.switchTo().alert().dismiss();
		
		
		
		

		        // Find the element that triggers the pop-up and click it
		       // WebElement popupTrigger = driver.findElement(By.id("popup-trigger"));
		        //popupTrigger.click();

		        // Get the window handles
		   
		       

		      /*  // Now you can interact with elements on the pop-up window
		        WebElement popupElement = driver.findElement(By.id("popup-element"));
		        popupElement.sendKeys("Text to input in the pop-up");

		        // Close the pop-up window
		        driver.close();

		        // Switch back to the main window
		        driver.switchTo().window(driver.getWindowHandles().iterator().next());

		        // Continue with actions on the main window
		        WebElement mainPageElement = driver.findElement(By.id("main-page-element"));
		        mainPageElement.click();

		        // Close the main window or quit the WebDriver when done
		        driver.quit();
		    }
		}

		
		*/
		
		//"AJAX LODER"
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		WebElement ajxloder = driver.findElement(By.xpath("//*[@id=\"button3\"]"));
		ajxloder.click();
		driver.get("https://webdriveruniversity.com/Ajax-Loader/index.html");
		WebElement clickme = driver.findElement(By.xpath("//*[@id=\"button1\"]"));
		clickme.click();
		
		  Set<String> windowHandles = driver.getWindowHandles();

	        // Iterate through the handles to switch to the pop-up window
	        for (String handle : windowHandles) {
	            if (!handle.equals(driver.getWindowHandle())) {
	                driver.switchTo().window(handle);
	                break;
	            }
	        }
					

		//Alert alert = driver.switchTo().alert();
		//alert.dismiss();
		
		//Dismiss a confirm dialog
		//Alert confirm = driver.switchTo().alert();
		//confirm.dismiss();

		// Dismiss a prompt dialog
		
		//Alert prompt = driver.switchTo().alert();
		//prompt.sendKeys("Cancel");
		//prompt.dismiss();*/
		
		//WebElement clickme = driver.findElement(By.xpath("/html/body/div/div[5]/div/div"));
		//clickme.click();
		
		//driver.switchTo().alert().accept();
		
        
	}

}
