package ActPro.dimasik;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.ElementNotVisibleException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BugRed {
	
	 public static  WebDriver driver;

	    @Test

	    public  void  Login () throws InterruptedException {

	        System.setProperty ("webdriver.chrome.driver", "d:\\tester\\chromedriver\\chromedriver.exe");
	        driver=new ChromeDriver();
	        driver.manage().window().maximize();
	        driver.get("http://users.bugred.ru/");

	        driver.findElement(By.xpath("//span[contains(text(), 'Войти')]")).click();
	        driver.findElement(By.xpath("//div[3]/div[1]/div[1]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("dmytrokukol@gmail.com");
	        driver.findElement(By.xpath("//div[3]/div[1]/div[1]/form/table/tbody/tr[2]/td[2]/input")).sendKeys("01213113@");
	        driver.findElement(By.xpath("//div[3]/div[1]/div[1]/form/table/tbody/tr[3]/td[2]/input")).click();
	        WebDriverWait wait = new WebDriverWait(driver, 60);
	        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a/span")));
	        driver.findElement(By.xpath("//*[@id=\"main-menu\"]/ul/li[2]/a/span")).click();
	        driver.findElement(By.xpath("/html/body/div[3]/div[1]/p[1]/a")).click();
	        driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/table/tbody/tr[1]/td[2]/input")).sendKeys("Проведение теста BugsRed");
	        driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/table/tbody/tr[2]/td[2]/textarea"))
	                .sendKeys("на сайт users написать авто тесты по созданию пользователя, добавления ему задачи и удаления его из системы.");
	         driver.findElement(By.xpath("/html/body/div[3]/div[1]/form/table/tbody/tr[4]/td[2]/input")).click();
	         wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr/td[4]/a")));
	         driver.findElement(By.xpath("/html/body/div[3]/div[1]/table/tbody/tr/td[4]/a")).click();
	         driver.quit();
    }

}
