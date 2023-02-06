import static org.junit.Assert.assertTrue;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

@RunWith(Cucumber.class)
@CucumberOptions(

        plugin = {"pretty","html:target/Decbatch/report.html"}

)

public class TestRunner
{
    /**
     * Rigorous Test :-)
     */
    public static WebDriver driver;

    @BeforeClass

    public static void startBrowser(){

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
        driver.get(Constants.url);
    }


    @AfterClass
    public static void stopBrowser(){
        driver.close();
    }



}
