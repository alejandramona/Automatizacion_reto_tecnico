package tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;
import userinterface.FormularioInfoPersonal;

public class FormularioInfoPersonalTask implements Task {
    private static FormularioInfoPersonal FormularioInfoPersonal;

    public static FormularioInfoPersonalTask seleccionar() {

        return Tasks.instrumented(FormularioInfoPersonalTask.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue("Alejandra ").into(FormularioInfoPersonal.NOMBRE_INPUT),
                Enter.theValue("Mona Rivera").into(FormularioInfoPersonal.APELLIDO_INPUT),
                Enter.theValue("alejandra.mona117@pascualbravo.edu.co").into(FormularioInfoPersonal.CORREO_ELECTRONICO),
                SelectFromOptions.byVisibleText("February").from(FormularioInfoPersonal.MES_NACIMIENTO),
                SelectFromOptions.byVisibleText("26").from(FormularioInfoPersonal.DIA_NACIMIENTO),
                SelectFromOptions.byValue("number:2002").from(FormularioInfoPersonal.AÑO_NACIMIENTO),
                Click.on(FormularioInfoPersonal.BOTON_SIGUIENTE)
        );
    }
}