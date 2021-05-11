package co.com.choucair.retotecnicoauto.stepdefinitions;

import co.com.choucair.retotecnicoauto.tasks.ClickJoinToday;
import co.com.choucair.retotecnicoauto.tasks.OpenUp;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.fluentlenium.core.search.Search;

public class RetoTecnicoAuto {
    @Before
    public void setStage(){
        OnStage.setTheStage(new OnlineCast());
    }

    @Given("^Than Nany wants to register in uTest")
    public void ThanNanyWantsToRegisterInUTest() {

        OnStage.theActor("Nany").wasAbleTo(OpenUp.thePage());
    }

    @When("^she search for the Join Today button on the uTest page and fill in all the requested fields")
    public void sheSearchForTheJoinTodayButtonOnTheUTestPageAndFillInAllTheRequestedFields() {
        OnStage.theActor("Nany").wasAbleTo(ClickJoinToday.theButton());

    }

    @Then("she manager to register")
    public void sheManagerToRegister()  {

    }
}
