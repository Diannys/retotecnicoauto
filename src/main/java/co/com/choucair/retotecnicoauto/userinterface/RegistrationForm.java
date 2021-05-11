package co.com.choucair.retotecnicoauto.userinterface;

import net.serenitybdd.screenplay.actions.SelectFromOptions;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class RegistrationForm {
    public static final Target FIRST_NAME = Target.the("Primer Nombre")
            .located(By.id("firstName"));
    public static final Target LAST_NAME = Target.the("Primer Apellido")
            .located(By.id("lastName"));
   public static final Target YOUR_EMAIL = Target.the("Tu@correo")
            .located(By.id("email"));
   public static final Target BIRTH_MONTH = Target.the("Mes de nacimiento")
           .located(By.id("birthMonth"));
    public static final Target BIRTH_DAY = Target.the("Dia de nacimiento")
            .located(By.id("birthDay"));
    public static final Target BIRTH_YEAR = Target.the("Año de nacimiento")
            .located(By.id("birthYear"));
    }


