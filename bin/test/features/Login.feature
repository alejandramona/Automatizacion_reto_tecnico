Feature: ingresar a la página de Utest.com  con la finalidad de crear un nuevo usuario.
  Scenario:crear un nuevo usuario
    Given El usuario se encuentra en la pagina de Utest
    When El usuario se dirige a unete hoy y llena los campos basicos
    Then Valida que los datos existan y se haya registrado correctamente