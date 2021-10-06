public class main {
    public static void main(String[] args) {
        Person brian = new Person("Brian", 14);
        Person bruce = new Person(brian);

//        brian.setAge(15);
        System.out.println(brian.getAge());
        System.out.println(brian.getName());

        if (brian == bruce) {
            System.out.println("They refer to the same address!");
        }
    }
}
