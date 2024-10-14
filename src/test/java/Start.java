import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Start {
    WebDriver driver;
    @BeforeTest
    public void LaunchWebsite(){
        WebDriverManager manager = new ChromeDriverManager();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");

    }
        @AfterTest
    public void Close(){
        driver.quit();
        }
}
