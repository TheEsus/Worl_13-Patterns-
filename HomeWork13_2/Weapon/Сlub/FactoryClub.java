package HomeWork13_2.Weapon.Сlub;

import HomeWork13_2.Weapon.Weapon;
import java.util.Random;

public class FactoryClub implements Weapon {
    @Override
    public Weapon ready() {
        System.out.println("Создал дубина");
        Random random = new Random();
        return new Club("Sword" + random.nextInt(10), random.nextInt(10));
    }
}
