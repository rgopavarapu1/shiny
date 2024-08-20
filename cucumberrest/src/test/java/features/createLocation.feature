Feature: Store creation API
Scenario Outline: Verify a store can be created using Stores API
    Given create a new store using "<name>", "<city>", "<state>", "<zipcode>"
    When user calls Store API with "POST" HTTP request
    Then API call completed successfully with 201 response
    And name in response is "<name>"

Examples:
    |   name          |    city   |    state | zipcode|
    |   BestBuy Yale  |    Haven    | CT     | 06101 |
    |   BestBuy MIT    | Cambridge |  MA    | 02139 |
    | Bestbuy Stanford  | Mountain View | CA | 94043 |

  
