// Parent class
class Movie {
    String title;
    String director;

    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }


    public void displayInfo() {
        System.out.println("Movie: " + title);
        System.out.println("Director: " + director);
    }
}


class RomComMovie extends Movie {

    String actorName;


    public RomComMovie(String title, String director, String actorName) {
        super(title, director);
        this.actorName=actorName;
    }


    public void displayInfo() {
        super.displayInfo();
        System.out.println("ActorName "+actorName);
        System.out.println("Genre: Romantic Comedy");
        System.out.println("Expect laughter and love!");
    }
}


class ThrillerMovie extends Movie {

    String actorName;

    public ThrillerMovie(String title, String director , String actorName) {
        super(title, director);
        this.actorName=actorName;

    }

    
    
    public void displayInfo() {
        super.displayInfo();
         System.out.println("ActorName "+actorName);
        System.out.println("Genre: Thriller");
        System.out.println("Get ready for suspense and excitement!");
    }
}

public class MovieDemo {
    public static void main(String[] args) {
        Movie m1 = new RomComMovie("thirasora","Bala","Viram");
        Movie m2 = new ThrillerMovie("Amaran", "Bala","Sivakarthikan");

        System.out.println("Movie Details:\n");
        m1.displayInfo();  
        System.out.println("----------------------");
        m2.displayInfo(); 
    }
}
