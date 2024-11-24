class Superhero {
    private String name;
    private String ability;
    private int powerLevel;

    public Superhero(String name, String ability, int powerLevel) {
        this.name = name;
        this.ability = ability;
        this.powerLevel = powerLevel;
    }
    public void displayHero() {
        System.out.println("Name: " + name + ", Ability: " + ability + ", Power Level: " + powerLevel);
    }
}

