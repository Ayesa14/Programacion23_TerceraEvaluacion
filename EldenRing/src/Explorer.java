public class Explorer extends Character {
    @Override
    public int attack() {
        return agility; // Suponemos que el ataque de un explorador está basado en su agilidad
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
    // Similar a Warrior y Mage, pero con implementaciones diferentes para attack(), defend(), saveToFile(), loadFromFile()
}
