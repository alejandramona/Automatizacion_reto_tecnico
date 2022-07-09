package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import org.openqa.selenium.Keys;
import userinterface.FormularioUbicacionTask;

public class UbicacionTask implements Task {
    private FormularioUbicacionTask FormularioUbicacionTask;

    public static Performable seleccionar() {

        return Tasks.instrumented(UbicacionTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Medellín").into(FormularioUbicacionTask.CIUDAD).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Enter.theValue("050043").into(FormularioUbicacionTask.CODIGO_POSTAL),
                Click.on(FormularioUbicacionTask.CONTENEDOR_PAIS),
                Enter.theValue("Colombia").into(FormularioUbicacionTask.PAIS).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(FormularioUbicacionTask.BOTON_SIGUIENTE)

                );
    }
}