package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.*;
import io.qameta.allure.testng.AllureTestNg;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.testng.annotations.Listeners;
import pages.CartPage;
import pages.Homepage;
import pages.ProductPage;
import utilities.ConfigReader;
import utilities.ReusableMethods;

@Listeners(AllureTestNg.class)
@Epic("Order Pizza Application")
@Feature("Add To Cart Flow")
public class AddToCartSteps extends ReusableMethods {

    private static final Logger logger =
            LogManager.getLogger(AddToCartSteps.class);

    Homepage hp=new Homepage();
    ProductPage pp=new ProductPage();
    CartPage cp=new CartPage();

    @Given("User navigates to the website")
    @Story("Open application")
    @Severity(SeverityLevel.BLOCKER)
    public void userNavigatesToTheWebsite() {
        logger.info("Navigating to the website");
        driver.get(ConfigReader.getProperty("url"));
    }

    @When("User clicks on Pizza from the top menu")
    @Story("Navigate to pizza category")
    public void userClicksOnPizzaFromTheTopMenu() {
        logger.info("Clicking on Pizza from top menu");
        myClick(hp.pizzaOpt);
    }

    @And("User selects Premium Dort Etli Pizza")
    @Story("Select pizza product")
    public void userSelectsPremiumDortEtliPizza() {
        logger.info("Selecting Premium Dort Etli Pizza");
        myClick(hp.premium4);
    }

    @And("User increases the product quantity by one")
    public void userIncreasesTheProductQuantityByOne() {
        logger.info("Increasing product quantity by one");
        myClick(pp.increaseQtyBtn);
    }

    @And("User adds the product to the cart")
    @Story("Add product to cart")
    @Severity(SeverityLevel.CRITICAL)
    public void userAddsTheProductToTheCart() {
        logger.info("Adding product to cart");
        myClick(pp.addToCart);
    }

    @And("User click to the cart")
    public void userHoversOverToTheCart() {
        logger.info("Opening cart");
        threadWait(2);
        jsClick(hp.cart);
        threadWait(2);
    }

    @And("User removes the product from the cart")
    @Story("Remove product from cart")
    public void userRemovesTheProductFromTheCart() {
        logger.info("Removing product from cart");
        jsClick(cp.remove);
    }

    @Then("Empty cart message should be displayed")
    @Story("Verify empty cart message")
    @Severity(SeverityLevel.NORMAL)
    public void emptyCartMessageShouldBeDisplayed() {
        logger.info("Verifying empty cart message");
        verifyContainsText(cp.emptyCartTitle, "boş");
    }
}
