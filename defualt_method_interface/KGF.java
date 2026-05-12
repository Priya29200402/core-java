package inner;

public class KGF implements Movie {
    public static void main(String[] args) {
        Movie movie = new KGF();
        movie.play();
        movie.pause();
        movie.displayInfo();
        Movie.getMovieDetails();
    }
    @Override
    public void play() {
        System.out.println("Playing KGF");
    }

    @Override
    public void pause() {
        System.out.println("Pausing KGF");
    }

     @Override
    public void displayInfo(){
        System.out.println("Movie Name:"+ name);
        System.out.println("Director:"+ director);
        System.out.println("Release Year:"+ releaseYear);
    }

}
