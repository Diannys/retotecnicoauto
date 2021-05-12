package co.com.choucair.retotecnicoauto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StepThreeTellUsAboutYourDevicesForm {
    public static final Target YOUR_MOBILE_DEVICE_ICON = Target.the("Tu dispositivo mobil")
            .located(By.cssSelector("div[name=handsetMakerId] i.caret"));

    public static final Target MODEL_ICON = Target.the("Modelo del dispositivo")
            .located(By.cssSelector("div[name=handsetModelId] i.caret"));

    public static final Target OPERATING_SYSTEM_ICON = Target.the("Sistema aperativo")
            .located(By.cssSelector("div[name=handsetOSId] i.caret"));

    public static final Target NEXT_LAST_STEP_BUTTON = Target.the("Boton de siguiente Dispositivos")
            .located(By.className("btn-blue"));


    public static final Target YOUR_MOBILE_DEVICE_OPTION (String optionText){
        return Target.the("Opciones de dispositivos").located(By.xpath("//div[contains(text(),'" + optionText + "')]"));
    }
    public static final Target MODEL_OPTION (String optionText){
        return Target.the("Opciones de modelo de dispositivo").located(By.xpath("//div[contains(text(),'" + optionText + "')]"));
    }
    public static final Target OPERATING_SYSTEM_OPTION  (String optionText){
        return Target.the("Opciones de sistema operativo del dispositivo").located(By.xpath("//div[contains(text(),'" + optionText + "')]"));
    }


}
