Feature: To validate the apollo application
Scenario: To purchase the protin powder


Given the user has launch the application
When the user is to be scroll down this page 
And the user click the diabetes care
Then it should be displayed diabetes page
When the user click the brands
And the user is to scroll down this brand
And the user click the checkbox D-portin
And the user is to be scroll up this page
And the user click the chocolate powder
Then it should be displayed addcart page
When the user click the add to cart
And the user click the addtocart icon
Then it should be displayed cart page
