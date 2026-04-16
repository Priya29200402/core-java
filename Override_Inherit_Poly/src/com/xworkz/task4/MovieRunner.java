package com.xworkz.task4;

public class MovieRunner {
    public static void main(String[] args) {
        Movie movie = new Movie("Sita Ramam", Type.DRAMA, 10, 148, new Category("Drama"));
        ActionMovie actionMovie = new ActionMovie("Dangal", Type.ACTION, 8.1, 120, new Category("Action"), "Amir Khan", "Zaira Wasim");
        System.out.println(movie);
        movie.info();
        movie.watch();
        System.out.println(actionMovie);
        actionMovie.info();
        actionMovie.watch();

    }
}
