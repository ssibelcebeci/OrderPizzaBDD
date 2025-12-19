Feature: Create your own pizza and add it to the cart

  Scenario: Create your own pizza and add it to the cart
    Given User navigates to the website
    When User clicks on Pizza from the top menu
    And User clicks on Create Your Own Pizza from the sub menu
    And User clicks on Create Your Own Pizza card
    And User increases the product quantity to 8
    And User completes pizza customization and add to cart
    And Product quantity should be displayed as 8
