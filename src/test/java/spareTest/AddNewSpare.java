package spareTest;


import org.junit.After;
import org.junit.Test;
import parentTest.ParentTest;

public class AddNewSpare extends ParentTest {
    final String spareName = "SuperSpareSpare";
    @Test
    public void addNewSpare () {
        homePage.goToThisPage ();
        homePage.clickOnMenuDictionary();
        homePage.clickOnSubMenuSpare();
        sparePage.deletingSpareUntilPresent (spareName);
        sparePage.clickOnAddButton();
        editSparePage.enterSpareNameInToInput (spareName);
        editSparePage.selectSpareTypeInDD("Механика");
        editSparePage.clickOnButtonCreate();

        checkExpectedResult("Spare was not added", sparePage.isSpareInList(spareName));

    }
    @After
    public void deletingSpare(){
        sparePage.deletingSpareUntilPresent(spareName);
    }
}
