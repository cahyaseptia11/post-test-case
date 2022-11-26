import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FormyButton {
    @Test
    public void price() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\sqa\\chromedriver_win32\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
        driver.get("https://formy-project.herokuapp.com/buttons");

        WebElement btnPrimary = driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary']"));
        WebElement btnSucces = driver.findElement(By.xpath("//button[@class='btn btn-lg btn-success']"));
        WebElement btnInfo = driver.findElement(By.xpath("//button[@class='btn btn-lg btn-info']"));
        WebElement btnWarning = driver.findElement(By.xpath("//button[@class='btn btn-lg btn-warning']"));
        WebElement btnDanger = driver.findElement(By.xpath("//button[@class='btn btn-lg btn-danger']"));
        WebElement btnLink = driver.findElement(By.xpath("//button[@class='btn btn-lg btn-link']"));
        WebElement btnLeft = driver.findElement(By.cssSelector("body > div > form > div:nth-child(2) > div > div > div > button:nth-child(1)"));
        WebElement btnMiddle = driver.findElement(By.cssSelector("body > div > form > div:nth-child(2) > div > div > div > button:nth-child(2)"));
        WebElement btnRight = driver.findElement(By.cssSelector("body > div > form > div:nth-child(2) > div > div > div > button:nth-child(3)"));
        WebElement btnSatu = driver.findElement(By.cssSelector("body > div > form > div:nth-child(3) > div > div > div > button:nth-child(1)"));
        WebElement btnDua = driver.findElement(By.cssSelector("body > div > form > div:nth-child(3) > div > div > div > button:nth-child(2)"));
        WebElement dropDown = driver.findElement(By.cssSelector("#btnGroupDrop1"));

        String expectPrimary = "Primary";
        String expectSucces = "Success";
        String expectInfo = "Info";
        String expectWarning = "Warning";
        String expectDanger = "Danger";
        String expectLink = "Link";
        String expectLeft = "Left";
        String expectMiddle = "Middle";
        String expectRight = "Right";
        String expectSatu = "1";
        String expectDua = "2";
        String expectDropDown = "Dropdown";

        Assert.assertEquals(btnPrimary.getText(), expectPrimary);
        Assert.assertEquals(btnSucces.getText(), expectSucces);
        Assert.assertEquals(btnInfo.getText(), expectInfo);
        Assert.assertEquals(btnWarning.getText(), expectWarning);
        Assert.assertEquals(btnDanger.getText(), expectDanger);
        Assert.assertEquals(btnLink.getText(), expectLink);
        Assert.assertEquals(btnLeft.getText(), expectLeft);
        Assert.assertEquals(btnMiddle.getText(), expectMiddle);
        Assert.assertEquals(btnRight.getText(), expectRight);
        Assert.assertEquals(btnSatu.getText(), expectSatu);
        Assert.assertEquals(btnDua.getText(), expectDua);
        Assert.assertEquals(dropDown.getText(), expectDropDown);



///Dengan menggunakan oneclick testing
//        driver.findElement(By.xpath("//button[@class='btn btn-lg btn-primary']")).click();
//        Thread.sleep(1500);
//        driver.findElement(By.xpath("//button[@class='btn btn-lg btn-success']")).click();
//        Thread.sleep(1500);
//        driver.findElement(By.xpath("//button[@class='btn btn-lg btn-info']")).click();
//        Thread.sleep(1500);
//        driver.findElement(By.xpath("//button[@class='btn btn-lg btn-warning']")).click();
//        Thread.sleep(1500);
//        driver.findElement(By.xpath("//button[@class='btn btn-lg btn-danger']")).click();
//        Thread.sleep(1500);
//        driver.findElement(By.xpath("//button[@class='btn btn-lg btn-link']")).click();
//        Thread.sleep(1500);
//        driver.findElement(By.cssSelector("body > div > form > div:nth-child(2) > div > div > div > button:nth-child(1)")).click();
//        Thread.sleep(1500);
//        driver.findElement(By.cssSelector("body > div > form > div:nth-child(2) > div > div > div > button:nth-child(2)")).click();
//        Thread.sleep(1500);
//        driver.findElement(By.cssSelector("body > div > form > div:nth-child(2) > div > div > div > button:nth-child(3)")).click();
//        Thread.sleep(1500);
//        driver.findElement(By.cssSelector("body > div > form > div:nth-child(3) > div > div > div > button:nth-child(1)")).click();
//        Thread.sleep(1500);
//        driver.findElement(By.cssSelector("body > div > form > div:nth-child(3) > div > div > div > button:nth-child(2)")).click();
//        Thread.sleep(1500);
//        driver.findElement(By.cssSelector("#btnGroupDrop1")).click();
//        Thread.sleep(1500);
    }
}
