package com.xworkz.task4;

public class ActionMovie extends Movie{
    String hero;
    String villain;

    public ActionMovie(String name, Type type, double rating, int duration, Category category, String hero, String villain) {
        super(name, type, rating, duration, category);
        this.hero = hero;
        this.villain = villain;
    }

    @Override
    void info() {
        super.info();
    }

    @Override
    void watch() {
        super.watch();
    }
     public String toString() {
         return "ActionMovie{" + "hero='" + hero + '\'' + ", villain='" + villain + '\'' +  '}';
     }
}
