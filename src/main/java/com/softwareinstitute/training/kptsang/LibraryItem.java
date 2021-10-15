package com.softwareinstitute.training.kptsang;

public class LibraryItem{

    //attributes
    private String name;
    private int releaseYear;

    //constructor
    public LibraryItem(String name){
        this.name = name;
    }

    public LibraryItem() {

    }

    //methods
    public void setName(String name) {
        this.name = name;
        System.out.println("This entry's name is "+name);
    }
    public String getName(){
        return name;
    }

}
