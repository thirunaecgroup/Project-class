package HELLO;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumPractice {

	public static void main(String[] args) throws InterruptedException {
		/*		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(op);
		driver.get("http://automationpractice.com/index.php");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.findElementByClassName("login").click();
		driver.findElementById("email").sendKeys("thirunagr8@gmail.com");
		driver.findElementById("passwd").sendKeys("Coke@123");
		driver.findElementById("SubmitLogin").click();
		driver.findElementByXPath("//*[@id=\"block_top_menu\"]/ul/li[2]/a").click();
		driver.findElementByXPath("//*[@id=\"subcategories\"]/ul/li[2]/div[1]/a/img").click();

		WebElement element = driver.findElementByXPath("(//img[@class='replace-2x img-responsive'])[2]");
		Actions actions = new Actions(driver);
		actions.moveToElement(element).pause(2000).build().perform();
		actions.click(driver.findElementByXPath("//span[text()='Add to cart']")).perform();


		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(op);
		--driver.get("https://www.google.com/");
		--driver.manage().window().maximize();
		--driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
--driver.findElementByXPath("//a[text()='Sign in']").click();
	}
		 */
		/*System.setProperty("webdriver.chrome.driver", "./drivers.ChromeDriver.exe");
ChromeOptions op = new ChromeOptions();
op.addArguments("--disable-notifications");
ChromeDriver driver  = new ChromeDriver(op);
driver.get("http://automationpractice.com/index.php");
String str = driver.getCurrentUrl();
System.out.println(str);*/
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver driver = new ChromeDriver(op);
		driver.get("http://automationpractice.com/index.php");
		int  respcode = 200;
		if (respcode>=400)  {
			System.out.println("InValid Url");
		}
		else 
			System.out.println("valid Url");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		String str = driver.getCurrentUrl();
		System.out.println(str);
		String str1 = driver.getTitle();
		System.out.println(str1);
		/*String str2 = driver.getSessionId();
System.out.println(str2);
		 */	
		driver.findElementByLinkText("Sign in").click();;
		driver.findElementByName("email_create").sendKeys("thirunamca85@gmail.com");
		driver.findElementByXPath("//button[@id='SubmitCreate']").click();
		Thread.sleep(2000);
		if (driver.findElementByXPath("(//input[@name='id_gender'])[1]").isSelected()) {
			System.out.println("checked");
		} else {
			driver.findElementByXPath("(//input[@name='id_gender'])[1]").click();
		}
		driver.findElementById("customer_firstname").sendKeys("Manoja");
		driver.findElementById("customer_lastname").sendKeys("Kumari");
		driver.findElementByXPath("(//input[@id='passwd'])").sendKeys("infotech@2");

		WebElement src = driver.findElementById("days");
		Select dropdown = new Select(src);
		System.out.println(dropdown.getOptions().size());
		dropdown.selectByIndex(5);
		//Thread.sleep(2000);
		WebElement src1 = driver.findElementById("months");
		Select dropdown1 = new Select(src1);
		System.out.println(dropdown1.getOptions().size());
		dropdown1.selectByValue("6");
		//Thread.sleep(2000);
		WebElement src2 = driver.findElementById("years");
		Select dropdown2 = new Select(src2);
		System.out.println(dropdown2.getOptions().size());
		dropdown2.selectByIndex(5);

		driver.findElementById("address1").sendKeys("Guindy");
		driver.findElementByXPath("//input[@id='city']").sendKeys("Chennai");
		Thread.sleep(2000);
		WebElement src4 = driver.findElementById("id_state");
		Select dropdown4 = new Select(src4);
		dropdown4.selectByVisibleText("Iowa");

		driver.findElementByName("postcode").sendKeys("58522");
		driver.findElementById("phone_mobile").sendKeys("9958151554");
		driver.findElementById("alias").sendKeys("My address is new");
		driver.findElementByXPath("//span[text()=\"Register\"]").click();
		
		/*WebDriverWait wd = new WebDriverWait(driver,10);
		wd.until(ExpectedConditions.elementToBeClickable(locator));
		*/
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollby(0,1000");

	}}
