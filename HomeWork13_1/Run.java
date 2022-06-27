package HomeWork13_1;

import HomeWork13_1.Items.Armors.Armors;
import HomeWork13_1.Items.Weapons.Weapons;
import HomeWork13_1.Unit.Unit;

public class Run {
    public static void main(String[] args){
        System.out.println("Создаем сильного героя");
        Unit unit1 = new Unit("Силач",strongWeapon(),strongArmors(),20,10 );
        System.out.println(unit1.name + " " + (unit1.attack+unit1.weapons.attack())+ " " + (unit1.def+unit1.armors.defence()));

        System.out.println("Создаем слабого героя");
        Unit unit2 = new Unit("Слабачек",weakWeapon() ,weakArmors(), 10, 5);
        System.out.println(unit2.name + " " + (unit2.attack+unit2.weapons.attack())+ " " + (unit2.def+unit2.armors.defence()));
    }

    public static Armors strongArmors(){
        return new Armors("PowerfulArmors", 70);
    }

    public static Armors weakArmors(){
        return new Armors("WeakArmors", 7);
    }

    public static Weapons strongWeapon(){
        return new Weapons("Powerful", 100);
    }

    public static Weapons weakWeapon(){
        return new Weapons("Weak", 10);
    }
}
