import java.util.Scanner;

public class ConvertidorRomAEntero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al convertidor de números romanos a enteros.");
        System.out.println();
        System.out.print("Ingresa un numero romano (I,V,X,L,C,D,M): ");
        String s = scanner.nextLine();
        //scanner.nextLine();

        System.out.printf("Tu numero en enteros es: %d%n",Solution.romanToInt(s));


        scanner.close();
    }

}
