public class Mage extends Character {
    @Override
    public int attack() {
        return intelligence; // Suponemos que el ataque de un mago está basado en su inteligencia
    }

    @Override
    public int defend() {
        return agility;
    }

    @Override
    public void saveToFile(String filename) {

    }

    @Override
    public void loadFromFile(String filename) {

    }
    // Similar a Warrior, pero con implementaciones diferentes para attack(), defend(), saveToFile(), loadFromFile()
}
