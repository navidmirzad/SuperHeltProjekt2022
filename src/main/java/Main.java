import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // vores objekter, som er superhelte
        Superhero superhelt1 = new Superhero("Spiderman", "Peter Parker", "spider abilities", "stærk", 2000);
        Superhero superhelt2 = new Superhero("Dr. Strange", "Stephen Strange", "magi", "meget stærk", 1980);
        Superhero superhelt3 = new Superhero("Captain America", "Steve Rogers", "superhuman", "meget stærk", 1945);
        Superhero superhelt4 = new Superhero("Batman", "Bruce Wayne", "flagermusmand", "stærk", 1990);
        Superhero superhelt5 = new Superhero("Deadpool", "Wade Wilson", "immortal", "meget stærk", 1999);

        Superhero[] superheroes = new Superhero[]{superhelt1, superhelt2, superhelt3, superhelt4, superhelt5};

        // test af scanner
        System.out.println("Velkommen til SuperHelt Databasen 2022!");
        /*Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        System.out.println(input);*/

        // Udskriver superhelt 1:
        for (Superhero superhero : superheroes) {
            System.out.println(superhero.getSuperheltnavn());
        }

    }
}