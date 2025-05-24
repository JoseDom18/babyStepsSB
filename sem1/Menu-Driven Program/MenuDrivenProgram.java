import java.util.ArrayList;
import java.util.Scanner;

public class MenuDrivenProgram {
    private static ArrayList<String> compra = new ArrayList<>();

    public static void iniciarCompra() {
        Scanner scanner = new Scanner(System.in);
        String cent = "pagar";
        String art = "";
        System.out.println("Bienvenido al sistema de compra en linea.");

        do {
            System.out.print("Que articulo desea agregar (si desea terminar escriba pagar) : ");
            art = scanner.nextLine();

            compra.add(art);

        } while (!(art.equals(cent)));

        System.out.println("Tu lista de compras es : ");

        for (String articulo : compra) {

            if (!articulo.equals("pagar")) {
                System.out.printf("%s, ", articulo);
            }
        }

        scanner.close();
    }
}
