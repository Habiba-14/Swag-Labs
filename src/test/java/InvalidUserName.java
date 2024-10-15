import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InvalidUserName extends Start{
    @Test
    public void SubmitInvalidUserName(){
        driver.findElement(By.id("user-name")).sendKeys("Habiba1412");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        String mssg = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
        System.out.println(mssg);
    }
}
