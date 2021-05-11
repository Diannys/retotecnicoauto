package co.com.choucair.retotecnicoauto.tasks;

import co.com.choucair.retotecnicoauto.model.RegistrationModel;
import co.com.choucair.retotecnicoauto.userinterface.RegistrationForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.EnterValue;

public class FillOutForm implements Task {
    public static FillOutForm theForm() {
        return Tasks.instrumented(FillOutForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("llenar campo de nombre").into(RegistrationForm.FIRST_NAME));
        actor.attemptsTo(Enter.theValue("Escribe apellido").into(RegistrationForm.LAST_NAME));
        actor.attemptsTo(Enter.theValue("dd@gmail.co").into(RegistrationForm.YOUR_EMAIL));
    //    actor.attemptsTo(Enter.theValue("August").into(RegistrationForm.BIRTH_MONTH));

    }
}