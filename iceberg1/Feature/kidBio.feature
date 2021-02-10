
Feature: Добавяне на информация за детето

  Scenario Outline: Добавяне на валидна информация за детето
    Given Потребителят отваря екрана за информация на своето дете
    When Въвежда име на детето "<name>" 
    And Въвежда възраст на детето"<age>"
    And Въвежда дали има заболавания на детето "<disable>"
    And Въвежда дали детето има близнак"<twins>"
    And Въвежда дали детето има брат/сестра "<sublins>"
    And Натиска бутона за въвеждате
    Then Вижда съобщение  "<expectedMessage>"

    Examples: 
      | name  | age | disable  | twins | twins | expectedMessage |
      | Иван  |   5 | false    | false | false | Успешно въведени данни |
      | 		  |   5 | false    | false | false | Въведи име на детето |
      | Иван  |     | false    | false | false | Въведи години на детето |
      
