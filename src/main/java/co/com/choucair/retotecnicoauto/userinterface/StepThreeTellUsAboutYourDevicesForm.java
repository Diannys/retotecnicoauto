package co.com.choucair.retotecnicoauto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StepThreeTellUsAboutYourDevicesForm {
    public static final Target YOUR_MOBILE_DEVICE = Target.the("Tu dispositivo mobil")
            .located(By.name("handsetMakerId"));
    public static final Target MODEL = Target.the("Modelo del dispositivo")
            .located(By.name("handsetModelId"));
    public static final Target OPERATING_SYSTEM = Target.the("Sistema aperativo")
            .located(By.name("handsetOSId"));
    public static final Target NEXT_LAST_STEP_BUTTON = Target.the("Boton de siguiente Dispositivos")
            .located(By.className("btn-blue"));

}
