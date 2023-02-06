package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {

    WebDriver driver;

    public DashboardPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//*[@data-icon=\"chevron-left\"]")
    public WebElement  left_cursor;

    @FindBy(xpath = "//h1[contains(text(),'Dashboard')]")
    public  WebElement  dashboard_text;

    @FindBy(xpath = "//button[contains(text(),'Accept')]")
    public  WebElement  accept_btn;

    @FindBy(xpath = "//span[@title=\"Services\"]")
    public WebElement services;

    @FindBy(linkText = "Trading Account")
    public  WebElement  tradingaccount;

}
