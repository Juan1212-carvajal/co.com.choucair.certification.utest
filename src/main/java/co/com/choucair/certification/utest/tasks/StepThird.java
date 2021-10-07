package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.UtestThirdStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class StepThird implements Task {

    public static StepThird OnThePage() {
        return Tasks.instrumented(StepThird.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            for (int i = 0; i < 2; i++) {
                Thread.sleep(1000);
                actor.attemptsTo(Click.on(UtestThirdStepPage.NEXT_BUTTON));

            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
