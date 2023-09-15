import java.util.ArrayList;

public class Database {
    private ArrayList<Superhero> superheros = new ArrayList<Superhero>();

    public void addSuperhero(String name, String realName, String superPower, int yearCreated, String race, int strength) {
        superheros.add(new Superhero(name, realName, superPower, yearCreated, race, strength));
    }
    public ArrayList<Superhero> getSuperhero() {
        return superheros;
    }

    public Superhero searchSuperhero(String name) {
        for (Superhero p : superheros) {
            if (p.getName().equals(name)) {
                return p;
            }
        }
        return null;
    }

}

