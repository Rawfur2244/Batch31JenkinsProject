@greenKart
Feature: Verify item shipments from GreenKart
Scenario: Successfully add 2 items to cart and then ship them to united states
Given user goes to GreenKart home page
And user verify the page title "GreenKart - veg and fruits kart"
When user capture all items from the page
And print sorted prices in decending order
And add second plus third item into cart
Then user go to cart page
And user verify total price 
And user go to next page to select country "United States"
And user verify successfully shipped item "Thank you, your order has been placed successfully"