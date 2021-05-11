package co.com.choucair.retotecnicoauto.tasks;

import co.com.choucair.retotecnicoauto.userinterface.NextButton;
import co.com.choucair.retotecnicoauto.userinterface.StepOneTellUsAboutYourselfForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class FillOutForm implements Task {
    public static FillOutForm theForm() {
        return Tasks.instrumented(FillOutForm.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue("Diannys").into(StepOneTellUsAboutYourselfForm.FIRST_NAME));
        actor.attemptsTo(Enter.theValue("Granadillo").into(StepOneTellUsAboutYourselfForm.LAST_NAME));
        actor.attemptsTo(Enter.theValue("ddgranadillo@gmail.com").into(StepOneTellUsAboutYourselfForm.YOUR_EMAIL));
        actor.attemptsTo(
                SelectFromOptions.byVisibleText("August").from(StepOneTellUsAboutYourselfForm.BIRTH_MONTH)
        );
        actor.attemptsTo(
                SelectFromOptions.byVisibleText("31").from(StepOneTellUsAboutYourselfForm.BIRTH_DAY)
        );
        actor.attemptsTo(
                SelectFromOptions.byVisibleText("1994").from(StepOneTellUsAboutYourselfForm.BIRTH_YEAR)
        );
        actor.attemptsTo(Click.on(NextButton.NEXT_LOCATION_BUTTON));

    }
}
