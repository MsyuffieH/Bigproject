package stepDef;

import PageObject.GroupAndChatPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;


public class GroupAndChatStep {
    private WebDriver webDriver;


    public GroupAndChatStep() {
        super();
        this.webDriver = Hooks.webDriver;

    }

    @Given("I on group chat page")
    public void verifyGroupChatPage() throws InterruptedException {
        GroupAndChatPage groupAndChatPage = new GroupAndChatPage(webDriver);
        Assert.assertEquals("Group Chat",groupAndChatPage.verifyGroupChatPage());
    }
    @And("I type {string} in the message field")
    public void fieldStoryOnDoc(String message) {
        GroupAndChatPage groupAndChatPage = new GroupAndChatPage(webDriver);
        groupAndChatPage.setFieldMessage(message);
    }
    @When("I click button send")
    public void buttonSend(){
        GroupAndChatPage groupAndChatPage = new GroupAndChatPage(webDriver);
        groupAndChatPage.buttonSend();
    }
    @Then("I see the message has been sent success")
    public void successSendMessage(){
        GroupAndChatPage groupAndChatPage = new GroupAndChatPage(webDriver);
        groupAndChatPage.getCompleteSendMessage();
    }
    @When("I delete a message")
    public void successDeleteMessage()throws InterruptedException{
        GroupAndChatPage groupAndChatPage = new GroupAndChatPage(webDriver);
        groupAndChatPage.deleteMessage();
    }
    @Then("I see the message has been delete success")
    public void successDelete() throws InterruptedException {
        GroupAndChatPage groupAndChatPage = new GroupAndChatPage(webDriver);
        Assert.assertEquals("Delete group chat message success",groupAndChatPage.getCompleteDeleteMessage());
    }
    @Then("I see an empty message")
    public void successSendEmptyMessage(){
        GroupAndChatPage groupAndChatPage = new GroupAndChatPage(webDriver);
        groupAndChatPage.getCompleteSendMessage();
    }
    @When("I send a files")
    public void attachButton() throws InterruptedException {
        GroupAndChatPage groupAndChatPage = new GroupAndChatPage(webDriver);
        groupAndChatPage.attachFile();
    }
    @Then("I see notification attach file is success")
    public void attachFiles(){
        GroupAndChatPage groupAndChatPage = new GroupAndChatPage(webDriver);
        Assert.assertEquals("Upload attachments is success",groupAndChatPage.getVerifySuccess());
    }
    @And("I delete the file")
    public void deleteTheFile() throws InterruptedException {
        GroupAndChatPage groupAndChatPage = new GroupAndChatPage(webDriver);
        groupAndChatPage.deleteMessage();
    }
    @Then("I see notification delete the file is success")
    public void successDeleteFile() throws InterruptedException {
        GroupAndChatPage groupAndChatPage = new GroupAndChatPage(webDriver);
        Assert.assertEquals("Delete group chat attachment success", groupAndChatPage.getCompleteDeleteMessage());
    }




}
