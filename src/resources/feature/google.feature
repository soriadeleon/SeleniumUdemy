Feature:  probar la busqueda en Google

  Scenario: buscar en Google

    Given dado que estoy en Google
    When  realizo una busqueda
    And   click en Buscar
    Then  obtengo los resultados