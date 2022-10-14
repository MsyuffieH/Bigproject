package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BoardPage {
    WebDriver webDriver;

    public BoardPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }

    @FindBy(xpath = "//a[.='Add List']")
    private WebElement selectAddList;
    @FindBy(xpath = "//input[@name='name']")
    private WebElement fieldInputName;
    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement selectPrivateCard;
    @FindBy(xpath = "//button[@class='btn btn-success btn-sm']")
    private WebElement createButton;
    @FindBy(xpath = "//p[.='Archive All Cards in This List']")
    private WebElement selectArchiveAllCardInThisList;
    @FindBy(xpath = "//p[.='Archive This List']")
    private WebElement selectArchiveThisList;
    @FindBy(xpath = "//div[@id='notistack-snackbar']")
    private WebElement verifySuccessCreate;
    @FindBy(xpath = "(//div[@class='RoundActionMenu_container__2ta8s'])[last()]")
    private WebElement selectMoreButton;
    @FindBy(xpath = "//input[@class='form-control']")
    private WebElement fieldInputCardName;
    @FindBy(xpath = "(//a[contains(text(),'Add Card')])[3]")
    private WebElement addCardPlanning;
    @FindBy(xpath = "//div[@class='Button_container__1WNuB']")
    private WebElement createAddCard;
    @FindBy(xpath = "//div[@id='notistack-snackbar']")
    private WebElement appearNotifications;
    @FindBy(xpath = "//span[.='Kanban Board']")
    private WebElement verifyOnKanbanBoard;
    @FindBy(xpath = "(//h1[normalize-space()='planning'])[1]")
    private WebElement verifyList;
    @FindBy(xpath = "//h1[.='Post']")
    private WebElement buttonPost;
    @FindBy(xpath = "//p[.='ADD TO CARD']")
    private WebElement verifyCardFeature;
    @FindBy(xpath = "//input[@placeholder='Add new comment...']")
    private WebElement fieldComment;
    @FindBy(xpath = "//a[@class='ModalLinkNoDecor_ModalLink__1zSCj ModalLinkNoDecor_overlay__b-4ve']")
    private WebElement bodyCard;
    @FindBy(xpath = "//div[@class='fr-element fr-view']//p")
    private WebElement typeComment;





    public String verifyKanbanBoard() throws InterruptedException {
        Thread.sleep(2000);
        return verifyOnKanbanBoard.getText();
    }

    public void setFieldInputName(String listName) {
        fieldInputName.sendKeys(listName);
    }

    public void clickAddList() {
        selectAddList.click();
    }

    public void clickCreateButton() {
        createButton.click();
    }

    public String verifySuccessMessage() throws InterruptedException {
        Thread.sleep(2000);
        return verifySuccessCreate.getText();
    }

    public void setFieldInputCardName(String cardName) {
        fieldInputCardName.sendKeys(cardName);
    }

    public String verifyList() throws InterruptedException {
        Thread.sleep(2000);
        return verifyList.getText();
    }

    public void addCard() {
        addCardPlanning.click();
    }

    public void clickAdd() {
        createAddCard.click();
    }

    public void clickMoreButton() throws InterruptedException {
        WebElement moreButton = new WebDriverWait(webDriver, Duration.ofSeconds(1000)).
                until(ExpectedConditions.elementToBeClickable(selectMoreButton));
        moreButton.click();
        selectMoreButton.click();
    }
    public void archiveAllCard(){
        selectArchiveAllCardInThisList.click();
    }
    public void clickArchiveThisList() {
        selectArchiveThisList.click();
    }

    public String getNotification() throws InterruptedException {
        Thread.sleep(3000);
        return appearNotifications.getText();
    }
    public void selectPrivateCard(){
        selectPrivateCard.click();
    }
    public void clickComment(){
        WebElement clickComment = new WebDriverWait(webDriver, Duration.ofSeconds(1000)).
                until(ExpectedConditions.elementToBeClickable(fieldComment));;
        clickComment.click();
    }
    public void setFieldComment(String comment) throws InterruptedException {
        Thread.sleep(1000);
        typeComment.sendKeys(comment);
    }
    public void clickButtonPost(){
        WebElement clickPost = new WebDriverWait(webDriver, Duration.ofSeconds(1000)).
                until(ExpectedConditions.elementToBeClickable(buttonPost));
        clickPost.click();
    }
    public String verifyCommentISuccess(){
        return appearNotifications.getText();
    }
    public String verifyCard(){
        return verifyCardFeature.getText();
    }
    public void clickCard(){
        bodyCard.click();
    }

}