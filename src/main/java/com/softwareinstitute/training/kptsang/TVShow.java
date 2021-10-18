package com.softwareinstitute.training.kptsang;

public class TVShow extends com.softwareinstitute.training.kptsang.Disc implements Availability{

    public int numberOfEpisodes;
    public String starring;

    public TVShow( String name, int NoOfDiscs, int numberOfEpisodes, String starring) {
        super(name, NoOfDiscs);
        this.numberOfEpisodes = numberOfEpisodes;
        this.starring = starring;
    }

    public void setNumberOfEpisodes1(int NumberOfEpisodes){
    //    this.numberOfEpisodes = numberOfEpisodes;
    }
    public int getNumberOfEpisodes1(){
        return numberOfEpisodes;
    }
    public void setStarring(String starring){
        this.starring = starring;
    }
    public String getStarring(){
        return starring;
    }
    @Override
    public void borrow() {

    }
}
