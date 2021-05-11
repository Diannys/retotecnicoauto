package co.com.choucair.retotecnicoauto.tasks;

import co.com.choucair.retotecnicoauto.userinterface.JoinButton;
import co.com.choucair.retotecnicoauto.userinterface.NextButton;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickNextLocation implements Task {
    public static ClickNextLocation nextButton(){
        return Tasks.instrumented(ClickNextLocation.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(NextButton.NEXT_LOCATION_BUTTON));

    }
}
