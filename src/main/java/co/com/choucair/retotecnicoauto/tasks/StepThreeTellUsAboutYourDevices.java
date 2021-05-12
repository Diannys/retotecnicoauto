package co.com.choucair.retotecnicoauto.tasks;

import co.com.choucair.retotecnicoauto.model.RegistrationModel;
import co.com.choucair.retotecnicoauto.userinterface.StepThreeTellUsAboutYourDevicesForm;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.implementation.bind.annotation.This;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class StepThreeTellUsAboutYourDevices implements Task {
    private RegistrationModel registrationModel;

    public StepThreeTellUsAboutYourDevices(RegistrationModel registrationModel) {
        this.registrationModel = registrationModel;
    }

    public static StepThreeTellUsAboutYourDevices theFormThree(RegistrationModel registrationModel) {
        return Tasks.instrumented(StepThreeTellUsAboutYourDevices.class, registrationModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(StepThreeTellUsAboutYourDevicesForm.YOUR_MOBILE_DEVICE_ICON));
        actor.attemptsTo(Click.on(StepThreeTellUsAboutYourDevicesForm.YOUR_MOBILE_DEVICE_OPTION(registrationModel.getMobileOption())));

        actor.attemptsTo(Click.on(StepThreeTellUsAboutYourDevicesForm.MODEL_ICON));
        actor.attemptsTo(Click.on(StepThreeTellUsAboutYourDevicesForm.MODEL_OPTION(registrationModel.getMobileModel())));

        actor.attemptsTo(Click.on(StepThreeTellUsAboutYourDevicesForm.OPERATING_SYSTEM_ICON));
        actor.attemptsTo(Click.on(StepThreeTellUsAboutYourDevicesForm.OPERATING_SYSTEM_OPTION(registrationModel.getSystemOperative())));

        actor.attemptsTo(Click.on(StepThreeTellUsAboutYourDevicesForm.NEXT_LAST_STEP_BUTTON));
    }
}
