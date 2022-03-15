Feature: Home Page Validation

  @TestCase1
  Scenario: Validate title of page
    When the user enter the aplicative
    Then loade the page CLOTHESSTORE

  @TestCase2
  Scenario: Validate load of option menu
    When the user enter the page CLOTHESSTORE
    Then view the option menu "Hombre", "Mujer", "Junior", "Niños", "Accesorios" and "Ofertas"


  @TestCase3
  Scenario: Validate that the options are presented "MODA INFATIL" y "PROTECCION"
    When the user enter the page CLOTHESSTORE
    Then view the option "MODA INFATIL" and "PROTECCION"

  @TestCase4
  Scenario: Validate that the option is displayed "PRODUCTOS MÁS BUSCADOS"
    When the user enter the page CLOTHESSTORE
    Then view the option "PRODUCTOS MÁS BUSCADOS"

  @TestCase5
  Scenario: Validate that the search option, shopping cart, profile and login are displayed
    When the user enter the page CLOTHESSTORE
    Then view the search option, shopping cart, profile and login