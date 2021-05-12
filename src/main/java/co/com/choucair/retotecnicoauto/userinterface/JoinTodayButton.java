package co.com.choucair.retotecnicoauto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class JoinTodayButton {
    public static final Target REGISTER_BUTTON = Target.the("Boton de registro")
            .located(By.xpath("//a[contains(text(),'Join Today')]"));
}
