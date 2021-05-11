package co.com.choucair.retotecnicoauto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrationForm {
    public static final Target FIRST_NAME = Target.the("Primer Nombre")
            .located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("Primer Apellido")
            .located(By.id("lastName"));
 /*   public static final Target EMAIL = Target.the("Tu@correo")
            .located(By.id("email"));
    public static final Target FIRST_NAME = Target.the("Primer Nombre")
            .located(By.id("firstName"));
   */
}
