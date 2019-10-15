Feature: sportland site test

  Scenario: check shoes
    Given open "sportland.lv" home page
    When we push menu button
    And we push "PRODUKTI" button
    And we push "ZĒNI" category, "APAVI" subcategory for "Futbols" product
#    And we select izpardosana section
