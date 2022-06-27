//А тут непосредственно сама фабрика, создающая людей
public class HumanFactory {
    public String name;

    public Unit create_junior(String name){
        return new Unit("Человек", name, 50, 50);
    }
    public Unit create_middle(String name){
        return new Unit("Человек", name, 60, 60);
    }
    public Unit create_senior(String name){
        return new Unit("Человек", name, 70, 70);
    }
}
