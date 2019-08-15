package HELLO;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LearnWindowHandler {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./drivers/ChromeDriver.exe" );
		ChromeOptions op = new ChromeOptions();
		op.addArguments("--disable-notifications");
		ChromeDriver wb = new ChromeDriver(op);
		//wb.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		wb.get("http://demo.guru99.com/popup.php");
		wb.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		wb.manage().window().maximize();
		wb.findElementByPartialLinkText("Click Here").click();

		Set <String> windows= wb.getWindowHandles();
		List <String> allwindows = new ArrayList<>();
		allwindows.addAll(windows);
		wb.switchTo().window(allwindows.get(1));
		System.out.println(wb.getCurrentUrl());
		System.out.println(wb.getTitle());
		wb.findElementByName("emailid").sendKeys("thirunagr8@gmail.com");
		wb.close();
		File scr = wb.getScreenshotAs(OutputType.FILE);
		File dest = new File("D://thiruna.png");
		FileUtils.copyfile(scr,dest)
		
		wb.switchTo().window(allwindows.get(0));
		System.out.println("Current url is"+wb.getTitle());
		wb.close();

	}

}
