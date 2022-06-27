//А тут непосредственно сама фабрика, создающая людей
public class OrcFactory {
    public String name;

    public Unit create_junior(String name){
        return new Unit("Орк", name, 80, 100);
    }
    public Unit create_middle(String name){
        return new Unit("Орк", name, 100, 120);
    }
    public Unit create_senior(String name){
        return new Unit("Орк", name, 120, 140);
    }
}
