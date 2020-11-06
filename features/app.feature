Feature: Test J.P Morgan logo is displayed in search result of Google

  Scenario Outline:
   Given Open "<browser>" and navigate to "<url>"
   When  user need to search for "<valueToBeSearched>"
   And   click on first result returned by google	
   Then  logo should be displayed 
   
   Examples:
   |browser|url|valueToBeSearched|
   |chrome|https://www.google.com/|J.P.Morgan|
   
  
  
  
   
   
   
   
   