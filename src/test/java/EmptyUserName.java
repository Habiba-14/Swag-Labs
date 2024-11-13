import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EmptyUserName extends Start{

    @Test
    public void SubmitEmptyUserName(){
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
        String mssg = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
        System.out.println(mssg);
    }
}
