package HomeWork13_2.Weapon.Sword;

import HomeWork13_2.Weapon.Weapon;
import java.util.Random;

public class FactorySword implements Weapon {
    @Override
    public FactorySword ready() {
        System.out.println("Создал меч");
        Random random = new Random();
        return new Sword("Sword" + random.nextInt(10), random.nextInt(10));
    }
}
