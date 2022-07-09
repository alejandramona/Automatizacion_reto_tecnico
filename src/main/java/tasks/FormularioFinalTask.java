package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.FormularioFinal;

public class FormularioFinalTask implements Task {
    private static FormularioFinal FormularioFinal;

    public static FormularioFinalTask seleccionar() {

        return Tasks.instrumented(FormularioFinalTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("1001419117.Am").into(FormularioFinal.CONTRASENA),
                Enter.theValue("1001419117.Am").into(FormularioFinal.CONFIRMACION_CONTRASENA),
                Click.on(FormularioFinal.CHECKBOX_1),
                Click.on(FormularioFinal.CHECKBOX_2),
                Click.on(FormularioFinal.CHECKBOX_3),
                Click.on(FormularioFinal.BOTON_FINALIZAR)
                );
    }
}