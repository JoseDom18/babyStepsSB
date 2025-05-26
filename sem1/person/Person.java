public class Person {
    private final String name;
    private int age;
    private int place;
    private static int personcount = 1;
    
    public Person(){
        this("",0);
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.place = personcount++;
    }

    public void Speak() {
        System.out.printf("Hola mi nombre es %s y tengo %d años.%n", name, age);
    }

    public int count() {
        return this.place;
    }

}
