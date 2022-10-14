package stepDef;

import PageObject.DocsAndFilesPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class DocsAndFilesStep {
    private WebDriver webDriver;


    public DocsAndFilesStep() {
        super();
        this.webDriver = Hooks.webDriver;
    }
    @Given("I on Doc and files page")
    public void verifyDocAndFilePage() throws InterruptedException {
        DocsAndFilesPage docsAndFilesPage = new DocsAndFilesPage(webDriver);
        Assert.assertEquals("Docs & Files",docsAndFilesPage.verifyDocAndFilePage());
    }
    @And("I click on add item here")
    public void clickAddItem(){
        DocsAndFilesPage docsAndFilesPage = new DocsAndFilesPage(webDriver);
        docsAndFilesPage.clickAddItemHere();
    }
    @And("I choose add new docs")
    public void chooseAddNewDocs(){
        DocsAndFilesPage docsAndFilesPage = new DocsAndFilesPage(webDriver);
        docsAndFilesPage.clickAddNewDocs();
    }
    @And("I type {string} on the document name")
    public void nameDocument(String list) {
        DocsAndFilesPage docsAndFilesPage = new DocsAndFilesPage(webDriver);
        docsAndFilesPage.setNameDocument(list);
    }
    @And("I type {string} in The story")
    public void fieldStory(String name) {
        DocsAndFilesPage docsAndFilesPage = new DocsAndFilesPage(webDriver);
        docsAndFilesPage.setFieldStory(name);
    }
    @When("I click publish")
    public void clickPublish(){
        DocsAndFilesPage docsAndFilesPage = new DocsAndFilesPage(webDriver);
        docsAndFilesPage.clickPublish();
    }
    @Then("I see notification Add docs is success")
    public void successAddNewDocs() throws InterruptedException {
        DocsAndFilesPage docsAndFilesPage = new DocsAndFilesPage(webDriver);
        Assert.assertEquals("Create doc successful",docsAndFilesPage.verifySuccess());
    }
    @And("I type {string} the document name")
    public void fillNameOfDocument(String name) {
        DocsAndFilesPage docsAndFilesPage = new DocsAndFilesPage(webDriver);
        docsAndFilesPage.setNameDocument(name);
    }
    @And("I click insert file")
    @And("I upload files")
    public void clickInsertFile() throws InterruptedException {
        DocsAndFilesPage docsAndFilesPage = new DocsAndFilesPage(webDriver);
        docsAndFilesPage.clickInsertFiles();
        docsAndFilesPage.clickUploadFiles();
    }
    @And("I click create new folder")
    public void createNewFolder(){
        DocsAndFilesPage docsAndFilesPage = new DocsAndFilesPage(webDriver);
        docsAndFilesPage.clickCreateNewFolder();
    }
    @And("I type {string} the folder name")
    public void fillFolderName(String name){
        DocsAndFilesPage docsAndFilesPage = new DocsAndFilesPage(webDriver);
        docsAndFilesPage.setNameFolder(name);
    }
    @When("I click save")
    public void clickSave(){
        DocsAndFilesPage docsAndFilesPage = new DocsAndFilesPage(webDriver);
        docsAndFilesPage.clickButtonSave();
    }
    @Then("I see notification Create bucket success")
    public void successCreateBucket() throws InterruptedException {
        DocsAndFilesPage docsAndFilesPage = new DocsAndFilesPage(webDriver);
        Assert.assertEquals("Create bucket successful", docsAndFilesPage.verifySuccess());
    }
    @When("I click upload files")
    public void uploadFiles() throws InterruptedException {
        DocsAndFilesPage docsAndFilesPage = new DocsAndFilesPage(webDriver);
        docsAndFilesPage.clickUploadFiles();
    }
    @Then("I see notification upload success")
    public void successUploadFiles() throws InterruptedException {
        DocsAndFilesPage docsAndFilesPage = new DocsAndFilesPage(webDriver);
        Assert.assertEquals("Create files successful",docsAndFilesPage.verifySuccess());
    }
    @And("I click my document")
    public void clickMyDocument() throws InterruptedException {
        DocsAndFilesPage docsAndFilesPage = new DocsAndFilesPage(webDriver);
        docsAndFilesPage.clickTheDocument();
    }
    @And("I click add comment")
    public void addComment()  {
        DocsAndFilesPage docsAndFilesPage = new DocsAndFilesPage(webDriver);
        docsAndFilesPage.clickAddComment();
    }
    @And("I type {string} in comment field")
    public void fillComment(String comment){
        DocsAndFilesPage docsAndFilesPage = new DocsAndFilesPage(webDriver);
        docsAndFilesPage.setCommentField(comment);
    }
    @When("I click post")
    public void clickPost(){
        DocsAndFilesPage docsAndFilesPage = new DocsAndFilesPage(webDriver);
        docsAndFilesPage.clickButtonPost();
    }
    @Then("I see notification create comment success")
    public void successComment() throws InterruptedException {
        DocsAndFilesPage docsAndFilesPage = new DocsAndFilesPage(webDriver);
        Assert.assertEquals("Create comment on bucket file successful",docsAndFilesPage.verifySuccess());
    }
    @And("I click more button in the document")
    public void clickMoreButton() {
        DocsAndFilesPage docsAndFilesPage = new DocsAndFilesPage(webDriver);
        docsAndFilesPage.clickMoreButton();
    }
    @And("I click edit")
    public void clickEdit() {
        DocsAndFilesPage docsAndFilesPage = new DocsAndFilesPage(webDriver);
        docsAndFilesPage.clickEdit();
    }
    @And("")
    @And("I type {string} The story in the Document")
    public void fieldStoryOnDoc(String comment) throws InterruptedException {
        DocsAndFilesPage docsAndFilesPage = new DocsAndFilesPage(webDriver);
        docsAndFilesPage.setFieldStoryInDoc(comment);
    }
    @When("I click publish changes")
    public void clickPublishChanges(){
        DocsAndFilesPage docsAndFilesPage = new DocsAndFilesPage(webDriver);
        docsAndFilesPage.clickPublishChanges();
    }
    @Then("I see notification Update doc success")
    public void successUpdateDocs() throws InterruptedException {
        DocsAndFilesPage docsAndFilesPage = new DocsAndFilesPage(webDriver);
        Assert.assertEquals("Update file successful",docsAndFilesPage.verifySuccess());
    }
    @When("I click archive this docs")
    public void clickArchive(){
        DocsAndFilesPage docsAndFilesPage = new DocsAndFilesPage(webDriver);
        docsAndFilesPage.clickArchive();
    }
    @Then("I see notification Archive docs is success")
    public void verifySuccessArchive() throws InterruptedException {
        DocsAndFilesPage docsAndFilesPage = new DocsAndFilesPage(webDriver);
        Assert.assertEquals("Get File Detail successful",docsAndFilesPage.verifySuccess());
    }





}