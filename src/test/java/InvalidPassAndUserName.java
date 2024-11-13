import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class InvalidPassAndUserName extends Start{
    @Test
    public void SubmitEmptyPassAndUserName(){
//        driver.findElement(By.id("user-name")).sendKeys(" ");
//        driver.findElement(By.id("password")).sendKeys(" ");
        driver.findElement(By.id("login-button")).click();
        String mssg = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
        System.out.println(mssg);
    }
}
