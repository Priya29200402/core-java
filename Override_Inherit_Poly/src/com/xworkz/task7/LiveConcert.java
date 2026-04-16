package com.xworkz.task7;

import java.util.Arrays;

public class LiveConcert extends Concert {
    String[] artists;

    public LiveConcert(String name, String location, Type type, int duration, String[] artists) {
        super(name, location, type, duration);
        this.artists = artists;
    }

  @Override
    void getDetails() {
        System.out.println("Live Concert Details");
        super.getDetails();
    }
    @Override
    void getProgramDetails() {
        System.out.println("Live Concert Program Details");
        super.getProgramDetails();
    }

    @Override
    public String toString() {
        return "LiveConcert{" + "artists=" + Arrays.toString(artists) + ", name='" + name + '\'' + ", location='" + location + '\'' +
                ", type=" + type + ", duration=" + duration + ", programs=" + Arrays.toString(programs) + '}';
    }
}


