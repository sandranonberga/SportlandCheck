Feature: sportland site test

  Scenario: check shoes
    Given open "sportland.lv" home page
    When we push menu button
    And we push "PRODUKTI" button
    And we push "ZĒNI" category, "APAVI" subcategory for "Futbols" product
    And sort by "Izpārdošana"
    Then check that all items are on sale
    And select brand
#    Then check that all items has correct brand