import com.softwareinstitute.training.kptsang.*;
import org.junit.Test;

import com.softwareinstitute.training.kptsang.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {

    @Test
    public void testGenreMethod(){
        Fiction testFiction = new Fiction("Nineteen Eighty Four", "George Orwell", 328, "Dystopian");
        assertEquals("This genre is not correct", "Dystopian", testFiction.getGenre());
    }
    @Test
    public void testTopicMethod(){
        NonFiction testNonFiction = new NonFiction("LEGO Star Wars Visual Dictionary", "DK",160, "Lego");
        assertEquals("This topic isn't correct", "Lego", testNonFiction.getTopic());
    }
    @Test
    public void testDirectorMethod(){
        Movie testMovie = new Movie("Kill Bill", 2, "Quentin Tarantino",215, 2004);
        assertEquals("This isn't the right director", "Quentin Tarantino", testMovie.getDirector());
    }
    @Test
    public void testRuntimeMethod(){
        Movie testMovie = new Movie("Kill Bill", 2, "Quentin Tarantino",215,2004);
        assertEquals("This runtime is wrong", 215, testMovie.getRuntime());
    }
    @Test
    public void testNumberOfEpisodes1(){
        TVShow testTVShow = new TVShow("Seinfeld", 8, 180, "Jerry Seinfeld");
        assertEquals("This isn't the right episode count", 180, testTVShow.getNumberOfEpisodes1());
    }
    @Test
    public void testAuthor(){
        Fiction testFiction = new Fiction("Of Mice and Men", "John Steinbeck", 107, "period");
        assertEquals("This isn't the right author", "John Steinbeck", testFiction.getAuthor());
    }
    @Test
    public void testName(){
        Fiction testFiction = new Fiction("Of Mice and Men", "John Steinbeck", 107, "tragedy");
        assertEquals("This isn't the right title", "Of Mice and Men", testFiction.getName());

    }
    @Test
    public void testPages(){
        Fiction testFiction = new Fiction("Of Mice and Men", "John Steinbeck", 107, "tragedy");
        assertEquals("This isn't the correct page count", 107, testFiction.getPages());
    }
    @Test
    public void testNoOfDiscs(){
        Disc testDisc = new Disc("Blue Planet",4);
        assertEquals("This is the wrong number of discs", 4, testDisc.getNoOfDiscs());
    }

    @Test
    public void testReleaseDate(){
        Movie testMovie = new Movie("Hereditary", 1, "Ari Aster", 127, 2018);
        assertEquals("This isn't the release date", 2018, testMovie.getReleaseYear());
    }
    @Test
    public void testStarring(){
        TVShow testTVShow = new TVShow("Seinfeld", 8, 180, "Jerry Seinfeld");
        assertEquals("This person isn't in this series", "Jerry Seinfeld", testTVShow.getStarring());
    }

}

