package selenium.TSV;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


/**
 * Hello world!
 * 
 */

public class App {



	public static void   main(String[] args) {


		WebDriver driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://seltr-kbp1-1.synapse.com:8080");
		driver.findElement(By.xpath("//*[@id='header']/div[2]/a[1]/b")).click();
		driver.findElement(By.id("j_username")).sendKeys("TSV");
		driver.findElement(By.name("j_password")).sendKeys("TSV123");
		driver.findElement(By.id("yui-gen1-button")).click();
		driver.quit();
<<<<<<< HEAD

		//hkbjidh,yureghrues hgorue s gh
=======
// Add comments
	//	second branch gfnrtfsntfndf  
		
		
>>>>>>> refs/heads/TSVBranch
	}
}
