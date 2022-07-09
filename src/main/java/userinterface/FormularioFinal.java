package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

@DefaultUrl("https://utest.com/")
public class FormularioFinal extends PageObject {
    public static final Target CONTRASENA = Target.the("ingresar contraseña").located(By.id("password"));
    public static final Target CONFIRMACION_CONTRASENA = Target.the("validar contraseña").located(By.id("confirmPassword"));
    public static final Target CHECKBOX_1 = Target.the("seleccionar checkbox 1").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[4]/label/span"));
    public static final Target CHECKBOX_2 = Target.the("seleccionar checkbox 2").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[5]/label/span[1]"));
    public static final Target CHECKBOX_3 = Target.the("seleccionar checkbox 3").located(By.xpath("//*[@id=\"regs_container\"]/div/div[2]/div/div[2]/div/form/div[6]/label/span[1]"));
    public static final Target BOTON_FINALIZAR = Target.the("boton de configuracion completa").located(By.id("laddaBtn"));

}
