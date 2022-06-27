package HomeWork13_1.Items.Weapons;

public class Weapons implements Weapon {
    public String name;
    public int damage;

    public Weapons(String name, int damage){
        this.name = name;
        this.damage = damage;
    }
    @Override
    public int attack() {
        return damage;
    }


}
