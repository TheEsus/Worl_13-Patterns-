package HomeWork13_2.Units.Giants;

import HomeWork13_2.Units.ReadyUnits;
import HomeWork13_2.Weapon.Сlub.FactoryClub;

import java.util.Random;

public class FactoryGiants implements ReadyUnits {

    @Override
    public ReadyUnits ready() {
        FactoryClub factoryClub = new FactoryClub();
        Random random = new Random();
        return new Giants("Giants_" + random.nextInt(10), random.nextInt(100), factoryClub.ready());
    }
}
