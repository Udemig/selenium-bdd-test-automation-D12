package Base;

import Pages.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.*;

public class BaseTest extends BaseLib{

    public WebDriver driver;

    @Before
    public void setUp() {
        String tarayici = System.getProperty("browser");
        String osName = System.getProperty("os.name");

        if (tarayici== null) {tarayici="Chrome";}

        System.out.println(tarayici);
        if (tarayici.equals("Chrome")) {
            if (osName.equals("Mac OS X")) {
                System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
            } else {
                System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
            }
            ChromeOptions co = new ChromeOptions();
            co.addArguments("--remote-allow-origins=*");
            driver = new ChromeDriver(co);
        }
        else {
            if (osName.equals("Mac OS X")) {
                System.setProperty("webdriver.chrome.driver", "driver/geckodriver");
            } else {
                System.setProperty("webdriver.chrome.driver", "driver/geckodriver.exe");
            }
            driver = new FirefoxDriver();
        }
    }

    @Given("Browser da url aç")
    public void openBrowser(){
        driver.get("https://parabank.parasoft.com");
        driver.manage().window().maximize();
        HomePage.setDriver(driver);
    }

    @AfterMethod
    public void afterDown() {
        driver.quit();
    }
}
