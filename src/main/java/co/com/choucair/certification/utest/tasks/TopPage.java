package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.UtestFirstStepPage;
import co.com.choucair.certification.utest.userinterface.UtestThirdStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class TopPage implements Task {

    public static TopPage ThePage() {
        return Tasks.instrumented(TopPage.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) { actor.attemptsTo(Click.on(UtestFirstStepPage.JOIN_TODAY_BUTTON)); }
}