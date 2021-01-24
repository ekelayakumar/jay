
Feature:  verifying Adactin page Details
 
  Scenario Outline:  verifying Adactin page login with valid credentials
  
    Given user is on the adactin page by chrome
    When user should be enter the "<username>" and "<password>"
    When user move on nextpage and enter the vaild values "<location>" , "<hotels>" , "<roomtypes>" , "<No of rooms>" , "<check in>" , "<check out>" , "<adult>" , "<children>"
    And user click a search ,select  and continoue buttons
    When user insert the vaild details "<first>" , "<last>" , "<Address>" , "<card no>" , "<card type>" , "<month>" , "<year>" , "<cvv no>" 
    Then user should  be verify the success massage and order no
  

    Examples: 
      | username   | password | location | hotel        | roomtypes | No of rooms | check in | check out | adult | children | first | last | Address |    card no     | card type | month | year | cvv no |
      |taraktk9000 | abcd1234@| Paris    | Hotel Creek  | Deluxe    |      2      |22/01/2021|23/01/2021 | 2-Two | 1-One    | jay   |karthi| chennai |1234567809876543|    VISA   |  May  | 2022 | 556    |
    