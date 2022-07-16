Feature: Validating login function of amazon seller webpage
@smoke
  Scenario Outline:
  : Validating login using correctmname and password
  
  Given user is on amazon seller page on  chrome browser
  
  When user enter user "<Name>" and "<password>"
  
  And user click login button
  
  Then user validating home page visible or not
  
  Examples:
  |Name||password|
  |rtyu||!fg0|  
  ||||
