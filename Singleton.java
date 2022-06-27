public class Singleton {
    //Данный метод проектирования позволяет создать объект
    // и сколько раз бы его не пересоздавали - он будет один и тот же
    private static Singleton instance;
    public String name;
    // в данном случае он потокобезопасный, т к метод синхронизирован
    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

    private Singleton(){this.name = "Ivan";}

    public static void main(String[] args){
        //Чтобы убедится, что объект один и тот же можно выполнить код ниже
        Singleton singleton = Singleton.getInstance();
        Singleton singleton1 = Singleton.getInstance();
        System.out.println(singleton == singleton1);
    }
}
