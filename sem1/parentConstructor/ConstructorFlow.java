public class ConstructorFlow {
    public static void main(String[] args) {
        Parent parent = new Parent(2,"Padre");
        Child child = new Child(1,"hijo");

        System.out.println(parent.toString());

        System.out.println(child.toString());
    }
}
