package co.com.choucair.retotecnicoauto.tasks;

import co.com.choucair.retotecnicoauto.userinterface.uTestPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUpPage implements Task {
    private uTestPage uTest;
    public static OpenUpPage thePage() {
        return Tasks.instrumented(OpenUpPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Open.browserOn(uTest));

    }
}
