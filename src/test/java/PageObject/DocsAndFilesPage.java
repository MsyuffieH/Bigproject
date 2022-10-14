package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DocsAndFilesPage {
    WebDriver webDriver;

    public DocsAndFilesPage(WebDriver webDriver) {
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }
    @FindBy(xpath = "//h1[.='Docs & Files']")
    private WebElement selectDocsAndFiles;
    @FindBy(xpath = "//span[.='Docs & Files']")
    private WebElement verifyDocAndPage;

    @FindBy (xpath = "//p[.='Add Item Here']")
    private WebElement selectAddItemHere;

    @FindBy (xpath = "//p[.='Add a New Doc']")
    private WebElement selectAddNewDocs;

    @FindBy (xpath = "//textarea[@placeholder='Type a title...']")
    private WebElement fieldNameDoc;
    @FindBy (xpath ="//div[@class='fr-element fr-view']/p[1]")
    private WebElement fieldStory;

    @FindBy (xpath = "//div[.='Publish']")
    private WebElement buttonPublish;
    //    Create doc successful
    @FindBy (xpath = "//div[@id='notistack-snackbar']")
    private WebElement verifySuccessCreateNewDocs;

    @FindBy (xpath = "//h1[contains(.,'Big project')]")
    private WebElement appearsNewDoc;

    @FindBy (xpath ="//button[.='Insert Files']" )
    private WebElement insertFiles;

    @FindBy (xpath = "//div[@class='fr-form']/input[1]")
    private WebElement browserFiles;

    @FindBy (xpath = "(//div[@class='File_main__title__3fa8S'])[1]")
    private WebElement newDocument;

    @FindBy (css ="[data-testid='MoreHorizIcon']")
    private WebElement moreButton;

    @FindBy (xpath = "//p[normalize-space()='Archive This File']")
    private WebElement archiveThisDocs;

    @FindBy (xpath = "//div[.='Publish Changes']")
    private WebElement buttonPublishChanges;

    @FindBy (xpath = "//div[.='Edit']")
    private  WebElement selectEdit;

    @FindBy (xpath = "//div[@class='fr-element fr-view']/p[1]")
    private WebElement fillStory;

    @FindBy (xpath = "//p[.='Create a New Folder']")
    private WebElement selectCreateNewFolder;

    @FindBy (xpath = "//input[@class='form-control']")
    private WebElement fillFolderName;

    @FindBy (xpath = "//button[@class='btn btn-success btn-sm']")
    private WebElement buttonSave;
    @FindBy (xpath = "//input[@placeholder='Add new comment...']")
    private WebElement addComment;
    @FindBy (xpath = "//div[@class='fr-element fr-view']/p[1]")
    private WebElement commentField;
    @FindBy (xpath = "//h1[.='Post']")
    private WebElement buttonPost;
    @FindBy (xpath = "//input[@type='file']")
    private WebElement uploadFiles;

    @FindBy (xpath = "//div[.='Publish Changes']")
    private WebElement publishChanges;


    public void clickDocsAndFiles(){
        WebElement clickDocsAndFiles = new WebDriverWait(webDriver, Duration.ofSeconds(500)).
                until(ExpectedConditions.elementToBeClickable(selectDocsAndFiles));
        clickDocsAndFiles.click();
    }
    public String verifyDocAndFilePage() throws InterruptedException {
        Thread.sleep(3000);
        return verifyDocAndPage.getText();
    }
    public void clickAddItemHere(){
        selectAddItemHere.click();
    }
    public void clickAddNewDocs(){
        selectAddNewDocs.click();
    }
    public void setNameDocument(String listName) {
        fieldNameDoc.sendKeys(listName);
    }
    public void setFieldStory(String listName) {
        fieldStory.sendKeys(listName);
    }
    public void clickPublish(){
        buttonPublish.click();
    }
    public String verifySuccess() throws InterruptedException {
        Thread.sleep(3000);
        return verifySuccessCreateNewDocs.getText();
    }
    public void setNameFolder(String listName) {
        fillFolderName.sendKeys(listName);
    }
    public void clickInsertFiles(){
        insertFiles.click();
    }
    public void clickUploadFiles() throws InterruptedException {
        Thread.sleep(3000);
        uploadFiles.sendKeys("C:\\Users\\Acer\\Pictures\\Saved Pictures\\Sekolah_QA.png");
    }
    public void clickCreateNewFolder(){
        selectCreateNewFolder.click();
    }
    public void clickButtonSave(){
        buttonSave.click();
    }
    public void clickTheDocument() throws InterruptedException {
        Thread.sleep(2000);
        newDocument.click();
    }
    public void clickAddComment() {
        WebElement clickFieldMessage = new WebDriverWait(webDriver, Duration.ofSeconds(1000)).
                until(ExpectedConditions.elementToBeClickable(addComment));
        clickFieldMessage.click();
    }
    public void setCommentField(String listName) {
        commentField.sendKeys(listName);
    }
    public void clickButtonPost(){
        buttonPost.click();
    }
    public void clickMoreButton() {
        WebElement selectMoreButton = new WebDriverWait(webDriver, Duration.ofSeconds(1000)).
                until(ExpectedConditions.elementToBeClickable(moreButton));
        selectMoreButton.click();
    }
    public void clickEdit(){
        WebElement clickEditButton = new WebDriverWait(webDriver, Duration.ofSeconds(500)).
                until(ExpectedConditions.elementToBeClickable(selectEdit));
        clickEditButton.click();
    }
    public void setFieldStoryInDoc(String listName) throws InterruptedException {
        Thread.sleep(2000);
        fillStory.sendKeys(listName);
    }
    public void clickPublishChanges(){
        buttonPublishChanges.click();
    }
    public void clickArchive(){
        WebElement clickArchiveButton = new WebDriverWait(webDriver, Duration.ofSeconds(500)).
                until(ExpectedConditions.elementToBeClickable(archiveThisDocs));
        clickArchiveButton.click();
    }



}
