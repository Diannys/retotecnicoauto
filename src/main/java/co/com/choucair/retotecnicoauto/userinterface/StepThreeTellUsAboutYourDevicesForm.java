package co.com.choucair.retotecnicoauto.userinterface;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class StepThreeTellUsAboutYourDevicesForm {
    public static final Target YOUR_MOBILE_DEVICE_ICON = Target.the("Tu dispositivo mobil")
            .located(By.cssSelector("div[name=handsetMakerId] i.caret"));
    public static final Target YOUR_MOBILE_DEVICE_HUAWEI_OPTION = Target.the("Tu dispositivo mobil")
            .located(By.xpath("//div[contains(text(), 'Apple')]"));
    public static final Target MODEL_ICON = Target.the("Modelo del dispositivo")
            .located(By.cssSelector("div[name=handsetModelId] i.caret"));
    public static final Target MODEL_IPHONE_OPTION = Target.the("Tu dispositivo mobil")
            .located(By.xpath("//div[contains(text(), 'iPhone')]"));
    public static final Target OPERATING_SYSTEM_ICON = Target.the("Sistema aperativo")
            .located(By.cssSelector("div[name=handsetOSId] i.caret"));
    public static final Target OPERATING_SYSTEM_IOS14_OPTION = Target.the("Tu dispositivo mobil")
            .located(By.xpath("//div[contains(text(), 'iOS 14')]"));
    public static final Target NEXT_LAST_STEP_BUTTON = Target.the("Boton de siguiente Dispositivos")
            .located(By.className("btn-blue"));



}
