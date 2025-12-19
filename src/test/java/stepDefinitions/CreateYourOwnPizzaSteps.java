package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.*;
import io.qameta.allure.testng.AllureTestNg;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import pages.CartPage;
import pages.ProductPage;
import pages.Homepage;
import utilities.ReusableMethods;

import java.util.Random;

@Listeners({AllureTestNg.class})
@Epic("Order Pizza Application")
@Feature("Create Your Own Pizza Flow")
public class CreateYourOwnPizzaSteps extends ReusableMethods {

    private static final Logger logger =
            LogManager.getLogger(CreateYourOwnPizzaSteps.class);

    Homepage hp = new Homepage();
    ProductPage pp = new ProductPage();
    CartPage cp = new CartPage();

    @When("User clicks on Create Your Own Pizza from the sub menu")
    @Story("Navigate to Create Your Own Pizza page")
    public void user_clicks_on_create_your_own_pizza_from_the_sub_menu() {
        logger.info("Clicking Create Your Own Pizza from sub menu");
        myClick(hp.createYourOwn);
    }

    @When("User clicks on Create Your Own Pizza card")
    public void user_clicks_on_create_your_own_pizza_card() {
        logger.info("Clicking Create Your Own Pizza card");
        myClick(pp.createYourOwnPizzaCart);
    }

    @When("User increases the product quantity to {int}")
    public void user_increases_the_product_quantity_to(Integer quantity) {
        logger.info("Increasing pizza quantity to " + quantity);
        for (int i = 0; i < quantity - 1; i++) {
            myClick(pp.increaseQtyBtn);
        }
    }

    @And("User completes pizza customization and add to cart")
    @Story("Customize pizza and add to cart")
    @Severity(SeverityLevel.CRITICAL)
    public void userCompletesPizzaCustomizationAndAddToCart() {
        logger.info("Selecting pizza size");
        myClick(pp.largeSize);
        logger.info("Selecting dough option");
        scrollAndClick(pp.doughOpt);
        logger.info("Waiting for toppings to be visible");
        wait.until(ExpectedConditions.visibilityOf(pp.toppings.get(0)));
        ((JavascriptExecutor) driver)
                .executeScript("arguments[0].scrollIntoView({block:'center'});", pp.toppings.get(0));
        Random rnd = new Random();
        WebElement randomTopping = pp.toppings.get(rnd.nextInt(pp.toppings.size()));
        logger.info("Selecting random topping");
        scrollAndClick(randomTopping);
        logger.info("Selecting light option");
        myClick(pp.lightOption);
        logger.info("Adding customized pizza to cart");
        jsClick(pp.addToCart);
        logger.info("Opening cart");
        jsClick(hp.cart);
    }

    @Then("Product quantity should be displayed as {int}")
    @Story("Verify product quantity in cart")
    @Severity(SeverityLevel.NORMAL)
    public void product_quantity_should_be_displayed_as(Integer expectedQty) {
        logger.info("Verifying product quantity in cart. Expected: " + expectedQty);
        wait.until(ExpectedConditions.visibilityOf(cp.quantityValue));
        int actualQty = Integer.parseInt(cp.quantityValue.getText());
        Assert.assertEquals(actualQty, expectedQty);
    }
}
