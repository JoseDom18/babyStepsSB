public class Parent {
    private int num;
    private String name;


    public Parent (int num, 
    String name) {
        System.out.println("Parent constructor.");
        this.num = num;
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public String toString() {
        return "num : " + this.num + " nombre : " + this.name + ".";
    }
}
