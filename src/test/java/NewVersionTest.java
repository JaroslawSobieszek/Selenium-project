import org.junit.Test;

public class NewVersionTest extends TestBase {

    @Test
    public void addVersionTest() throws InterruptedException {
        loginPage.setEmail("administrator@testarena.pl");
        loginPage.setPassword("sumXQQ72$L");
        loginPage.clickLoginButton();
        kokpitPage.goToVersion();
        versionPage.gotToAddNewVersion();
        String versionName = "Ver" + System.nanoTime();
        addNewVersionPage.enterName(versionName);
        addNewVersionPage.enterDescription("Dodanie nowej wersji");
        addNewVersionPage.clickSaveButton();
        Thread.sleep(3000);

    }
}