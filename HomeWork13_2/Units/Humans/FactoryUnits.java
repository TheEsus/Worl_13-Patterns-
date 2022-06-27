package HomeWork13_2.Units.Humans;

import HomeWork13_2.Units.ReadyUnits;
import HomeWork13_2.Weapon.Armor.FactoryArmor;
import HomeWork13_2.Weapon.Sword.FactorySword;

import java.util.Random;

public class FactoryUnits implements ReadyUnits {
    @Override
    public ReadyUnits ready() {
        FactorySword factorySword = new FactorySword();
        FactoryArmor factoryArmor = new FactoryArmor();
        System.out.println("Создал человека");
        Random random = new Random();
        return new Human("Human_" + random.nextInt(10), random.nextInt(100), factorySword.ready(),factoryArmor.ready());
    }

}
