package userinterface;

import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;
@DefaultUrl("https://utest.com/")
public class FormularioLogin extends PageObject {
    public static final Target USERNAME_INPUT = Target.the("campo nombre usuario").located(By.id("username_input"));
    public static final Target INICIAR_SESION_BUTTON = Target.the("boton de iniciar sesion").located(By.xpath("//input[@type='submit']"));
    public static final Target CONTRASENA_INPUT = Target.the("campo contraseña usuario").located(By.xpath("//input[@name='passsfc']"));
    public static final Target UNETE_HOY = Target.the("boton unete hoy").located(By.className("unauthenticated-nav-bar__sign-up"));
}
