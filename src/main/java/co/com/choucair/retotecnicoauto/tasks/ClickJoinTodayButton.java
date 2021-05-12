package co.com.choucair.retotecnicoauto.tasks;

import co.com.choucair.retotecnicoauto.userinterface.JoinTodayButton;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;


public class ClickJoinTodayButton implements Task {
    public static ClickJoinTodayButton theButton(){
        return Tasks.instrumented(ClickJoinTodayButton.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(JoinTodayButton.REGISTER_BUTTON));
    }
}
