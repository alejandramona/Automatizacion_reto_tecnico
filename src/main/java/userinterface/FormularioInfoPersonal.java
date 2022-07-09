package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")
public class FormularioInfoPersonal extends PageObject {
    public static final Target NOMBRE_INPUT= Target.the("campo nombre usuario").located(By.id("firstName"));
    public static final Target APELLIDO_INPUT = Target.the("campo apellido usuario").located(By.id("lastName"));
    public static final Target CORREO_ELECTRONICO = Target.the("campo correo electronico").located(By.id("email"));
    public static final Target MES_NACIMIENTO = Target.the("campo mes de nacimiento").located(By.id("birthMonth"));
    public static final Target AÑO_NACIMIENTO = Target.the("campo año de nacimiento").located(By.id("birthYear"));
    public static final Target DIA_NACIMIENTO = Target.the("campo dia de nacimiento").located(By.id("birthDay"));
    public static final Target BOTON_SIGUIENTE = Target.the("boton siguiente").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[2]/a"));


}
