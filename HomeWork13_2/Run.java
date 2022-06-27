package HomeWork13_2;

import HomeWork13_2.Units.Dwarves.Dwarves;
import HomeWork13_2.Units.Dwarves.FactoryDwarves;
import HomeWork13_2.Units.Giants.FactoryGiants;
import HomeWork13_2.Units.Giants.Giants;
import HomeWork13_2.Units.Humans.FactoryUnits;
import HomeWork13_2.Units.Humans.Human;

public class Run {
    public static void main(String[] args) {
        FactoryUnits unit1 = new FactoryUnits();
        Human h1 = (Human) unit1.ready();
        System.out.println(h1.HP + " " + h1.name + " " + h1.weapon + " " + h1.armor);

        FactoryDwarves unit2 = new FactoryDwarves();
        Dwarves d1 = (Dwarves) unit2.ready();
        System.out.println(d1.HP + " " + d1.name + " " + d1.weapon + " " + d1.def);

        FactoryGiants unit3 = new FactoryGiants();
        Giants g1 = (Giants) unit3.ready();
        System.out.println(g1.HP + " " + g1.name + " " + g1.weapon);
    }
}
