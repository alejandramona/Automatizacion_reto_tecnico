package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Hit;
import org.openqa.selenium.Keys;
import userinterface.FormularioDispositivos;

public class FormularioDispositivosTask implements Task {
    private FormularioDispositivos FormularioDispositivos;

    public static Performable seleccionar() {

        return Tasks.instrumented(FormularioDispositivosTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(FormularioDispositivos.CONTENEDOR_COMPUTADOR),
                Enter.theValue("Windows").into(FormularioDispositivos.COMPUTADOR).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(FormularioDispositivos.CONTENEDOR_VERSION),
                Enter.theValue("10").into(FormularioDispositivos.VERSION).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(FormularioDispositivos.CONTENEDOR_LENGUAJE),
                Enter.theValue("Spanish").into(FormularioDispositivos.LENGUAJE).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(FormularioDispositivos.CONTENEDOR_CELULAR),
                Enter.theValue("Apple").into(FormularioDispositivos.CELULAR).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(FormularioDispositivos.CONTENEDOR_MODELO),
                Enter.theValue("iPhone 6 Plus").into(FormularioDispositivos.MODELO).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(FormularioDispositivos.CONTENEDOR_SYSTEMA_OPERATIVO),
                Enter.theValue("iOS 8.1").into(FormularioDispositivos.SYSTEMA_OPERATIVO).thenHit(Keys.ARROW_DOWN,Keys.ENTER),
                Click.on(FormularioDispositivos.BOTON_SIGUIENTE)
                );
    }
}