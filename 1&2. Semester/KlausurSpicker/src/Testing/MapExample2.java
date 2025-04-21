import java.util.*;

class Movie {
    String title;
    List<Integer> ratings = new ArrayList<>();

    public Movie(String title){
        this.title = title;
    }

    String getTitle(){
        return title;
    }

    void addRating(int rating){

        if(rating > 5 || rating < 1){
            throw new IllegalArgumentException("Bewertung muss zwischen 1 und 5 liegen");
        }
        else {
            ratings.add(rating);
        }
    }

    double getAverageRating(){
        double summe = 0;
        for (double nummer : ratings) {
            summe += nummer;
        }
        double average = summe / ratings.size();
        return Math.round(average * 100.0) / 100.0;
    }
}

interface MovieManager {

    void addMovie (String title);
    void rateMovie (String title, int rating);
    double getAverageRating(String title);
    List<String> getTopRatedMovies();
}

class MovieManagerImpl implements MovieManager{
    List<Movie> movies = new ArrayList<>();

    public void addMovie(String title) {

        Movie movie = new Movie(title);
        movies.add(movie);
    }

    public void rateMovie(String title,int rating){
        for (Movie movie : movies) {
            if(movie.getTitle().equals(title)){
                movie.addRating(rating);
                return;
            }
        }

        throw new NoSuchElementException("Film nicht gefunden");
    }

    public double getAverageRating(String title) {
        for (Movie movie : movies) {
            if(movie.getTitle().equals(title)) {
                return movie.getAverageRating();
            }
        }
        throw new NoSuchElementException("Keine Bewertungen vorhanden");
    }

    public List<String> getTopRatedMovies(){
        return movies.stream().sorted((movie1, movie2) -> Double.compare(movie2.getAverageRating(), movie1.getAverageRating())).map(Movie::getTitle).toList();
    }


}
