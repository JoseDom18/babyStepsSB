import java.util.Scanner;

public class FizzBuzz {
    public static void iniciarFizzBuzz() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingresa la cantidad de numeros de la secuencia : ");
        int cant = scanner.nextInt();
        String f = "Fizz";
        String b = "Buzz";
        String fb = "FizzBuzz";


        for (int i = 1; i <= cant; i++) {
            if (i%3 == 0 && !(i%5 == 0)) {
                System.out.printf("%s",f);
            } else if (i%5 == 0 && !(i%3 == 0)) {
                System.out.printf("%s",b);
            } else if (i%15 == 0) {
                System.out.printf("%s",fb);
            } else {
                System.out.printf("%d", i);
            }

            if (i < cant) {
                System.out.print(", ");
            }
        }
        System.out.print(".");
        scanner.close();
    }

}
