package stepDef;


import PageObject.BoardPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class BoardStep {
    private WebDriver webDriver;


    public BoardStep() {
        super();
        this.webDriver = Hooks.webDriver;
    }

    @Given("I on board page")
    public void setBoardPage() throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Assert.assertEquals("Kanban Board",boardPage.verifyKanbanBoard());
    }

    @And("I click add list button")
    public void clickAddList() {
        BoardPage boardPage = new BoardPage(webDriver);
        boardPage.clickAddList();
    }

    @And("I type list name {string}")
    public void listName(String list) {
        BoardPage boardPage = new BoardPage(webDriver);
        boardPage.setFieldInputName(list);
    }
    @And("I click private card")
    public void clickPrivateCard(){
        BoardPage boardPage = new BoardPage(webDriver);
        boardPage.selectPrivateCard();
    }

    @When("I click create button")
    public void clickCreateButton() {
        BoardPage boardPage = new BoardPage(webDriver);
        boardPage.clickCreateButton();
    }

    @Then("I should be success create new list")
    public void verifySuccessCreateNew() throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Assert.assertEquals("Creating list is success", boardPage.verifySuccessMessage());
    }

    @Given("I click the card")
    public void setListName() throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Assert.assertEquals("planning",boardPage.verifyList());
    }
    @And("I click the card on the list")
    public void clickCard(){
        BoardPage boardPage = new BoardPage(webDriver);
        boardPage.clickCard();
    }
    @And("I click add card")
    public void clickAddCard() {
        BoardPage boardPage = new BoardPage(webDriver);
        boardPage.addCard();
    }

    @And("I type card name {string}")
    public void cardName(String card) {
        BoardPage boardPage = new BoardPage(webDriver);
        boardPage.setFieldInputCardName(card);
    }

    @When("I click add")
    public void clickAdd(){
        BoardPage boardPage = new BoardPage(webDriver);
        boardPage.clickAdd();
    }
    @Then("I should be success create new card")
    public void successCreateCard() throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Assert.assertEquals("Creating card is success",boardPage.verifySuccessMessage());
    }
    @Then("I should be failed create new list")
    public void failCreateNewList() throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Assert.assertEquals("List name cannot be empty",boardPage.verifySuccessMessage());
    }
    @Then("I should be failed create new card")
    public void failCreateNewCard() throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Assert.assertEquals("Card name cannot be empty",boardPage.verifySuccessMessage());
    }
    @And("I click more button")
    public void clickMoreButton() throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        boardPage.clickMoreButton();
    }
    @When("I click archive all card in this list")
    public void archiveTheCard(){
        BoardPage boardPage = new BoardPage(webDriver);
        boardPage.archiveAllCard();
    }
    @Then("I should be success archive all card")
    public void successArchiveAllCardInThisList() throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Assert.assertEquals("All cards on list planning moved to archived",boardPage.getNotification());
    }
    @When("I click archive the list")
    public void archiveThisList() {
        BoardPage boardPage = new BoardPage(webDriver);
        boardPage.clickArchiveThisList();
    }
    @Then("I should be success archive this list")
    public void successArchiveList() throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Assert.assertEquals("planning list has been moved to archived",boardPage.getNotification());
    }
    @Given("I on the card")
    public void verifyInCardFeature(){
        BoardPage boardPage = new BoardPage(webDriver);
        boardPage.clickCard();
        Assert.assertEquals("ADD TO CARD",boardPage.verifyCard());
    }
    @And("I click comment")
    public void clickComment() {
        BoardPage boardPage = new BoardPage(webDriver);
        boardPage.clickComment();
    }

    @And("I type {string} in field comment")
    public void commentInCard(String card) throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        boardPage.setFieldComment(card);
    }

    @When("I click post in card feature")
    public void buttonPostInCard(){
        BoardPage boardPage = new BoardPage(webDriver);
        boardPage.clickButtonPost();
    }
    @Then("I should be success create comment")
    public void successCreateComment() throws InterruptedException {
        BoardPage boardPage = new BoardPage(webDriver);
        Assert.assertEquals("Create comment is success", boardPage.getNotification());
    }




}