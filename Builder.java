public class Builder {
    private String name;
    private StringBuilder id = new StringBuilder();
    private int age;
    //Возвращает готовый объект
    public Human build(){
        return new Human(name, id.toString());
    }
    //Этот метод позволит дать полю name значение объекту human
    public Builder setName(String name){
        this.name = name;
        return this;
    }
    //Этот метод позволяет создавать и дополнять ID объекту
    public Builder addIdPart(String part){
        this.id.append(part);
        return this;
    }

    public static void main(String[] args){
        // Так по частям мы можем построить нашего персонажа
        Human human = new Builder()
                .setName("Ivan")
                .addIdPart("PT")
                .addIdPart("888")
                .build();
    }

}

class Human{
    private final String name;
    private final String id;

    public Human(String name, String id){
        this.name = name;
        this.id = id;
    }
}
