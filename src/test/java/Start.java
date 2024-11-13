import io.github.bonigarcia.wdm.WebDriverManager;
import io.github.bonigarcia.wdm.managers.ChromeDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Start {
    WebDriver driver;
    @BeforeTest
    public void LaunchWebsite(){
        WebDriverManager.chromedriver().setup();
        //WebDriverManager manager = new ChromeDriverManager();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.saucedemo.com/");
    }
        @AfterTest
    public void Close(){
        driver.quit();
        }

//    public void login(String username, String password) {
//        driver.findElement(By.id("user-name")).sendKeys(username);
//        driver.findElement(By.id("password")).sendKeys(password);
//        driver.findElement(By.id("login-button")).click();
//    }
//
//    public String getErrorMessage() {
//        return driver.findElement(By.cssSelector("[data-test='error']")).getText();
//    }
}
