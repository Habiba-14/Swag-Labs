import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ValidLogin extends Start{
    // Declare and initialize an array in one step
    String[] acceptedUsernames = {"standard_user", "locked_out_user", "problem_user", "performance_glitch_user", "error_user","visual_user"};

    @Test
    public void ValidLogin(){
        for(int i =0 ; i< acceptedUsernames.length ; i++) {
            driver.findElement(By.id("user-name")).sendKeys(acceptedUsernames[i]);
            driver.findElement(By.id("password")).sendKeys("secret_sauce");
            driver.findElement(By.id("login-button")).click();
            driver.navigate().to("https://www.saucedemo.com/");
        }
    }
}
