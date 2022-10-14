package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    WebDriver webDriver;

    public HomePage(WebDriver webDriver){
        this.webDriver = webDriver;
        PageFactory.initElements(webDriver, this);
    }
    @FindBy(xpath ="//h1[.='Home']")
    private WebElement verifyHomePage;
    @FindBy(xpath = "//div[@class='Card_Card__2LWWW']")
    private WebElement teamButton;
    @FindBy(xpath = "//span[.='QA-14-BP-D']")
    private WebElement verifyTeamPage;

    public String openHomePage(){
        WebElement openHomePage = new WebDriverWait(webDriver, Duration.ofSeconds(500)).
                until(ExpectedConditions.visibilityOf(verifyHomePage));

        return openHomePage.getText();
    }

    public void clickTeam(){
        WebElement clickTeam = new WebDriverWait(webDriver, Duration.ofSeconds(500)).
                until(ExpectedConditions.elementToBeClickable(teamButton));
        clickTeam.click();
    }
    public String verifyOverviewPage() throws InterruptedException {
        Thread.sleep(2000);
        return verifyTeamPage.getText();
    }

}
