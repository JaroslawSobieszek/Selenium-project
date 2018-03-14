import org.junit.Test;

public class AddVersionTest extends TestBase {

    @Test
    public void addVersionTest(){
        loginPage.setEmail("administrator@testarena.pl");
        loginPage.setPassword("sumXQQ72$L");
        loginPage.clickLoginButton();
        kokpitPage.goToVersion();
        versionPage.gotToAddNewVersion();

    }
}
