package co.com.choucair.retotecnicoauto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class NextButton {
    public static final Target NEXT_LOCATION_BUTTON = Target.the("Boton de siguiente localizacion")
            .located(By.xpath("//span[contains(text(),'Next: Location')]"));
}
