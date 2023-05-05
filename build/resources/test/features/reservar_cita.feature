# Autor:Leidy Vanesa Fernandez

@stories
Feature: Realizar reserva de cita
  Yo como usuario del sitio web Servicios de salud CURA
  quiero reservar uan cita medica
  para un chequeo medico

  Background:
    Given Vanesa esta en la pagina de inicio de Servicios de salud CURA

  @scenario1
  Scenario: Automatizacion de reserva cita medica con exito
    Given Vanesa haga click en el boton Reserva cita medica
    When Ella inicia sesion con John Doe y ThisIsNotAPassword
    And Ella registre los siguientes datos de la reserva

      | atrCentroSalud                  | atrReadmision | atrDiaCita | atrProgramaSalud | atrComentario                |
      | Hongkong CURA Healthcare Center | true          | 30/04/2023 | Medicaid         | Cita medica de chequeo anual |
    Then deberia ver un mensaje con el resumen y confirmacion de la cita medica


