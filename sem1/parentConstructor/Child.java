public class Child extends Parent {
    
    public Child(int num, String name) {
        super(num, name);
        System.out.printf("Child Constructor num %d y nombre %s%n", num, name);
    }

    @Override
    public String toString() {
        return "Child : " + super.getName();
    }

    

    

    
}
