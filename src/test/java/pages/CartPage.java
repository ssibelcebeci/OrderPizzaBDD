package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.BaseDriver;

public class CartPage {

    public CartPage() {
        PageFactory.initElements(BaseDriver.driver,this);
    }

    @FindBy(xpath = "//a[.//img[@alt='Remove-Icon']]")
    public WebElement remove;

    @FindBy(xpath = "(//h1[contains(text(),'səbətiniz boşdur')])[3]")
    public WebElement emptyCartTitle;

    @FindBy(xpath = "//div[@role='group']//button[@disabled]//strong")
    public WebElement quantityValue;
}
