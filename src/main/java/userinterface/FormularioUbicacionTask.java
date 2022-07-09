package userinterface;

import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.By;

public class FormularioUbicacionTask extends PageObject {
    public static final Target CIUDAD = Target.the("seleccionar ciudad").located(By.id("city"));
    public static final Target CODIGO_POSTAL = Target.the("seleccionar codigo postal").located(By.id("zip"));
    public static final Target CONTENEDOR_PAIS = Target.the("contenedor pais").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div"));
    public static final Target PAIS = Target.the("seleccionar pais").located(By.xpath("/html/body/ui-view/main/section/div/div[2]/div/div[2]/div/form/div[1]/div[3]/div[1]/div[4]/div[2]/div/div/input[1]"));
    public static final Target BOTON_SIGUIENTE = Target.the("boton siguiente").located(By.xpath("//a[@class='btn btn-blue pull-right']"));

}
