package org.example;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public AppTest( String testName )
    {
        super( testName );
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }

    public static class BoardPage {
        WebDriver webDriver;

        public BoardPage(WebDriver webDriver) {
            this.webDriver = webDriver;
            PageFactory.initElements(webDriver, this);
        }

        @FindBy(xpath = "//a[.='Add List']")
        private WebElement selectAddList;

        @FindBy(xpath = "//input[@name='name']")
        private WebElement fieldInputName;

        @FindBy(xpath = "//button[@class='btn btn-success btn-sm']")
        private WebElement createButton;

        @FindBy(xpath = "//p[.='Archive All Cards in This List']")
        private WebElement selectArchiveAllCardInThisList;

        @FindBy(xpath = "//p[.='Archive This List']")
        private WebElement selectArchiveThisList;

        @FindBy(xpath = "//div[.='Set as a Complete List']")
        private WebElement selectSetAsACompleteList;

        @FindBy(xpath = "//p[.='Sort This List from A to Z']")
        private WebElement selectSortThisListFromAtoZ;

        @FindBy(xpath = "//p[.='Sort This List from Z to A']")
        private WebElement selectSortThisListFromZtoA;

        @FindBy(xpath = "//p[.='Sort This List by Nearest Due Date']")
        private WebElement selectSortThisListByNearestDueDate;

        @FindBy(xpath = "//p[.='Sort This List by Furthest Due Date']")
        private WebElement selectSortThisListByFurthestDueDate;

        @FindBy(xpath = "//p[.='Sort This List by Nearest Created Date']")
        private WebElement selectSortThisListByNearestCreatedDate;

        @FindBy(xpath = "//p[.='Sort This List by Furthest Created Date']")
        private WebElement selectSortThisListByFurthestCreatedDate;

        @FindBy (xpath ="//div[@id='notistack-snackbar']")
        private WebElement verifySuccessCreate;

        @FindBy (xpath = "(//div[@class='RoundActionMenu_container__2ta8s'])[last()]")
        private WebElement selectMoreButton;

        @FindBy (xpath = "//h1[.='List Action']")
        private WebElement verifyListAction;

        @FindBy (xpath = "(//a[.=\"Add Card\"])[last()]")
        private WebElement selectAddCard;

        @FindBy (xpath = "(//a[contains(text(),'Add Card')])[4]")
        private WebElement selectSameCard;
        @FindBy (xpath = "//input[@class='form-control']")
        private WebElement fieldInputCardName;

        @FindBy (xpath = "//input[@class='MuiSwitch-input PrivateSwitchBase-input css-1m9pwf3']")
        private WebElement switchPrivateCard;

        @FindBy (xpath = "//div[@class='Button_container__1WNuB']")
        private WebElement createAddCard;

        @FindBy (xpath = "//p[.='Filter']")
        private WebElement selectFilter;

        @FindBy (xpath ="//input[@class='form-control']")
        private WebElement fieldSearchCard;

        @FindBy (xpath = "//h1[contains(.,'testcase1')]")
        private WebElement verifyCard;

        @FindBy (xpath ="//div[@id='notistack-snackbar']")
        private WebElement appearNotifications;

    }
}
