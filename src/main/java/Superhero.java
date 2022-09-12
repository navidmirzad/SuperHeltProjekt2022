public class Superhero {

    public Superhero[] superheroes;

    private String superheltnavn;
    private String rigtigenavn;
    private String superkræft;
    private String powerlevel;
    private double opdagelsesår;

    public Superhero(String superheltnavn, String rigtigenavn, String superkræft, String powerlevel, double opdagelsesår) {

        this.superheltnavn = superheltnavn;
        this.rigtigenavn = rigtigenavn;
        this.superkræft = superkræft;
        this.powerlevel = powerlevel;
        this.opdagelsesår = opdagelsesår;

    }

    public String getSuperheltnavn() {
        return  superheltnavn;
    }

    public String getRigtigenavn() {
        return rigtigenavn;
    }

    public String getSuperkræft() {
        return superkræft;
    }

    public String getPowerlevel() {
        return powerlevel;
    }

    public double getOpdagelsesår() {
        return opdagelsesår;
    }

}


