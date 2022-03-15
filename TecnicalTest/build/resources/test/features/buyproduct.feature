Feature: Buy product Validation

  @TestCase1
  Scenario: Add a product to cart
    Given the user enter page CLOTHESSTORE
    When the user enter the option Hombres
    And the user select de product
    Then the page displays a message informing that the purchase was added to the cart

  @TestCase2
  Scenario: Validate product increase
    Given the user enter page CLOTHESSTORE
    When the user enter the option Hombres
    And the user select de product
    Then the user increases in "2" the stok to buy and TOTAL increases too to double


  @TestCase3
  Scenario: Validate remove Item
    Given the user enter page CLOTHESSTORE
    When the user enter the option Hombres
    And the user select de product
    Then the user remove el item of the shopping car and view the message "El carrito fue vaciado! "