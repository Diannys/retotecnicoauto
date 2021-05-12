package co.com.choucair.retotecnicoauto.tasks;

import co.com.choucair.retotecnicoauto.model.RegistrationModel;
import co.com.choucair.retotecnicoauto.userinterface.StepTwoAddYourAddressForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class StepTwoAddYourAddress implements Task {
    public RegistrationModel registrationModel;

    public StepTwoAddYourAddress(RegistrationModel registrationModel) {
        this.registrationModel = registrationModel;
    }

    public static StepTwoAddYourAddress theFormTwo(RegistrationModel registrationModel) {

        return Tasks.instrumented(StepTwoAddYourAddress.class, registrationModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(registrationModel.getCityLocation()).into(StepTwoAddYourAddressForm.LOCATION_CITY));
        actor.attemptsTo(Click.on(StepTwoAddYourAddressForm.FONSECA_CITY_OPTION));
        actor.attemptsTo(Enter.theValue(registrationModel.getPostalCode()).into(StepTwoAddYourAddressForm.POSTAL_CODE));
        actor.attemptsTo(Click.on(StepTwoAddYourAddressForm.NEXT_DEVICES));
    }
}
