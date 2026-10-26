Feature:  Saucedemo login Functionality
Scenario Outline: saucedemo verify valid login page
Given the user is on saucedemo login page
When the user login into the application with "<username>" and "<password>"
And click the login button
Then the product page is displayed
Example:

|username|password|
|standard_user|secret_sauce|
|problem_user| secret_sauce|
  