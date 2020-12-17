package com.company;

public class Main {

    public static void main(String[] args) {
	    String name = "Ronette";
	    String lastName = "Pulaski";

        System.out.printf("%s's surname is %s", name, lastName);
        System.out.println("Some change for a new commit in git");


        Alien alien1 = new Alien("Michael Burnham", "Human", "Doctari Alpa", "Discovery" );

        System.out.println(alien1);
    }
}
