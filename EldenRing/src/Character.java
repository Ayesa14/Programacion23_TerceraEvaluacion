public abstract class Character {
    protected String name;
    protected int strength;
    protected int agility;
    protected int intelligence;

    public abstract int attack();
    public abstract int defend();
    public abstract void saveToFile(String filename);
    public abstract void loadFromFile(String filename);
}
