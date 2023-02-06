import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.DashboardPage;

public class MyStepdefs {

    WebDriver driver;

    DashboardPage dashboardPage;


    @Before
    public void start(){

        driver = TestRunner.driver;
        dashboardPage = new DashboardPage(driver);

    }

    @Given("user navigates to the application")
    public void userNavigatesToTheApplication() {

        String actualTitle = driver.getTitle();
        String expTitle = "interactive investor – the UK’s number one flat-fee investment platform";
        Assert.assertEquals(expTitle,actualTitle);
    }


    @Then("user is navigated to theDashboard page")
        public void userIsNavigatedToTheDashboardPage() {

    }

    @Then("user is navigated to Trading account page")
    public void userIsNavigatedToTradingAccountPage() throws InterruptedException {
        dashboardPage.accept_btn.click();
        Thread.sleep(4000);
        dashboardPage.services.click();
        Thread.sleep(4000);
        dashboardPage.tradingaccount.click();
        Thread.sleep(3000);
        String actualurl = driver.getCurrentUrl();
        String expUrl = "https://www.ii.co.uk/ii-accounts/trading-account";
        Assert.assertEquals(expUrl,actualurl);

    }
}
