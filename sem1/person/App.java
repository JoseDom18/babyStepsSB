public class App {
    public static void main(String[] args) {
        Person alecin = new Person("Alecin Gabriel", 35);
        Person david = new Person("Denis David", 33);
        Person jose = new Person("Jose Domingo", 31);
        
        

        jose.Speak();
        david.Speak();
        alecin.Speak();

        System.out.println(jose.count());

    }
}
