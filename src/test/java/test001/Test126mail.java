package test001;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import baseCode.Browsers;
import baseCode.BrowsersType;

public class Test126mail {
	
	private WebDriver driver;
	
	@BeforeClass
	public void beforeClass(){
		Browsers browsers = new Browsers(BrowsersType.firfox);
		driver = browsers.driver;
	}
	
	@Test
	public void start(){
		driver.get("http://www.126.com");//进入到表单中
		driver.switchTo().frame("x-URS-iframe");
		driver.findElement(By.xpath("//div[@class='u-input box']/input[@name='email']")).clear();
		driver.findElement(By.xpath("//div[@class='u-input box']/input[@name='email']")).sendKeys("prodiger2008");
		driver.findElement(By.xpath("//input[@type='password' and @class='j-inputtext dlpwd']")).sendKeys("csl53241csl",Keys.ENTER);
		driver.switchTo().defaultContent();//退出所有表单，
		
		
		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@AfterClass
	public void quit(){
		driver.quit();
	}

}
