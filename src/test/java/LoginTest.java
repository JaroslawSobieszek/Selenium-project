import com.google.common.annotations.VisibleForTesting;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest extends TestBase {

    @Test
    public void successfulLogin(){
        loginPage.setEmail("administrator@testarena.pl");
        loginPage.setPassword("sumXQQ72$L");
        loginPage.setRemember();
        loginPage.clickLoginButton();
        kokpitPage.clickSignoutButton();
}
    @Test
    public void unsuccessfulLogin() {
        loginPage.setEmail("administraator@testarena.pl");
        loginPage.setPassword("tdghdf");
        loginPage.clickLoginButton();

    }
}
