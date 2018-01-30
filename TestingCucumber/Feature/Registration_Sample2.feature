Feature: This file has user details

Scenario: User is able to login 

     Given User goes to http://demoqa.com/registration/
     When User fills in the given details registration form 
            |First Name  |   Adnan        |    
            |Last Name   |Ahmed           |    
            |Phone Number| 1234567890     |      
            |Username    | testuser001    |

