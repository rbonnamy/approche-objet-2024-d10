package maps;

public class Pays {

    private String nom;
    private int population;
    private String continent;

    public Pays(String nom, int population, String continent) {
        this.nom = nom;
        this.population = population;
        this.continent = continent;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }

    public String getContinent() {
        return continent;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }
}
