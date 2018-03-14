import org.junit.Test;

public class VersionsTest extends TestBase {

    @Test
    public void addNewVersion() {
        loginPage.setEmail("administrator@testarena.pl");
        loginPage.setPassword("sumXQQ72$L");
        loginPage.clickLoginButton();
        kokpitPage.goToVersion();
    }
}
