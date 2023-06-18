# new feature
# Tags: optional

Feature: Parabank Test Cases

  Scenario: TC0001 Login Failure Test Case
    Given Browser da url aç
    When Username doldur: "test123"
    And Parola alanını doldur: "test"
    And Login buttonuna tıklanır
    Then Error Kontrolu: "An internal error has occurred and has been logged."

  Scenario: TC0002 Login Test Case
    Given Browser da url aç
    When Username doldur: "test"
    And Parola alanını doldur: "test123"
    And Login buttonuna tıklanır
    Then Error Kontrolu: "An internal error has occurred and has been logged."

  Scenario: TC0003 Register Test Cases
    Given Browser da url aç
    When "Register" alanına tıklanır
    And "Username" alanına metin girisi saglanir: "testqaudemig"
    And "LastName" alanına metin girisi saglanir: "test"
    And "Adress" alanına metin girisi saglanir: "test sokak test mahallesi udemig binası"
    And "City" alanına metin girisi saglanir: "Istanbul"
    And "State" alanına metin girisi saglanir: "TestQA"
    And "ZipCode" alanına metin girisi saglanir: "34000"

  Scenario: TC0004 Register Test Cases
    Given Browser da url aç
    When Username doldur: "test"
    And Parola alanını doldur: "test123"
    When "Register" alanına tıklanır
    And "Username" alanına metin girisi saglanir: "testqaudemig"
    And "LastName" alanına metin girisi saglanir: "test"
    And "Adress" alanına metin girisi saglanir: "test sokak test mahallesi udemig binası"
    And "City" alanına metin girisi saglanir: "Istanbul"
    And "State" alanına metin girisi saglanir: "TestQA"
    And "ZipCode" alanına metin girisi saglanir: "34000"
    And "registerBtnRegister" alanına tıklanır