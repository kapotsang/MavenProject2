package MavenProject2;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;
import static org.junit.Assert.assertEquals;


    public class StepDefinitions {
        private String Genre;
        private String actualAnswerGenre;
        private String Author;
        private String actualAnswerAuthor;
        private String Topic;
        private String actualAnswerTopic;
        private int PageCount;
        private String actualPagecount;

        @Given("Genre is Horror")
        public void genre_is_Horror() {Genre = "Horror";}
        @Given("Genre is Dystopian")
        public void genre_is_Dystopian() {Genre = "Dystopian";}
        @When("I ask whether it's Dystopian")
        public void i_ask_if_Dystopian() {actualAnswerGenre = WhatGenre.whatGenre(Genre);}
        @When("I ask whether it's Horror")
        public void i_ask_if_horror() {actualAnswerGenre= WhatGenre.whatGenre(Genre);}
        @Then("I should be told {string}")
        public void i_should_be_told_genre(String expectedAnswerGenre) {assertEquals(expectedAnswerGenre, actualAnswerGenre);}

        @Given("Author is George Orwell")
        public void AuthorIsOrwell(){Author = "George Orwell";}
        @Given("Author is HP Lovecraft")
        public void AuthorIsLovecraft(){ Author = "HP Lovecraft"; }
        @When("I ask is Orwell the author")
        public void i_ask_if_Orwell(){ actualAnswerAuthor = WhatAuthor.whatAuthor(Author);}
        @When("I ask is Lovecraft the author")
        public void i_ask_if_Lovecraft(){ actualAnswerAuthor = WhatAuthor.whatAuthor(Author);}
        @Then("the answer is {string}")
        public void i_should_be_told_author(String expectedAnswerAuthor){ assertEquals(expectedAnswerAuthor, actualAnswerAuthor);}

        @Given("Topic is Lego")
        public void topic_is_Lego(){ Topic = "Lego";}
        @Given("Topic is nature")
        public void topic_is_nature(){ Topic = "nature";}
        @When("I ask is the topic Lego")
        public void i_ask_if_Lego(){ actualAnswerTopic = WhatTopic.whatTopic(Topic);}
        @When("I ask is the topic nature")
        public void i_ask_if_nature(){ actualAnswerTopic = WhatTopic.whatTopic(Topic);}
        @Then("the answer is yes")
        public void i_should_be_told_topic() {}
        @Then("the answer is no")
        public void i_should_be_told_no_topic(){}

  /*      @Given("Page count is 200")
        public void page_count(){ PageCount = 200 ;}
        @When("I ask if the page count is 200")
        public void i_ask_if_pageCount(){actualPagecount = WhatPageCount.whatPageCount(PageCount);}
        @Then("the answer is yes")
        public void pageCountIs(){}

*/


    }





