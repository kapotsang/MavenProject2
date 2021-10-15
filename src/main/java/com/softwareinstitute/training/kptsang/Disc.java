package com.softwareinstitute.training.kptsang;

public class Disc extends com.softwareinstitute.training.kptsang.LibraryItem {

    private int NoOfDiscs;

    public Disc( String name, int NoOfDiscs) {
        super(name);
        this.NoOfDiscs = NoOfDiscs;
    }
    public void setNoOfDiscs(int noOfDiscs){
        this.NoOfDiscs = NoOfDiscs;
    }
    public int getNoOfDiscs(){
        return NoOfDiscs;
    }

}