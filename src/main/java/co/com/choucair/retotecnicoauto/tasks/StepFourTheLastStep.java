package co.com.choucair.retotecnicoauto.tasks;

import co.com.choucair.retotecnicoauto.userinterface.StepFourTheLastStepForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class StepFourTheLastStep implements Task {
    public static StepFourTheLastStep theFormFour() {
        return Tasks.instrumented(StepFourTheLastStep.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Contraseña12345").into(StepFourTheLastStepForm.CREATE_YOUR_PASSWORD));
        actor.attemptsTo(Enter.theValue("Contraseña12345").into(StepFourTheLastStepForm.CONFIRM_PASSWORD));
        actor.attemptsTo(Click.on(StepFourTheLastStepForm.TERM_OF_USER_CHECK));
        actor.attemptsTo(Click.on(StepFourTheLastStepForm.PRIVACY_SECURITY_POLICY_CHECK));
        actor.attemptsTo(Click.on(StepFourTheLastStepForm.COMPLETE_SETUP_BUTTON));
    }
}