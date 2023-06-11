package com.jenkins;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Basicdemo {
     @Test
	public void testCalculateAppriasal() {

   //System.setProperty("webdriver.chrome.driver", "D://Softwares//chromedriver.exe");
     WebDriverManager.chromedriver().setup();
	// TODO Auto-generated method stub
	WebDriver driver = new ChromeDriver();
	driver.navigate().to("http://registration.ap.gov.in/chatbot-0.0.1-SNAPSHOT/");
	driver.manage().window().maximize();
	//driver.findElement(By.xpath("//a[text()='RTI Act']")).click();
driver.navigate().refresh();
driver.navigate().refresh();
	driver.close();
	}
       }