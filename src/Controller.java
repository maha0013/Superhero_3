import java.util.ArrayList;

public class Controller {
    private Database db;

    public Controller(Database db) {
        this.db = db;
    }

    public void addSuperhero(String name, String realName, String superPower, int yearCreated, String race, int strength) {
        db.addSuperhero(name, realName, superPower, yearCreated, race, strength);
    }

    public ArrayList<Superhero> getSuperhero() {
        return db.getSuperhero();
    }
}
