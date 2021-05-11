package co.com.choucair.retotecnicoauto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StepTwoAddYourAddressForm {
    public static final Target lOCATION_CITY = Target.the("Tu ubicacion")
            .located(By.id("city"));
    public static final Target FONSECA_CITY_OPTION = Target.the("Tu ubicacion")
            .located(By.xpath("//span[contains(text(), 'Fonseca, La Guajira')]"));
    public static final Target POSTAL_CODE = Target.the("Codigo Postal")
            .located(By.id("zip"));
    public static final Target NEXT_DEVICES = Target.the("Boton de siguiente Dispositivos")
            .located(By.className("btn-blue"));
}
