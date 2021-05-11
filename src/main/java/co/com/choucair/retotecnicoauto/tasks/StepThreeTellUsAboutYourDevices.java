package co.com.choucair.retotecnicoauto.tasks;

import co.com.choucair.retotecnicoauto.userinterface.StepThreeTellUsAboutYourDevicesForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class StepThreeTellUsAboutYourDevices implements Task {
    public static StepThreeTellUsAboutYourDevices theFormThree() {
        return Tasks.instrumented(StepThreeTellUsAboutYourDevices.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(StepThreeTellUsAboutYourDevicesForm.YOUR_MOBILE_DEVICE_HUAWEI_OPTION));

        actor.attemptsTo(Click.on(StepThreeTellUsAboutYourDevicesForm.MODEL_ICON));
        actor.attemptsTo(Click.on(StepThreeTellUsAboutYourDevicesForm.MODEL_IPHONE_OPTION));

        actor.attemptsTo(Click.on(StepThreeTellUsAboutYourDevicesForm.OPERATING_SYSTEM_ICON));
        actor.attemptsTo(Click.on(StepThreeTellUsAboutYourDevicesForm.OPERATING_SYSTEM_IOS14_OPTION));

        actor.attemptsTo(Click.on(StepThreeTellUsAboutYourDevicesForm.NEXT_LAST_STEP_BUTTON));

    }
}
