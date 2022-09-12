public class Superhero {

    private String superheltnavn;
    private String rigtigenavn;
    private String superkræft;
    private String powerlevel;
    private double opdagelsesår;

    public Superhero(String superheltnavn, String rigtigenavn, String superkræft, String powerlevel,
                     double opdagelsesår) {

        this.superheltnavn = superheltnavn;
        this.rigtigenavn = rigtigenavn;
        this.superkræft = superkræft;
        this.powerlevel = powerlevel;
        this.opdagelsesår = opdagelsesår;

    }

    // vores objekter, som er superhelte
    Superhero superhelt1 = new Superhero("Spiderman", "Peter Parker", "spider abilities", "stærk", 2000);
    Superhero superhelt2 = new Superhero("Dr. Strange", "Stephen Strange", "magi", "meget stærk", 1980);
    Superhero superhelt3 = new Superhero("Captain America", "Steve Rogers", "superhuman", "meget stærk", 1945);
    Superhero superhelt4 = new Superhero("Batman", "Bruce Wayne", "flagermusmand", "stærk", 1990);
    Superhero superhelt5 = new Superhero("Deadpool", "Wade Wilson", "immortal", "meget stærk", 1999);

}