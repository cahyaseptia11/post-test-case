import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FormyButton {
    @Test
    public void price() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\sqa\\chromedriver_win32\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/buttons");

        driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//button[@class='btn btn-lg btn-success']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//button[@class='btn btn-lg btn-info']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//button[@class='btn btn-lg btn-warning']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//button[@class='btn btn-lg btn-danger']")).click();
        Thread.sleep(1500);
        driver.findElement(By.xpath("//button[@class='btn btn-lg btn-link']")).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("body > div > form > div:nth-child(2) > div > div > div > button:nth-child(1)")).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("body > div > form > div:nth-child(2) > div > div > div > button:nth-child(2)")).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("body > div > form > div:nth-child(2) > div > div > div > button:nth-child(3)")).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("body > div > form > div:nth-child(3) > div > div > div > button:nth-child(1)")).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("body > div > form > div:nth-child(3) > div > div > div > button:nth-child(2)")).click();
        Thread.sleep(1500);
        driver.findElement(By.cssSelector("#btnGroupDrop1")).click();
        Thread.sleep(1500);
    }
}