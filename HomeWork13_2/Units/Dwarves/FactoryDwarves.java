package HomeWork13_2.Units.Dwarves;
import HomeWork13_2.Units.ReadyUnits;
import HomeWork13_2.Weapon.Armor.FactoryArmor;
import HomeWork13_2.Weapon.Axe.FactoryAxe;

import java.util.Random;

public class FactoryDwarves implements ReadyUnits {

    @Override
    public ReadyUnits ready() {
        FactoryAxe factoryAxe = new FactoryAxe();
        FactoryArmor factoryArmor = new FactoryArmor();
        Random random = new Random();
        return new Dwarves("Dwarves_" + random.nextInt(10), random.nextInt(100), factoryAxe.ready(),factoryArmor.ready());
    }
}

