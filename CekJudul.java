import static org.testng.AssertJUnit.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CekJudul {
    @Test
    public void cekJudul(){
        System.setProperty("webdriver.chrome.driver", "C:\\sqa\\chromedriver_win32\\chromedriver.exe" );
        WebDriver driver = new ChromeDriver();
//        driver.get("https://google.com");
        String baseUrl = "https://www.google.com/";
        String expectedTitle = "Google";
//        String baseUrl2 = "https://www.tokopedia.com/";
//        String expectedTitle2 = "Tokopedia";
        driver.get(baseUrl);
//        driver.get(baseUrl2);
        String actualTitle = driver.getTitle();
        assertEquals(actualTitle, expectedTitle);
//        assertEquals(actualTitle, expectedTitle2);
//        driver.close();

    }
}

