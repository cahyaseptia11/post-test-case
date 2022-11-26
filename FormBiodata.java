import com.sun.deploy.ui.AboutDialog;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;

public class FormBiodata {
    @Test
    public void biodata() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\sqa\\chromedriver_win32\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        String baseURL = "https://formy-project.herokuapp.com/form";
        driver.get(baseURL);


        WebElement firstName = driver.findElement(By.id("first-name"));
        WebElement lastName = driver.findElement(By.id("last-name"));
        WebElement jobTitle = driver.findElement(By.id("job-title"));
        WebElement levelEdu = driver.findElement(By.id("radio-button-1"));
        WebElement sex1 = driver.findElement(By.id("checkbox-2"));
        Select experience = new Select(driver.findElement(By.id("select-menu")));
        WebElement date = driver.findElement(By.id("datepicker"));
        WebElement submit = driver.findElement(By.xpath("//a[@role='button']"));
//

        firstName.sendKeys("Cahya");
        lastName.sendKeys("Septia");
        jobTitle.sendKeys("Staff IT");
        levelEdu.click();
        sex1.click();
        experience.selectByIndex(1);
        date.sendKeys("11/11/2022");
        submit.click();
//        WebElement resultSubmit = driver.findElement(By.xpath("//div[@class='alert alert-success']"));
//        WebElement resultSubmits = driver.findElement(By.xpath("//div[@role='alert']"));
//      String resultSubmit = driver.switchTo().alert().getText();
//
//        String expectSubmit = "The form was successfully submitted!";
//        Assert.assertEquals(resultSubmit.getText(), expectSubmit);
//        Assert.assertEquals(resultSubmits.getText(), expectSubmit);

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement resultSubmit = driver.findElement(By.xpath("//div[@role='alert']"));
        String expect = "The form was successfully submitted!";
        String actual = resultSubmit.getText().toString();
        AssertEquals(actual,expect);
        

    }

    private void AssertEquals(String actual, String expect) {
    }
}
