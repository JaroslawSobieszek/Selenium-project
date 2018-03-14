import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class KokpitPage {

    WebDriver driver;

    @FindBy(css = "a[title='Wyloguj']")
    WebElement unloggedButton;

    @FindBy(css = "li.item4>a[href*='version']")
    WebElement clickVersionButton;


    public KokpitPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickSignoutButton() {
        unloggedButton.click();

    }

    public void goToVersion() {
        clickVersionButton.click();
    }
}