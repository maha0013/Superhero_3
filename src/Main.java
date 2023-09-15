import java.util.Scanner;

public class Main {
    private Controller controller;
    Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {
        Main m = new Main();
        Database db = new Database();
        m.controller = new Controller(db);
        m.startProgram();
    }

    public void startProgram() {
        int userSelection = -1;

        while (userSelection != 9) {
            System.out.println("""
                    Vælg handling.
                    1. Skab superhelt
                    2. Vis superhelte
                    3. Find superhelt
                    9. Afslut
                    """);

            userSelection = keyboard.nextInt();
            keyboard.nextLine();
            handleUserSelection(userSelection);
        }
    }


    public void handleUserSelection(int userChoice) {
        if (userChoice == 1)
            addSuperhero();
        else if (userChoice == 2)
            showSuperheros();
    }

    public void addSuperhero() {
        System.out.println("Indtast superheltens navn");
        String name = keyboard.next();

        System.out.println("Indtast superheltens rigtige navn");
        String realName = keyboard.next();

        System.out.println("Indtast superkraft");
        String superPower = keyboard.next();

        System.out.println("Indtast skabelsesår");
        int yearCreated = keyboard.nextInt();

        System.out.println("indtast race");
        String race = keyboard.next();

        System.out.println("indtast styrke");
        int strength = keyboard.nextInt();

        controller.addSuperhero(name, realName, superPower, yearCreated, race, strength);
        System.out.println("Der er oprettet en ny superhelt.");
    }

    public void showSuperheros() {
        if (controller.getSuperhero().size() == 0){
            System.out.println("Der er ingen superhelte i databasen");
            System.out.println("superhelte i database");
            for (Superhero p : controller.getSuperhero()) {
                System.out.println(p);
            }
        }
    }
}



