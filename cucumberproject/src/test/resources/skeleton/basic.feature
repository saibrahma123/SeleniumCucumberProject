Feature: Shout Feature

@tag1
Scenario: Shaun and Lucia are within range
Given Shaun is 20 meters away from Lucia
When Shaun shouts "Free Coffee"
Then Lucia listens to the message

@tag2
Scenario: Shaun and Lucia are not in the range
Given Shaun is 1000 meters away from Lucia
When Shaun shouts "Free Coffee"
Then Lucia cannot listen to the message