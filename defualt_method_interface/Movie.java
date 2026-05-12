package inner;

public interface Movie {
    String name="KGF";
    String director="Prashanth Neel";
    int releaseYear=2018;

    void play();
    void pause();
    default void displayInfo(){
        System.out.println("Movie Name:"+ name);
        System.out.println("Director:"+ director);
        System.out.println("Release Year:"+ releaseYear);
    }

     static void getMovieDetails(){
        System.out.println("Movie Name: Inception, Director: Christopher Nolan, Release Year: 2010");
    }
}
