package HomeWork13_1.Items.Armors;

public class Armors implements Armor {
    public String name;
    public int def;

    public Armors(String name, int def){
        this.name = name;
        this.def = def;
    }

    @Override
    public int defence() {
        return def;
    }

}
