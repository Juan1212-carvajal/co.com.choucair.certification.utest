package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.UtestFirstStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class StepFirts implements Task {

    private String strFirstName;
    private String strLastName;
    private String strEmail;

    public StepFirts(String strFirstName, String strLastName, String strEmail) {
        this.strFirstName = strFirstName;
        this.strLastName = strLastName;
        this.strEmail = strEmail;
    }


    public static StepFirts OnThePage(String strFirstName, String strLastName, String strEmail) {
        return Tasks.instrumented(StepFirts.class,strFirstName,strLastName,strEmail);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Enter.keyValues(strFirstName).into(UtestFirstStepPage.INPUT_FIRST_NAME),
                Enter.keyValues(strLastName).into(UtestFirstStepPage.INPUT_LAST_NAME),
                Enter.theValue(strEmail).into(UtestFirstStepPage.INPUT_EMAIL),
                Click.on(UtestFirstStepPage.OPTION_MONTH_BIRTH),
                Click.on(UtestFirstStepPage.OPTION_DAY_BIRTH),
                Click.on(UtestFirstStepPage.OPTION_YEAR_BIRTH),
                Click.on(UtestFirstStepPage.NEXT_PAGE_BUTTON)
        );


    }
}
