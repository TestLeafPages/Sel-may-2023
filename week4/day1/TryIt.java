package week4.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class TryIt {

	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        
        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@id='iframeResult']"))); // ask driver to focus frame
        
        driver.findElement(By.xpath("//button[text()='Try it']")).click();          
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
	}

}
