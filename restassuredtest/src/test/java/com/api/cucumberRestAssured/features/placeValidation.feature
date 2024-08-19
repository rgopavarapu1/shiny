Feature: Validate Place API
@AddPlace @Regression
Scenario Outline: Verify if place is being added successfully using addPlaceAPI
    Given Add place Payload with "<name>" "<language>" "<Address>"
    When User calls "AddPlaceAPI" with "Post" HTTP request
    Then the API call completed successfully with Status code 200
    And "status" in response body is "OK"
    And "scope" in response body is "APP"
    And verify place_Id created maps to "<name>" using "GetPlaceAPI"

Examples:
    |   name   |    language   |    Address |
    |   Aloha  |     Korean    | Aloha circle, huawei |
    |chacha chai| Marati    |   BMC layout, Bandra, Mumbai |
    | nika fashion| English | Sudan ragouni, SF | 

@DeletePlace @Regression
# Scenario: Verify if Delete Place functionality is working

# 	Given DeletePlace Payload
# 	When User calls "DeletePlaceAPI" with "POST" HTTP request
# 	Then the API call completed successfully with Status code 200
# 	And "status" in response body is "OK"