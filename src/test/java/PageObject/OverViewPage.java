package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OverViewPage {
    static WebDriver webDriver;

    public OverViewPage (WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }
    @FindBy(xpath = "//h1[.='Board']")
    private WebElement selectBoard;
    @FindBy (xpath = "//h1[.='Group Chat']")
    private WebElement selectGroupChat;

    public void clickBoard()  {
        WebElement clickBoard = new WebDriverWait(webDriver, Duration.ofSeconds(500)).
                until(ExpectedConditions.elementToBeClickable(selectBoard));
        clickBoard.click();

    }
    public void clickGroupChat() {
        WebElement clickGroupChat= new WebDriverWait(webDriver, Duration.ofSeconds(500)).
                until(ExpectedConditions.elementToBeClickable(selectGroupChat));
        clickGroupChat.click();
    }
}
