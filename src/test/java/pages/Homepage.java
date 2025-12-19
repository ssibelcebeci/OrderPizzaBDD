package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class Homepage {

    public Homepage() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//*[@id='navbarSupportedContent']/ul/li[2]/span")
    public WebElement pizzaOpt;

    @FindBy(xpath = "//span[contains(text(),'Premium 4 Ətli')]")
    public WebElement premium4;

    @FindBy(css = "img.cart-icon")
    public WebElement cart;

    @FindBy(xpath = "//span[contains(text(),'öz pizzanı')]")
    public WebElement createYourOwn;
}
