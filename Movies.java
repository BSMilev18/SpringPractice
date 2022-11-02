import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Movies {
    int id;
    String name;
    double rating;

    public Movies(){
    }

    public Movies(int id, String name, double rating){
        super();
        this.id = id;
        this.name = name;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString(){
        return "Movie [id=" + id + ", name=" + name + ", rating=" + rating + "]";
    }

    public List<Movies> getAllMovies(){
        return Arrays.asList(new Movies(1, "Ice Age", 7.5),
                             new Movies(2, "Happy Feet", 6.4),
                              new Movies(3, "Shark Tales", 6.0));
    }

}
