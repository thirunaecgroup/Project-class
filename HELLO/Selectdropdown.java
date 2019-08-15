package HELLO;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Selectdropdown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/ChromeDriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(op);
		/*		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		driver.findElementByLinkText("Sign in").click();;
		driver.findElementByName("email_create").sendKeys("thirunaqa2011@gmail.com");
		driver.findElementByXPath("//button[@id='SubmitCreate']").click();
		Thread.sleep(2000);
		if (driver.findElementByXPath("(//input[@name='id_gender'])[1]").isSelected()) {
			System.out.println("checked");
		} else {
			driver.findElementByXPath("(//input[@name='id_gender'])[1]").click();
		}
		driver.findElementById("customer_firstname").sendKeys("Manju");
		driver.findElementById("customer_lastname").sendKeys("Kumari");
		driver.findElementByXPath("(//input[@id='passwd'])").sendKeys("infotech@3");

		WebElement src = driver.findElementById("days");
		Select dropdown = new Select(src);
		dropdown.selectByIndex(6);
		dropdown.getOptions();
		List<WebElement> alloptions = dropdown.getOptions();--DROPDOWN
		int size1 = alloptions.size();
		System.out.println(size1);
		WebDriverWait wd = new WebDriverWait(driver,10);
		//wd.until(ExpectedConditions.elementToBeClickable(locator));
		wd.until(ExpectedConditions.elementToBeClickable(src));
		wd.until(ExpectedConditions.visibilityOfAllElements(src));
		 */

		/*driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);*/
		/*driver.switchTo().frame("iframeResult"); --FRAMES
		driver.findElementByXPath("//button[text()='Try it']").click();
		//driver.findElementByLinkText("Try it").click();


		Alert alert = driver.switchTo().alert();-- ALERT
		String text = alert.getText();
		System.out.println(text);
		alert.sendKeys("King");
		//alert.accept();
		alert.dismiss();*/
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		Set<String> options = driver.getWindowHandles();
		List<String> alloptions = new ArrayList<>();
		alloptions.addAll(options);
		driver.switchTo().window(alloptions.get(0));
		System.out.println(driver.getCurrentUrl());
		System.out.println(driver.getTitle());
		}

}
