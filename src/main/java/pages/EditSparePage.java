package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class EditSparePage extends ParentPage {

    @FindBy (name = "add")
    private WebElement buttonAdd;

    @FindBy (id = "spares_spareName")
    private WebElement inputSpareName;

    @FindBy (name = "delete")
    private WebElement buttonDelete;

    public EditSparePage(WebDriver webDriver) {
        super(webDriver);
    }

    public void clickOnButtonCreate() {
        actionsWithElements.clickOnElement(buttonAdd);
    }

    public void enterSpareNameInToInput(String spareName) {
        actionsWithElements.enterTextInToElement(inputSpareName, spareName);
    }

    public void selectSpareTypeInDD(String spareType) {
        Select SpareDD = new Select(webDriver.findElement(By.id("spares_spareType") ));
        SpareDD.selectByVisibleText(spareType);
    }

    public void clickOnButtonDelete() {
        actionsWithElements.clickOnElement(buttonDelete);
    }
}
