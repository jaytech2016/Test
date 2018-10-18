package Class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class test {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\msing\\eclipse-workspace\\Test\\Driver\\chromedriver.exe");
		//System.setProperty("webdriver.firefox.driver", "geckodriver.exe");

		WebDriver driver1 = new ChromeDriver();
		driver1.get("https://www.amazon.com/");
		driver1.manage().window().maximize();
		
		WebElement account = driver1.findElement(By.xpath("//*[@id=\"nav-link-accountList\"]"));
		account.click();
		WebElement username = driver1.findElement(By.xpath("//*[@id=\"ap_email\"]"));
		username.sendKeys("jaysingh2016@gmail.com");
		WebElement button =driver1.findElement(By.xpath("//*[@id=\"continue\"]"));
		button.click();
		WebElement password =driver1.findElement(By.xpath("//*//*[@id=\"ap_password\"]"));
		password.sendKeys("1Getalife");
		WebElement signin =driver1.findElement(By.xpath("//*[@id=\"signInSubmit\"]"));
		signin.click();
		WebElement search =driver1.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]"));
		search.sendKeys("iphone");
		WebElement lookup = driver1.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input"));
		lookup.click();

	
	
	}
}