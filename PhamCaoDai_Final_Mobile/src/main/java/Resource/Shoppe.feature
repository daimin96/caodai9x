Feature: testing shoppe

  Background:
    Given open shoppe app

  @shoppiness_TC_01
  Scenario: Verify Home Screen
    Given Click to Bat dau trai nghiem
    When I click to Deny
    Then The Home screen should displayed
    And The menu footer should displayed

  @shoppiness_TC_02
  Scenario: Verify Thuong Hieu screen
    Given I am in Home Screen
    And Click to Mua sam Online
    When I click to Thuong Hieu
    Then The screen should be displayed 9 branch name

  @shoppiness_TC_03
  Scenario: Verify Uu Dai screen
    Given I am in Home Screen
    And Click to Mua sam Online
    When I click to Uu Dai
    And Click to the first item
    Then The screen should be displayed with some item

  @shoppiness_TC_04
  Scenario: Verify Voucher screen
    Given I am in Home Screen
    And Click to Mua sam Online
    When I click to Voucher
    And Swipe and click to the last Voucher
    Then The screen should be displayed with some 4 item

  @shoppiness_TC_05
  Scenario: Verify Ca nhan screen
    Given I am in Home Screen
    When I click to Ca nhan
    Then The screen should be displayed with 4 tab