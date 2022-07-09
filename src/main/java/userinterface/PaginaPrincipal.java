package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")
public class PaginaPrincipal extends PageObject {
    public static final Target UNETE_HOY = Target.the("boton unete hoy").located(By.className("unauthenticated-nav-bar__sign-up"));
}
