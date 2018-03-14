import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddNewVersionPage {

    WebDriver driver;


    @FindBy(id = "name")
    WebElement nameTextField;

    @FindBy(id = "description")
    WebElement descriptionTextField;

    @FindBy(id = "save")
    WebElement saveButton;

    public AddNewVersionPage(WebDriver driver) {
        this.driver = driver;
    }

    public void enterName(String name) {
        nameTextField.sendKeys(name);
    }

    public void enterDescription(String description) {
        descriptionTextField.sendKeys(description);

    }
    public void clickSaveButton(){
        saveButton.click();
    }
}
