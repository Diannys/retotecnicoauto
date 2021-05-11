package co.com.choucair.retotecnicoauto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrationForm {
    public static final Target FIRST_NAME = Target.the("Primer Nombre")
            .located(By.id("firstName"));
}
