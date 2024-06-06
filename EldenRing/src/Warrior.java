public class Warrior extends Character {
    @Override
    public int attack() {
        return strength;
    }

    @Override
    public int defend() {
        return agility;
    }

    @Override
    public void saveToFile(String filename) {
        // Implementación específica para Warrior
    }

    @Override
    public void loadFromFile(String filename) {
        // Implementación específica para Warrior
    }
}
