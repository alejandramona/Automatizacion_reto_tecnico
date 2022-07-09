package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import userinterface.FormularioLogin;

public class PaginaPrincipal implements Task {
    private FormularioLogin FormularioLogin;

    public static Performable seleccionar() {

        return Tasks.instrumented(PaginaPrincipal.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.browserOn(FormularioLogin),
                Click.on(FormularioLogin.UNETE_HOY)
                );
    }
}