package co.com.choucair.certification.utest.tasks;


import co.com.choucair.certification.utest.userinterface.UtestFourthPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class StepFourth implements Task {

    public static StepFourth OnThePage() {
        return Tasks.instrumented(StepFourth.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            for (int i = 0; i < 2; i++) {
                Thread.sleep(1000);
                actor.attemptsTo(Enter.keyValues("JuanCarvajal1999*").into(UtestFourthPage.INPUT_PASSWORD),
                        Enter.keyValues("JuanCarvajal1999*").into(UtestFourthPage.INPUT_PASSWORD_CONFIRM),
                        Click.on(UtestFourthPage.CHECK_TERMS_USE),
                        Click.on(UtestFourthPage.CHECK_PRIVATE_SECURITY),
                        Click.on(UtestFourthPage.COMPLETE_PAGE_BUTTON)
                );
            }
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
