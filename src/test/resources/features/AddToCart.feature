Feature: Cart functionality for pizza orders

  Scenario: Add a pizza to cart and verify product and cart details
    Given User navigates to the website
    When User clicks on Pizza from the top menu
    And User selects Premium Dort Etli Pizza
    And User increases the product quantity by one
    And User adds the product to the cart
    And User click to the cart
    And User removes the product from the cart
    Then Empty cart message should be displayed