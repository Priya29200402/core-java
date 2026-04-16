package com.xworkz.task7;

public class ConcertRunner {
    public static void main(String[] args) {
        Concert concert = new Concert("Rock Fest", "Stadium", Type.ROCK, 4);
        concert.displayDetails();
        System.out.println(concert);

        String[] artists = {"Raghu Dixit", "Arjun Janya", "Vijay Prakash"};
        LiveConcert liveConcert = new LiveConcert("Jazz Night", "Club", Type.JAZZ, 3, artists);
        liveConcert.displayDetails();
        System.out.println(liveConcert);
    }
}
