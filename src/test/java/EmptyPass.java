import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class EmptyPass extends Start{

    @Test
    public void SubmitEmptyPassword(){
        driver.findElement(By.id("user-name")).sendKeys("locked_out_user");
        driver.findElement(By.id("login-button")).click();
        String mssg = driver.findElement(By.xpath("//*[@id=\"login_button_container\"]/div/form/div[3]/h3")).getText();
        System.out.println(mssg);
    }
}
