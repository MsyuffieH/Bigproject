package stepDef;

import PageObject.DocsAndFilesPage;
import PageObject.HomePage;
import PageObject.OverViewPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Hooks {
    public static WebDriver webDriver;
    @Before
    public void setup() {
        ChromeOptions chrome_options = new ChromeOptions();
        chrome_options.addArguments("--profile-directory=Default");
        chrome_options.addArguments("--ignore-certificate-errors");

        chrome_options.addArguments("user_agent=DN");
        chrome_options.addArguments("user-data-dir=C:\\Users\\Acer\\AppData\\Local\\Google\\Chrome\\User Data\\");
        chrome_options.addArguments("--profile-directory=Default");
        System.setProperty("webdriver.chrome.driver", "D:\\webDriver\\chromedriver.exe");
        webDriver = new ChromeDriver(chrome_options);
        webDriver.get("https://staging.cicle.app");
    }
    @Given("I on  the staging cicle App website")
    public void openCicleHomePage() {
        HomePage homepage = new HomePage(webDriver);
        Assert.assertEquals("Home", homepage.openHomePage());
    }
    @When("I click team")
    public void openTeam() throws InterruptedException {
        HomePage homePage = new HomePage(webDriver);
        homePage.clickTeam();
        Assert.assertEquals("QA-14-BP-D",homePage.verifyOverviewPage());
    }
    @And("I click Board")
    public void openBoard() {
        OverViewPage overViewPage = new OverViewPage(webDriver);
        overViewPage.clickBoard();
    }
    @And("I click group and chat")
    public void openGroupAndChat(){
        OverViewPage overViewPage = new OverViewPage(webDriver);
        overViewPage.clickGroupChat();
    }
    @And("I click Docs & Files")
    public void openDocsAndFiles() {
        DocsAndFilesPage docsAndFilesPage = new DocsAndFilesPage(webDriver);
        docsAndFilesPage.clickDocsAndFiles();
    }

    @After
    public static void closeBrowser(){
        webDriver.quit();
    }
}



