package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.FormularioLogin;

public class LoginTask implements Task {
    private FormularioLogin FormularioLogin;

    public static Performable seleccionar(){

        return Tasks.instrumented(LoginTask.class);
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(FormularioLogin),
                Enter.theValue("SSjprodas@nutresa.com").into(FormularioLogin.USERNAME_INPUT),
                Click.on(FormularioLogin.INICIAR_SESION_BUTTON),
                Enter.theValue("Junio123*").into(FormularioLogin.CONTRASENA_INPUT),
                Click.on(FormularioLogin.INICIAR_SESION_BUTTON),
                Click.on(FormularioLogin.UNETE_HOY)

        );

    }
}
