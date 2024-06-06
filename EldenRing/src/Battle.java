public class Battle {
    private Character character1;
    private Character character2;

    public Battle(Character character1, Character character2) {
        this.character1 = character1;
        this.character2 = character2;
    }

    public Character fight() {
        int damage1 = character1.attack() - character2.defend();
        int damage2 = character2.attack() - character1.defend();

        return damage1 > damage2 ? character1 : character2;
    }
}
