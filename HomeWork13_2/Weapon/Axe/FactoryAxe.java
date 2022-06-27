package HomeWork13_2.Weapon.Axe;

import HomeWork13_2.Weapon.Weapon;
import java.util.Random;

public class FactoryAxe implements Weapon {
    @Override
    public Weapon ready() {
        System.out.println("Создал топор");
        Random random = new Random();
        return new Axe("Sword" + random.nextInt(10), random.nextInt(10));
    }
}
