import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidLogin extends Start{
    String[] usernames = {"standard_user", "locked_out_user", "problem_user", "performance_glitch_user", "error_user", "visual_user"};
    String password = "secret_sauce";

    @Test
    public void testLoginWithMultipleUsers() {
        for (int i = 0; i < usernames.length; i++) {
            login(usernames[i], password);
            if (usernames[i].equals("locked_out_user")) {
                WebElement errorMessage = driver.findElement(By.xpath("//*[@id='login_button_container']/div/form/div[3]/h3"));
                String actualMessage = errorMessage.getText();
                String expectedMessage = "Epic sadface: Sorry, this user has been locked out.";
                Assert.assertEquals(actualMessage, expectedMessage, "Error message not as expected for locked_out_user!");
                System.out.println("Login failed for " + usernames[i] + ": " + actualMessage);
            } else {
                String currentUrl = driver.getCurrentUrl();
                Assert.assertEquals(currentUrl, "https://www.saucedemo.com/inventory.html", "Login failed for " + usernames[i]);

                driver.navigate().to("https://www.saucedemo.com/");
            }
        }
    }

    public void login(String username, String password) {
        driver.get("https://www.saucedemo.com/");

        WebElement usernameField = driver.findElement(By.id("user-name"));
        WebElement passwordField = driver.findElement(By.id("password"));
        WebElement loginButton = driver.findElement(By.id("login-button"));

        //usernameField.clear();
        usernameField.sendKeys(username);
        //passwordField.clear();
        passwordField.sendKeys(password);
        loginButton.click();
    }


}
