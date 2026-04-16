package com.xworkz.task5;

public class Info {
    String name;
    String director;
    String producer;

    public Info(String name, String director, String producer) {
        this.name = name;
        this.director = director;
        this.producer = producer;
    }

     public String toString() {
          return "Info{" + "name='" + name + '\'' + ", director='" + director + '\'' + ", producer='" + producer + '\'' + '}';
      }
}
