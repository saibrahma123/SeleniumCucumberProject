Feature: Login feature for demowebshop
Scenario Outline: valid login scenario
Given url of demowebshop "http://demowebshop.tricentis.com/login"
When ram enters <username> as username
And ram enters <password> as password
Then ram is in webshop as <type>

Examples:
|username|password|type|
|askmail@ymail.com|abc123|admin|
|askmail@gmail.com|abc123|guest|
|askmail@email.com|abc123|vendor|
#
#Scenario: Data Table Example
#Given Admin of the test me app enters
#|electronics|head phones|1|
#|apparels 	|sweat shirt|2|
#|electronics|USB				|2|