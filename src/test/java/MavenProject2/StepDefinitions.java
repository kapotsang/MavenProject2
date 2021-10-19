package MavenProject2;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;

    class WhatGenre {
        static String whatGenre(String Fiction) {
            return "Dystopian".equals(Fiction) ? "Yes" : "No";
        }
    }

    public class StepDefinitions {
        private String Fiction;
        private String actualAnswer;

        @Given("Fiction is Horror")
        public void book_is_Horror() {
            Fiction = "Horror";
        }

        @Given("Fiction is Dystopian")
        public void book_is_Dystopian() {
            Fiction = "Dystopian";
        }

        @When("I ask whether it's Dystopian")
        public void i_ask_if_Dystopian() {
            actualAnswer = WhatGenre.whatGenre(Fiction);
        }

        @When("I ask whether it's Horror")
        public void i_ask_whether_it_s_horror() {
            actualAnswer = WhatGenre.whatGenre(Fiction);
        }

        @Then("I should be told {string}")
        public void i_should_be_told(String expectedAnswer) {
            assertEquals(expectedAnswer, actualAnswer);
        }
    }




