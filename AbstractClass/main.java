package AbstractClass;

public class main {
    public static void main(String[] args)
    {
        Animal l = new Lion();
        feed(l);
    }

    public static void feed(Animal a) {
        a.eat();
    }
}
