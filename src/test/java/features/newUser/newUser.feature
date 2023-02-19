Feature: Verify New User Functionality

  #TID 001
  @NewUser
  Scenario: Check that by clicking on Tribel.com icon the non user will be redirected to Tribel.com home page
    Given Click on the tribel.com icon

  #TID 002
  @NewUser
  Scenario: Check if the non user can create new post by clicking on New post button
    Given Click on the tribel.com icon
    Then Non-user can not see "New Post"

  #TID 003
  @NewUser
  Scenario: Check that the non user can not see the star contributors
    Given Click on the tribel.com icon
    When Non-user can not see "New Post"
    Then Non-user can not see the star contributors

  #TID 004
  @NewUser
  Scenario: Check that the non user is not allowed to see the Groups
    Given Click on the tribel.com icon
    When Non-user can not see "New Post"
    And Non-user can not see the star contributors
    Then Non-user can not see "Groups"

  #TID 005
  @NewUser
  Scenario: Check that the non-user is not allowed to go to the invite friends page
    Given Click on the tribel.com icon
    When Non-user can not see "New Post"
    And Non-user can not see the star contributors
    And Non-user can not see "Groups"
    Then Non-user can not see "Invite Friends"

  #TID 006
  @NewUser
  Scenario: Verify that non-users will not be able to see Friends feed
    Given Click on the tribel.com icon
    When Non-user can not see "New Post"
    And Non-user can not see the star contributors
    And Non-user can not see "Groups"
    And Non-user can not see "Invite Friends"
    Then Non-user is not be able to see "Friends" Feed

  #TID 007
  @NewUser
  Scenario: Verify that non-users will not be able to see Following Feed
    Given Click on the tribel.com icon
    When Non-user can not see "New Post"
    And Non-user can not see the star contributors
    And Non-user can not see "Groups"
    And Non-user can not see "Invite Friends"
    And Non-user is not be able to see "Friends" Feed
    Then Non-user is not be able to see "Following" Feed

  #TID 008
  @NewUser
  Scenario: Check if the non user can see Breaking Feed posts
    Given Click on the tribel.com icon
    When Non-user can not see "New Post"
    And Non-user can not see the star contributors
    And Non-user can not see "Groups"
    And Non-user can not see "Invite Friends"
    And Non-user is not be able to see "Friends" Feed
    And Non-user is not be able to see "Following" Feed
    Then Verify on "Breaking" feed posts


  #TID 009
  @NewUser
  Scenario: Check if the non user can See Trending Feed posts
    Given Click on the tribel.com icon
    Then Verify on "Trending" feed posts

  #TID 010
  Scenario: Check if the user is redirected to Trending feed after clicking on Home button
    When Click on the "Home" menu
    Then Verify feed url "https://www.tribel.com/public/trending"

  #TID 011
  Scenario: Check if Clicking on Sign in button takes the user to Sign in page
    When Click on the "Home" menu
    Then Verify feed url "https://www.tribel.com/public/trending"



