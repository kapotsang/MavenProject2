import com.softwareinstitute.training.kptsang.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class LibraryTest {

    @Test
    public void testGetGenreMethod() {
        Fiction testFiction = new Fiction("Nineteen Eighty Four", "George Orwell", 328, "Dystopian");
        assertEquals("This genre is not correct", "Dystopian", testFiction.getGenre());
    }

    @Test
    public void testSetGenreMethod() {
        String genre = "Dystopian";
        Fiction testFiction = new Fiction("Nineteen Eighty Four", "George Orwell", 328, "Dystopian");
        testFiction.setGenre("Dystopian");
        assertEquals(testFiction.getGenre(), genre);
    }

    @Test
    public void testGetTopicMethod() {
        NonFiction testNonFiction = new NonFiction("LEGO Star Wars Visual Dictionary", "DK", 160, "Lego");
        assertEquals("This topic isn't correct", "Lego", testNonFiction.getTopic());
    }

    @Test
    public void testSetTopicMethod() {
        String topic = "Lego";
        NonFiction testNonFiction = new NonFiction("LEGO Star Wars Visual Dictionary", "DK", 160, "Lego");
        testNonFiction.setTopic("Lego");
        assertEquals(testNonFiction.getTopic(), topic);
    }

    @Test
    public void testGetDirectorMethod() {
        Movie testMovie = new Movie("Kill Bill", 2, "Quentin Tarantino", 215, 2004);
        assertEquals("This isn't the right director", "Quentin Tarantino", testMovie.getDirector());
    }

    @Test
    public void testSetDirectorMethod() {
        String director = "Quentin Tarantino";
        Movie testMovie = new Movie("Kill Bill", 2, "Quentin Tarantino", 215, 2004);
        testMovie.setDirector("Quentin Tarantino");
        assertEquals(testMovie.getDirector(), director);

    }

    @Test
    public void testGetRuntimeMethod() {
        Movie testMovie = new Movie("Kill Bill", 2, "Quentin Tarantino", 215, 2004);
        assertEquals("This runtime is wrong", 215, testMovie.getRuntime());
    }

    @Test
    public void testSetRuntimeMethod() {
        int runtime = 215;
        Movie testMovie = new Movie("Kill Bill", 2, "Quentin Tarantino", 215, 2004);
        testMovie.setRuntime(215);
        assertEquals(testMovie.getRuntime(), runtime);
    }
    @Test
    public void testGetNumberOfEpisodes1() {
        TVShow testTVShow = new TVShow("Seinfeld", 8, 180, "Jerry Seinfeld");
        assertEquals("This isn't the right episode count", 180, testTVShow.getNumberOfEpisodes1());
    }
    @Test
    public void testSetNumberOfEpisodes1(){
        int episodeNo = 180;
        TVShow testTVShow = new TVShow("Seinfeld", 8, 180, "Jerry Seinfeld");
        testTVShow.setNumberOfEpisodes1(180);
        assertEquals(testTVShow.getNumberOfEpisodes1(), episodeNo);
    }
    @Test
    public void testGetAuthor() {
        Fiction testFiction = new Fiction("Of Mice and Men", "John Steinbeck", 107, "period");
        assertEquals("This isn't the right author", "John Steinbeck", testFiction.getAuthor());
    }
    @Test
    public void testSetAuthor(){
        String author = "John Steinbeck";
        Fiction testFiction = new Fiction("Of Mice and Men", "John Steinbeck", 107, "period");
        testFiction.setAuthor("John Steinbeck");
        assertEquals(testFiction.getAuthor(), author);
    }
    @Test
    public void testGetName() {
        Fiction testFiction = new Fiction("Of Mice and Men", "John Steinbeck", 107, "tragedy");
        assertEquals("This isn't the right title", "Of Mice and Men", testFiction.getName());
    }
    @Test
    public void testSetName(){
        String name = "Of Mice and Men";
        Fiction newFiction = new Fiction("Of Mice and Men", "John Steinbeck", 107, "tragedy");
        newFiction.setName("Of Mice and Men");
        assertEquals(newFiction.getName(), name);
    }

    @Test
    public void testGetPages() {
        Fiction testFiction = new Fiction("Of Mice and Men", "John Steinbeck", 107, "tragedy");
        assertEquals("This isn't the correct page count", 107, testFiction.getPages());
    }

    @Test
    public void testSetPages(){
        int pages = 107;
        Fiction newFiction = new Fiction("Of Mice and Men", "John Steinbeck", 107, "tragedy");
        newFiction.setPages(107);
        assertEquals(newFiction.getPages(), pages);

    }

    @Test
    public void testGetNoOfDiscs() {
        Disc testDisc = new Disc("Blue Planet", 4);
        assertEquals("This is the wrong number of discs", 4, testDisc.getNoOfDiscs());
    }
    @Test
    public void testSetNoOfDiscs(){
        int NoOfDiscs = 4;
        Disc testDisc = new Disc("Blue Planet", 4);
        testDisc.setNoOfDiscs(4);
    assertEquals(testDisc.getNoOfDiscs(), NoOfDiscs);
    }

    @Test
    public void testGetReleaseDate() {
        Movie testMovie = new Movie("Hereditary", 1, "Ari Aster", 127, 2018);
        assertEquals("This isn't the release date", 2018, testMovie.getReleaseYear());
    }

    @Test
    public void testSetReleaseDate(){
        int releaseYear = 2018;
        Movie testMovie = new Movie("Hereditary", 1, "Ari Aster", 127, 2018);
        testMovie.setReleaseYear(2018);
        assertEquals(testMovie.getReleaseYear(), releaseYear);
    }
    @Test
    public void testGetStarring() {
        TVShow testTVShow = new TVShow("Seinfeld", 8, 180, "Jerry Seinfeld");
        assertEquals("This person isn't in this series", "Jerry Seinfeld", testTVShow.getStarring());
    }
    @Test
    public void testSetStarring() {
        String starring = "Jerry Seinfeld";
        TVShow tvshow = new TVShow("Seinfeld", 8, 180, "Jerry Seinfeld");
        tvshow.setStarring("Jerry Seinfeld");
        assertEquals(tvshow.getStarring(), starring);
    }
    @Test
    public void testBorrow() {
        Availability testAvailability = new Availability() {
            @Override
            public void borrow() {

            }
        };

    }
}



