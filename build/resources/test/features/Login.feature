Feature: ingresar a la página de Utest.com  con la finalidad de crear un nuevo usuario.
  Scenario:crear un nuevo usuario en Utest
    Given El usuario se encuentra en la pagina de Utest
    When El usuario se dirige a unete hoy y llena los campos basicos
    Then Valida que los datos estan correctos y se presiona el boton de configuracion completa