package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.UtestSecondStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class StepSecond implements Task {

    public static StepSecond OnThePage() {
        return Tasks.instrumented(StepSecond.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(UtestSecondStepPage.NEXT_BUTTON));
    }
}
