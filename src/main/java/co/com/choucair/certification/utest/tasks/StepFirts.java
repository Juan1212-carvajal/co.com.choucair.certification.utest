package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.UtestFirstStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class StepFirts implements Task {

    public static StepFirts OnThePage() {
        return Tasks.instrumented(StepFirts.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.keyValues("Juan").into(UtestFirstStepPage.INPUT_FIRST_NAME),
                Enter.keyValues("Carvajal").into(UtestFirstStepPage.INPUT_LAST_NAME),
                Enter.theValue("feslipe@gmail.com").into(UtestFirstStepPage.INPUT_EMAIL),
                Click.on(UtestFirstStepPage.OPTION_MONTH_BIRTH),
                Click.on(UtestFirstStepPage.OPTION_DAY_BIRTH),
                Click.on(UtestFirstStepPage.OPTION_YEAR_BIRTH),
                Click.on(UtestFirstStepPage.NEXT_PAGE_BUTTON)
        );


    }
}
