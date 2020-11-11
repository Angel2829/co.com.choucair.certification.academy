package co.com.choucair.certification.academy.stepdefinitions;
import co.com.choucair.certification.academy.questions.Answer;
import co.com.choucair.certification.academy.tasks.Login;
import co.com.choucair.certification.academy.tasks.OpenUP;
import co.com.choucair.certification.academy.tasks.Search;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class ChoucairAcademyStepDefinitions {
@Before
public void setStage(){
    OnStage.setTheStage(new OnlineCast());
    }
    @Given("^than brandon wants to learn automation at the academy Choucair$")
    public void thanBrandonWantsToLearnAutomationAtTheAcademyChoucair(){
    OnStage.theActorCalled( "Brandon").wasAbleTo(OpenUP.thePage(),(Login.onThePage()));
    }
    @When("^he search for the course (.*) on the choucar academy platform$")
    public void heSearchForTheCourseRecurosAutomatizaciónBancolombiaOnTheChoucarAcademyPlatform(String course){
    OnStage.theActorInTheSpotlight().attemptsTo(Search.the(course));
    }
    @Then("^he finds the course called resources (.*)$")
    public void heFindsTheCourseCalledResourcesRecursosAutomatizacionBancolombia( String question){
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(Answer.toThe(question)));

    }
}
