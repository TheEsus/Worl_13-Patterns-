//Пример паттерна фабрики, здесь храним общую структуру для юнита
public class Unit {
    public String type;
    public String name;
    public int damage;
    public int hp;

    public Unit(String type, String name, int damage, int hp){
        this.type = type;
        this.name = name;
        this.damage = damage;
        this.hp = hp;
    }
}
