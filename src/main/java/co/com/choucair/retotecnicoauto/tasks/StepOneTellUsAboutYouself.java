package co.com.choucair.retotecnicoauto.tasks;

import co.com.choucair.retotecnicoauto.model.RegistrationModel;
import co.com.choucair.retotecnicoauto.userinterface.StepOneTellUsAboutYourselfForm;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.SelectFromOptions;

public class StepOneTellUsAboutYouself implements Task {
    public RegistrationModel registrationModel;

    public StepOneTellUsAboutYouself(RegistrationModel registrationModel) {
       this.registrationModel = registrationModel;
    }

    public static StepOneTellUsAboutYouself theForm(RegistrationModel registrationModel) {
        return Tasks.instrumented(StepOneTellUsAboutYouself.class, registrationModel);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.theValue(registrationModel.getFirstName()).into(StepOneTellUsAboutYourselfForm.FIRST_NAME));
        actor.attemptsTo(Enter.theValue(registrationModel.getLastName()).into(StepOneTellUsAboutYourselfForm.LAST_NAME));
        actor.attemptsTo(Enter.theValue(registrationModel.getEmail()).into(StepOneTellUsAboutYourselfForm.YOUR_EMAIL));
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(registrationModel.getBirthMonth()).from(StepOneTellUsAboutYourselfForm.BIRTH_MONTH)
        );
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(registrationModel.getBirthDay()).from(StepOneTellUsAboutYourselfForm.BIRTH_DAY)
        );
        actor.attemptsTo(
                SelectFromOptions.byVisibleText(registrationModel.getBirthYear()).from(StepOneTellUsAboutYourselfForm.BIRTH_YEAR)
        );
        actor.attemptsTo(Click.on(NextButton.NEXT_LOCATION_BUTTON));

    }
}
