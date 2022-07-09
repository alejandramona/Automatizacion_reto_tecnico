package definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import tasks.*;

public class LoginDefinicion {
    @Before
    public void setStage(){

        OnStage.setTheStage(new OnlineCast());
    }
    @Given("El usuario se encuentra en la pagina de Utest")
    public void elUsuarioSeEncuentraEnLaPaginaDeUtest() {
    OnStage.theActorCalled("cliente").attemptsTo(PaginaPrincipal.seleccionar());

    }
    @When("El usuario se dirige a unete hoy y llena los campos basicos")
    public void elUsuarioSeDirigeAUneteHoyYLlenaLosCamposbasicos()  {
        OnStage.theActorInTheSpotlight().attemptsTo(FormularioInfoPersonalTask.seleccionar());
        OnStage.theActorInTheSpotlight().attemptsTo(UbicacionTask.seleccionar());
        OnStage.theActorInTheSpotlight().attemptsTo(FormularioDispositivosTask.seleccionar());

    }
    @Then("Valida que los datos estan correctos y se presiona el boton de configuracion completa")
    public void validaQueLosDatosEstanCorrectosYSePresionaElBotonDeConfiguracionCompleta()  throws InterruptedException {
        OnStage.theActorInTheSpotlight().attemptsTo(FormularioFinalTask.seleccionar());
    }
}
