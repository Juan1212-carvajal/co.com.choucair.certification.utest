package co.com.choucair.certification.utest.tasks;


import co.com.choucair.certification.utest.userinterface.UtestFourthStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class StepFourth implements Task {

    private String strPassword;
    private String strPasswordConfirmed;

    public StepFourth(String strPassword, String strPasswordConfirmed) {
        this.strPassword = strPassword;
        this.strPasswordConfirmed = strPasswordConfirmed;
    }
    public static StepFourth OnThePage(String strPassword, String strPasswordConfirmed) {
        return Tasks.instrumented(StepFourth.class,strPassword,strPasswordConfirmed );
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        try {
            for (int i = 0; i < 2; i++) {
                Thread.sleep(1000);
                actor.attemptsTo(Enter.keyValues(strPassword).into(UtestFourthStepPage.INPUT_PASSWORD),
                        Enter.keyValues(strPasswordConfirmed).into(UtestFourthStepPage.INPUT_PASSWORD_CONFIRM),
                        Click.on(UtestFourthStepPage.CHECK_TERMS_USE),
                        Click.on(UtestFourthStepPage.CHECK_PRIVATE_SECURITY),
                        Click.on(UtestFourthStepPage.COMPLETE_PAGE_BUTTON)
                );
            }
        } catch (Exception e) {
            System.out.println(e);
        }


    }
}
