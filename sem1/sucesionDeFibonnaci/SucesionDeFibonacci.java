public class SucesionDeFibonacci {
    public static void main(String[] args) {
       int a = 1;
       int b = 1;
       
       System.out.println(a);
       System.out.println(b);
       
       int num = 10;
       int cont = 0;

       while (cont < num) {
        int c = a + b;
        a = b + c;
        b = c + a;
        System.out.println(c);
        System.out.println(a);
        System.out.println(b);
        cont++;
       }

    }

}
