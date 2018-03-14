import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.PageFactory;

public class TestBase {

    public WebDriver driver;
    public LoginPage loginPage;
    public KokpitPage kokpitPage;
    public VersionPage versionPage;
    public AddNewVersionPage addNewVersionPage;

    @Before
    public void setUp() {
        System.setProperty("webdriver.gecko.driver", "C:\\bin\\geckodriver.exe");
        driver = new FirefoxDriver();
        loginPage = PageFactory.initElements(driver, LoginPage.class);
        kokpitPage = PageFactory.initElements(driver, KokpitPage.class);
        versionPage = PageFactory.initElements(driver, VersionPage.class);
        addNewVersionPage = PageFactory.initElements(driver, AddNewVersionPage.class);
        loginPage.open();
    }

    @After
    public void close() {
        driver.quit();
    }

}
