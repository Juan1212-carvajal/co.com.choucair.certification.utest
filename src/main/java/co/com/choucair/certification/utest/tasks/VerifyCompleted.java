package co.com.choucair.certification.utest.tasks;

import co.com.choucair.certification.utest.userinterface.UtestfifthStepPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class VerifyCompleted implements Question<Boolean> {
    private String question;

    public VerifyCompleted(String question) {
        this.question = question;
    }

    public static VerifyCompleted toThe(String question) {
        return new VerifyCompleted(question);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String textSuccessful = Text.of(UtestfifthStepPage.COMPLETE_PAGE_REGISTRATION).viewedBy(actor).asString();
        if (question.equals(textSuccessful)) {
            result = true;
        } else {
            result = false;
        }
        return result;
    }
}
