Feature: Testme registration
  This file describes the registration process

Scenario Outline: Registration
 Given open the application
 Then provide user <name> 
 Then provide user1 <firstname> 
 And giving <lastname>
 And gave <password>
 And given <cpassword>
 And mail as <email> 
 Then give no as <mobileno>
 Then dob as <dob>
 Then type <address> 
 And final <answer>
 
 Examples:
 
| name  | firstname |  lastname |  password  |  cpassword |  email        |mobileno     |    dob    |    address  |  answer |
|govind | jairam    |   kunal   |  ssss123   |   ssss123  | sss@gmail.com |9876543210   |09/08/1996 |  no.32,xyz  |  blue   |
 