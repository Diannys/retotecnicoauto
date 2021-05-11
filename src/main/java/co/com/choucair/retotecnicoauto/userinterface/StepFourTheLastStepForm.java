package co.com.choucair.retotecnicoauto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StepFourTheLastStepForm {
    public static final Target CREATE_YOUR_PASSWORD = Target.the("Crea tu contraseña")
            .located(By.id("password"));
    public static final Target CONFIRM_PASSWORD = Target.the("Confirma tu contraseña")
            .located(By.id("confirmPassword"));
    public static final Target TERM_OF_USER_CHECK = Target.the("Confirmar terminos de usuario")
            .located(By.id("termOfUse"));
    public static final Target PRIVACY_SECURITY_POLICY_CHECK = Target.the("Confirmar terminos de usuario")
            .located(By.id("privacySetting"));
    public static final Target COMPLETE_SETUP_BUTTON = Target.the("Configuracion completa")
            .located(By.className("btn-blue"));

}
