
Feature: Регистрация на потребител

  Scenario Outline: Регистрация на потребител
    Given Потребителя отваря екрана за регистрация
    When Въведе потребителско име "<username>"
    And Въведе парола "<password>"
    And Въведе паролата повторно "<password2>"
    And Въведе електронна поща "<email>"
    And Натиска бутона за регистрация
    Then Вижда съобщение "<expectedMessage>"

    Examples: 
      | username | password | password | email | expectedMessage |
      | Ivan     | 123456   | 123456   | a@a.bg| Успешна регистрация |
      | Ivan     | 123456   | 123456   | 			 | Въведете Email |
      | 	       | 123456   | 123456   | a@a.bg| Въведете име |      
      | Ivan     | 			    |  			   | a@a.bg| Въведете парола |
