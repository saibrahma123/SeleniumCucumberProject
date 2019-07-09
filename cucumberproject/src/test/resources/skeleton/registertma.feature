Feature: Register feature for TestMeApp website
Scenario: succesful registration
Given url of TestMeApp "http://10.232.237.143:443/TestMeApp/RegisterUser.htm"
When me enters "poisonnumber" as username
And user enters "kosuri" as firstname
And user enters "sai" as lastname
And user enters "sairam123123" as password
And user enters "sairam123123" as confirmpassword
And user enters "male" as gender
And user enters "sai123cr@gmail.com" as emailid
And user enters 9856321470 as mobilenumber
And user enters "26/08/2005" as dateofbirth
And user enters "venkateshwaracolony" as address
And user selects a security question
And user enters "pandu" as securityanswer
Then user clicks on register button

