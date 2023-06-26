package movies;

import java.util.Arrays;
import java.util.Scanner;


public class MoviesApplication {


    public static void main(String[] args) {
        MoviesArray movies = new MoviesArray();
        Scanner scanner = new Scanner(System.in);
        System.out.println("What Would you like to do?\n");

        System.out.println("0 - exit\n1 - view all movies\n2 - view movies in the animated category\n3 - view movies in the drama category\n4 - view movies in horror category\n5 - view movies in the scifi category\n");

        System.out.println("Enter your choice: ");
        int userInput = scanner.nextInt();

        System.out.println(userInput);


        if (userInput == 0) {
            System.out.println("Exiting the program...");
            System.exit(0);
        } else if (userInput == 1) {
            Movie[] allMovies = movies.findAll();
            for (Movie movie : allMovies) {
                System.out.println(movie.getName() + " - " + movie.getCategory());
            }
        } else if (userInput == 2) {
            Movie[] animatedMovies = movies.findAll();
            for (Movie movie : animatedMovies) {
                if (movie.getCategory().equalsIgnoreCase("animated")) {
                    System.out.println(movie.getName() + " - " + movie.getCategory());
                }
            }
        } else if (userInput == 3) {
            Movie[] dramaMovies = movies.findAll();
            for (Movie movie : dramaMovies) {
                if (movie.getCategory().equalsIgnoreCase("drama")) {
                    System.out.println(movie.getName() + " - " + movie.getCategory());
                }
            }
        } else if (userInput == 4) {
            Movie[] horrorMovies = movies.findAll();
            for (Movie movie : horrorMovies) {
                if (movie.getCategory().equalsIgnoreCase("horror")) {
                    System.out.println(movie.getName() + " - " + movie.getCategory());
                }
            }
        } else if (userInput == 5) {
            Movie[] scifiMovies = movies.findAll();
            for (Movie movie : scifiMovies) {
                if (movie.getCategory().equalsIgnoreCase("scifi")) {
                    System.out.println(movie.getName() + " - " + movie.getCategory());
                }
            }
        }


    }
}
