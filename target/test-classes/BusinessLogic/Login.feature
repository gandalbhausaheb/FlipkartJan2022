Feature: Login feature

Background: User is successfully logged in
Given User open "Chrome" browser with exe "E:\Automation support\\chromedriver.exe"
Given User open url as "https://www.flipkart.com/"


@RegressionTest
Scenario: Loging functionality with valid credintials
When User click on cancel button
When User move on Login DropDown
When User click on My Profile
When User enter "9673129116" as username
When User enter "8208504089" as password
When User click on Login button
Then Application shows user profile to user                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                       