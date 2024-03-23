class Hero {
    private int health;
    private int damage;
    private String superpower;

    public Hero(int health, int damage, String superpower) {
        this.health = health;
        this.damage = damage;
        this.superpower = superpower;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperpower() {
        return superpower;
    }
}

class Boss {
    private int health;
    private int damage;
    private String defenseType;

    public String getDefenseType() {
        return defenseType;
    }

    public void setDefenseType(String defenseType) {
        this.defenseType = defenseType;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}

public class Main {
    public static void main(String[] args) {
        // Создание и настройка босса
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setDefenseType("Armor");

        // Вывод информации о боссе
        System.out.println("Boss Information:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defense Type: " + boss.getDefenseType());

        // Создание героев
        Hero[] heroes = createHeroes();

        // Вывод информации о героях
        System.out.println("\nHeroes Information:");
        for (Hero hero : heroes) {
            System.out.println("Health: " + hero.getHealth() + ", Damage: " + hero.getDamage() + ", Superpower: " + hero.getSuperpower());
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(100, 20, "Flight"); // Использование конструктора с заданием всех полей
        Hero hero2 = new Hero(120, 25); // Использование конструктора с заданием здоровья и урона
        Hero hero3 = new Hero(150, 30, "Invisibility"); // Использование конструктора с заданием всех полей

        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;
    }
}
