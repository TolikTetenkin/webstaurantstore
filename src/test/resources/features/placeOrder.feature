Feature: Add to Card and Empty Card buttons validation
 

  @smoke
  Scenario Outline: Validating functionality of AddToCard and EmptyCard buttons
    Given User on a home page
    When  User typed "<itemId>" in to search box and tap search
    And   Verify that User landed on a page with "<itemTitle>" item
    Then  User tap on Add to Card button
    And   User tap on Cart button
    And   Verify that "<itemTitle>" item in a card
    Then  User tap on Empty Card button
    And   Verify that conformation appears
    And   User tap on Empty Cart button in the conformation
    
    
    Examples: 
      | itemId  | itemTitle | 
      | 825CI25MS |  Valor 25 oz. Pre-Seasoned Mini Cast Iron Round Casserole Dish - 12/Case  | 
  
