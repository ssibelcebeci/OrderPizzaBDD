package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;
import utilities.ReusableMethods;

import java.util.List;

public class ProductPage extends ReusableMethods {

    public ProductPage() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "(//button[contains(@class,'qty-button')])[3]")
    public WebElement increaseQtyBtn;

    @FindBy(xpath = "//button[contains(@class,'add-cart-btn')]")
    public WebElement addToCart;

    @FindBy(xpath = "//span[contains(@class,'PizzaCard__title') and contains(text(),'öz pizzanı')]")
    public WebElement createYourOwnPizzaCart;

    @FindBy(css = "div.active-size-selection")
    public WebElement largeSize;

    @FindBy(xpath = "//span[text()='İncə Xəmir']/ancestor::div[contains(@class,'dough-tile')]")
    public WebElement doughOpt;

    @FindBy(xpath = ".//label[contains(@class,'MuiFormControlLabel-root')]")
    public List<WebElement> toppings;

    @FindBy(id = "toppingSingleBox")
    public WebElement lightOption;
}
