package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class GroupAndChatPage {
    WebDriver webDriver;

    public GroupAndChatPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//span[.='Group Chat']")
    private WebElement verifyGroupChat;
    @FindBy(xpath = "//div[@class='fr-element fr-view']/p[1]")
    private WebElement fieldMessage;

    @FindBy (css = "[data-testid='SendIcon']")
    private WebElement buttonSend;

    @FindBy (xpath = "(//div[@class='Message_balloonMessage__3dmkS'])[1]")
    private  WebElement verifySuccessSendMessage;

    @FindBy (xpath = "//p[.='Delete Message']")
    private WebElement selectDeleteMessage;

    @FindBy (xpath = "//div[@class='Button_container__1WNuB']")
    private WebElement selectDelete;

    @FindBy (xpath = "//div[@id='notistack-snackbar']")
    private WebElement verifySuccessDeleteMessage;

    @FindBy (xpath = "//div[@id='notistack-snackbar']")
    private WebElement verifyMessage;

    @FindBy (css = ".infinite-scroll-component > div:nth-of-type(1) .MuiSvgIcon-root")
    private WebElement buttonDown;

    @FindBy (xpath = "//input[@type='file']")
    private WebElement buttonAttachFile;

    @FindBy (xpath = "//div[@id='notistack-snackbar']")
    private WebElement verifySuccess;
    @FindBy (xpath = "(//div[@class='Message_content__21YIN'])[last()]")
    private WebElement cursorDown;

    @FindBy (xpath = "(//div[@class='Message_container__3maDl']//div[@class='Message_content__21YIN'])[1]")
    private WebElement messageHover;

    @FindBy (xpath = "(//div[@class='Message_iconOption__3F-Ru'])[1]")
    private WebElement messageOption;

    @FindBy (xpath = "//p[.='Delete Message']")
    private WebElement messageDelete;

    @FindBy (xpath = "//div[@class='Button_container__1WNuB']")
    private WebElement buttonConfirmDelete;

    public String verifyGroupChatPage() throws InterruptedException {
        Thread.sleep(2000);
        return verifyGroupChat.getText();
    }
    public void setFieldMessage(String listName) {
        fieldMessage.sendKeys(listName);
    }
    public void buttonSend(){
        buttonSend.click();
    }
    public Boolean getCompleteSendMessage() {
        WebElement successSendMessage = new WebDriverWait(webDriver, Duration.ofSeconds(2000)).
                until(ExpectedConditions.visibilityOf(verifySuccessSendMessage));
        return successSendMessage.isDisplayed();
    }
    public void deleteMessage() throws InterruptedException{
        Thread.sleep(3000);
        Actions actions = new Actions(webDriver);
        actions.moveToElement(messageHover).perform();
        Thread.sleep(3000);
        messageOption.click();
        messageDelete.click();
        buttonConfirmDelete.click();
    }
    public String getCompleteDeleteMessage() throws InterruptedException {
        Thread.sleep(2000);
        return verifyMessage.getText();
    }
    public void attachFile() throws InterruptedException {
        Thread.sleep(2000);
        buttonAttachFile.sendKeys("C:\\Users\\Acer\\Pictures\\Saved Pictures\\Sekolah_QA.png");
    }
    public String getVerifySuccess() {
        WebElement verifyNotificationSuccess = new WebDriverWait(webDriver, Duration.ofSeconds(500)).
                until(ExpectedConditions.visibilityOf(verifyMessage));
        return verifyNotificationSuccess.getText();
    }


}
