package com.xworkz.task4;

enum Type{
    ACTION, COMEDY, DRAMA, HORROR
}
public class Movie {
    String name;
    Type type;
    double rating;
    int duration;
    Category category;

    Movie(String name, Type type, double rating, int duration, Category category) {
        this.name = name;
        this.type = type;
        this.rating = rating;
        this.duration = duration;
        this.category = category;
    }

    void info(){

        System.out.println("Getting info about the movie");
    }
    void watch(){

        System.out.println("Watching the movie");
    }
     public String toString() {
         return "Movie{" + "name='" + name + '\'' + ", type=" + type + ", rating=" + rating + ", duration=" + duration + '}';
     }
}
