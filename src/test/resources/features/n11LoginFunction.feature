@n11LoginFavoriteDelete
Feature: N11 Login Add Favorite And Delete Function

  Background: User go to login page
    Given Go to main page

  Scenario Outline: TC01_User login successfully with valid credentials
    When Click to Sign Up button
    Then Verify login page
    When Click to Sign Up with Facebook Button
    Then Go to Facebook login page
    When <User> enters valid credentials
    And  Press the login button
    Then User signed up successfully "<Account Holder Name>"
    When User types in the search box "iphone" and press the enter
    Then Verify that "Iphone," is searched
    When Go to the 2nd page on the search result page
    And The 3rd product on the page is added to favourites
    And Go to My Favorites and Lists page
    Then Verify that the My favorites page is opened
    When The added product is deleted from the favorites
    Then Verify the deletion process
    Then Log out process is done
    Examples:
      | User     | Account Holder Name               |
      | customer | Enter Account Account Holder Name |