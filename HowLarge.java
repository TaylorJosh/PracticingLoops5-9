import java.util.Scanner;
import java.util.ArrayList;
public class HowLarge {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> movieList = new ArrayList<String>();
        System.out.println("Please enter all of your favorite movies. Press Enter x2 to complete the list.");

        for (int i = 0; i < movieList.size()+1; i++) {
            String movie = scanner.nextLine();
            if (movie.isBlank()) {
                System.out.println("You have: " + movieList.size() + " favorite movies." );
            } else {
                movieList.add(movie);
            }
        }
    }
}
