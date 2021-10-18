package com.softwareinstitute.training.kptsang;
import java.util.ArrayList;
public class Main{

    public static void main(String[] args){
        ArrayList<Fiction> FictionLibrary =new ArrayList<>();
        //ArrayList<NonFiction> NonFictionLibrary = new ArrayList<>();

        com.softwareinstitute.training.kptsang.Fiction fiction = new com.softwareinstitute.training.kptsang.Fiction("Nineteen Eighty Four", "George Orwell", 328, "Dystopian");
        System.out.println("Title: "+ fiction.getName() +", written by " + fiction.getAuthor()+", "+fiction.getPages()+" pages, and this book is "+ fiction.getGenre());

        //com.softwareinstitute.training.kptsang.Fiction fiction1 = new com.softwareinstitute.training.kptsang.Fiction("Call of Cthulu", "HP Lovecraft", 420, "Cosmic Horror");
        //System.out.println("Title: "+ fiction1.getName() +", written by " + fiction1.getAuthor()+", "+fiction1.getPages()+" pages, and this book is "+ fiction1.getGenre());

        com.softwareinstitute.training.kptsang.NonFiction nonfiction = new com.softwareinstitute.training.kptsang.NonFiction("LEGO Star Wars Visual Dictionary", "DK", 160, "Lego");
        System.out.println("Title: "+ nonfiction.getName() +", written by "+ nonfiction.getAuthor()+ ", " + nonfiction.getPages()+ " pages, this book is about " +nonfiction.getTopic());

       // com.softwareinstitute.training.kptsang.Movie movie = new com.softwareinstitute.training.kptsang.Movie("Kill Bill", 2, "Quentin Tarantino", 215, 2004);
       // System.out.println("Title: "+ movie.getName()+", released "+ movie.getReleaseYear()+", directed by "+movie.getDirector()+", "+ movie.getNoOfDiscs()+" disc(s), runs for "+movie.getRuntime()+ " minutes");

        //com.softwareinstitute.training.kptsang.Movie movie1 = new com.softwareinstitute.training.kptsang.Movie("The Lighthouse", 1, "Robert Eggers", 110, 2019);
        //System.out.println("Title: "+ movie1.getName()+", released "+ movie1.getReleaseYear()+", directed by "+movie1.getDirector()+", "+ movie1.getNoOfDiscs()+" disc(s), runs for "+movie1.getRuntime()+ " minutes");

        //com.softwareinstitute.training.kptsang.TVShow tvshow = new com.softwareinstitute.training.kptsang.TVShow("Seinfeld", 8,180, "Jerry Seinfeld");
        //System.out.println("Title: "+tvshow.getName()+", starring "+tvshow.getStarring()+", "+tvshow.getNoOfDiscs()+" disc boxset, "+tvshow.getNumberOfEpisodes1()+ " episodes");


        FictionLibrary.add(fiction);


    }

}
