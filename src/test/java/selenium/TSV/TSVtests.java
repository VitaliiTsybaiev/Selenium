package selenium.TSV;

import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TSVtests {

	static WebDriver driver;

	@BeforeClass
	public static void setup() {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}

	@Test
	public void login_test1() {
		String expected = "Vitalii";
		driver.get("http://seltr-kbp1-1.synapse.com:8080");
		driver.findElement(By.xpath("//*[@id='header']/div[2]/a[1]/b")).click();
		driver.findElement(By.id("j_username")).sendKeys("TSV");
		driver.findElement(By.name("j_password")).sendKeys("TSV123");
		driver.findElement(By.id("yui-gen1-button")).click();
		String actualString = driver.findElement(
				By.xpath("//*[@id='header']/div[2]/span/a[1]/b")).getText();
		Assert.assertFalse("login_test1 - FAIL", actualString.equals(expected));
		System.out.println("login_test1- PASS");
	}

	@Test
	public void login_test2() {
		String expected = "Invalid login information. Please try again.";
		driver.get("http://seltr-kbp1-1.synapse.com:8080");
		driver.findElement(By.xpath("//*[@id='header']/div[2]/a[1]/b")).click();
		driver.findElement(By.id("j_username")).clear();
		driver.findElement(By.name("j_password")).clear();
		driver.findElement(By.id("yui-gen1-button")).click();
		String actualString = driver.findElement(
				By.xpath("//*[@id='main-panel-content']/div[1]")).getText();
		System.out.println(actualString);
		Assert.assertTrue("login_test2 - FAIL", actualString.contains(expected));
		System.out.println("login_test2- PASS");
	}

	@AfterClass
	public static void post_setup() {
		driver.quit();
	}
}
