package HELLO;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Sele06032019 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notification");
		WebDriver driver = new ChromeDriver(op);
		driver.get("http://automationpractice.com/index.php?");
	//	driver.findElement(arg0)

	}

}
