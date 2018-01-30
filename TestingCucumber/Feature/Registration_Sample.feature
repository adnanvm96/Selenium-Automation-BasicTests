Feature: This file has registartion details 

Scenario: Verify that user is able to login
     Given User goes to http://demoqa.com/registration/
     When User fills in the given details registration form 
            |   Adnan        |    
            |   Ahmed        |    
            | 1234567890     |      
            | testuser001    |