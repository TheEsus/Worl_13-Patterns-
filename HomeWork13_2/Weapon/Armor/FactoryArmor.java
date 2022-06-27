package HomeWork13_2.Weapon.Armor;

import HomeWork13_2.Weapon.Weapon;

import java.util.Random;

public class FactoryArmor implements Weapon {
    @Override
    public Weapon ready() {
        System.out.println("Создал дубина");
        Random random = new Random();
        return new Armor("Sword" + random.nextInt(10), random.nextInt(10));
    }
}
