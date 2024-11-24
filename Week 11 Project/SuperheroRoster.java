public class SuperheroRoster {

    public static void main(String[] args) {
        String[] heroNames = {"Spider-Man", "Iron Man", "Black Widow", "Thor"};
        String[] abilities = {"Web-slinging", "Flying and high-tech armor", "Stealth and combat", "Thunder god powers"};
        int[] powerLevels = {85, 90, 80, 100};

        System.out.println("Hero Details:");
        for (int i = 0; i < heroNames.length; i++) {
            System.out.println("Name: " + heroNames[i] + ", Ability: " + abilities[i] + ", Power Level: " + powerLevels[i]);
        }

        System.out.println("\nSearching for Black Widow:");
        searchHero(heroNames, abilities, powerLevels, "Black Widow");

        double averagePower = calculateAveragePower(powerLevels);
        System.out.println("\nAverage Power Level: " + averagePower);

        System.out.println("\nSuperhero Objects:");
        Superhero[] superheroes = new Superhero[4];
        for (int i = 0; i < heroNames.length; i++) {
            superheroes[i] = new Superhero(heroNames[i], abilities[i], powerLevels[i]);
            superheroes[i].displayHero();
        }
    }
    public static void searchHero(String[] names, String[] abilities, int[] powerLevels, String target) {
        boolean found = false;
        for (int i = 0; i < names.length; i++) {
            if (names[i].equalsIgnoreCase(target)) {
                System.out.println("Hero Found!");
                System.out.println("Name: " + names[i] + ", Ability: " + abilities[i] + ", Power Level: " + powerLevels[i]);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Hero not found.");
        }
    }

    public static double calculateAveragePower(int[] powerLevels) {
        int sum = 0;
        for (int power : powerLevels) {
            sum += power;
        }
        return (double) sum / powerLevels.length;
    }
}
