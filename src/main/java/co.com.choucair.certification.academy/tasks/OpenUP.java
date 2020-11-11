package co.com.choucair.certification.academy.tasks;

import co.com.choucair.certification.academy.userinterface.ChoucairAcademyPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Open;

public class OpenUP implements Task {
    private ChoucairAcademyPage choucairAcademyPage;
    public static OpenUP thePage() {
        return Tasks.instrumented(OpenUP.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
    actor.attemptsTo(Open.browserOn(choucairAcademyPage));
    }
}
