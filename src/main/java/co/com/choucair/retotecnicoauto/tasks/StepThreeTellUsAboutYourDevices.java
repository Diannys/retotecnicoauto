package co.com.choucair.retotecnicoauto.tasks;

import co.com.choucair.retotecnicoauto.userinterface.RegistrationForm;
import co.com.choucair.retotecnicoauto.userinterface.StepThreeTellUsAboutYourDevicesForm;
import co.com.choucair.retotecnicoauto.userinterface.StepTwoAddYourAddressForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class StepThreeTellUsAboutYourDevices implements Task {
    public static StepThreeTellUsAboutYourDevices theFormThree() {
        return Tasks.instrumented(StepThreeTellUsAboutYourDevices.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SelectFromOptions.byVisibleText("LG").from(StepThreeTellUsAboutYourDevicesForm.YOUR_MOBILE_DEVICE));
        actor.attemptsTo(SelectFromOptions.byVisibleText("LG").from(StepThreeTellUsAboutYourDevicesForm.MODEL));
        actor.attemptsTo(SelectFromOptions.byVisibleText("LG").from(StepThreeTellUsAboutYourDevicesForm.OPERATING_SYSTEM));
        actor.attemptsTo(Click.on(StepThreeTellUsAboutYourDevicesForm.NEXT_LAST_STEP_BUTTON));
    }
}
