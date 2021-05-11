package co.com.choucair.retotecnicoauto.tasks;

import co.com.choucair.retotecnicoauto.userinterface.StepTwoAddYourAddressForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class StepTwoAddYourAddress implements Task {
    public static StepTwoAddYourAddress theFormTwo() {
        return Tasks.instrumented(StepTwoAddYourAddress.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Fonseca, La Guajira").into(StepTwoAddYourAddressForm.lOCATION_CITY));
        actor.attemptsTo(Click.on(StepTwoAddYourAddressForm.FONSECA_CITY_OPTION));
        actor.attemptsTo(Enter.theValue("0000").into(StepTwoAddYourAddressForm.POSTAL_CODE));
        actor.attemptsTo(Click.on(StepTwoAddYourAddressForm.NEXT_DEVICES));
    }
}
