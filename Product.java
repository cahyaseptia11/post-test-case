import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import static org.testng.AssertJUnit.assertTrue;

public class Product {
    private String baseURL = "https://www.tokopedia.com/search?st=product&q=laptop&srp_component_id=02.01.00.00&srp_page_id=&srp_page_title=&navsource=";
    private WebDriver driver;
    private WebDriverWait wait;
    private JavascriptExecutor js;


    @BeforeSuite
    public void productTest() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\sqa\\chromedriver_win32\\chromedriver.exe" );
//        System.setProperty("webdriver.edge.driver", "C:\\sqa\\edgedriver_win64\\msedgedriver.exe");
        driver = new ChromeDriver();
//        driver = new EdgeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(40));
        js = (JavascriptExecutor) driver;
        driver.get(baseURL);
        driver.manage().window().maximize();
        Thread.sleep(6000);
    }
    @Test
    public void priceTest() throws InterruptedException {
        this.scroll();
        String path = "//div[@data-testid=\"spnSRPProdPrice\"]";
        int sum = 0;

        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);

        List<WebElement> elements = driver.findElements(By.xpath(path));

        for (WebElement elem : elements) {
            String a = elem.getText().replaceAll("\\D+", "");
            System.out.println(a);
            sum += Integer.parseInt(a);
        }

        System.out.println(sum);
        System.out.println(elements.size());
        assertTrue(sum > 0);
    }

    private void scroll() {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        for (int i = 0; i <= 180; i++) {
            js.executeScript("window.scrollBy(0, " + i + ")");
        }
    }
}
