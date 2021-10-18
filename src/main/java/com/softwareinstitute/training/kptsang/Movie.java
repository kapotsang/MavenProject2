package com.softwareinstitute.training.kptsang;

public class Movie extends com.softwareinstitute.training.kptsang.Disc implements com.softwareinstitute.training.kptsang.Availability {

    private String director;
    private int runtime;
    private int releaseYear;


    public Movie( String name, int NoOfDiscs , String director, int runtime, int releaseYear) {
        super(name, NoOfDiscs);
        this.director = director;
        this.runtime = runtime;
        this.releaseYear = releaseYear;
    }

    public void setDirector(String director){
        this.director = director;
    }
    public String getDirector(){
        return director;
    }
    public void setRuntime(int runtime){
        this.runtime = runtime;
    }
    public int getRuntime(){
        return runtime;
    }
    public void setReleaseYear(int releaseYear){
        this.releaseYear=releaseYear;
    }
    public int getReleaseYear() {
        return releaseYear;
    }
    @Override
    public void borrow() {

    }
}
