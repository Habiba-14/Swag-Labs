import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InvalidPassword extends Start {
    String[] acceptedUsernames = {"standard_user", "locked_out_user", "problem_user", "performance_glitch_user", "error_user","visual_user"};

    @Test
    public void InvalidPasswordLogin(){
        for(int i =0 ; i< acceptedUsernames.length ; i++) {
            driver.findElement(By.id("user-name")).sendKeys(acceptedUsernames[i]);
            driver.findElement(By.id("password")).sendKeys("pass");
            driver.findElement(By.id("login-button")).click();
            String errorMssg = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
            System.out.println(errorMssg);
            driver.navigate().to("https://www.saucedemo.com/");
        }

    }
}
