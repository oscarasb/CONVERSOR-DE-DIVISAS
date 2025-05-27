import java.util.Scanner;

public class MenuConversor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InterfaceConversor conversor = new claseHija_ConversorAPI();

        while (true) {
            System.out.println("\n--- BIENVENIDO AL CONVERSOR DE DIVISAS ---" +
            "\nSELECCIONES UNA OPCION Y SIGA LAS INSTRUCCIONES " +
                    "\n1. USD ----> MXN (Peso Mexicano) " +
                    "\n2. USD ----> BRL (Real Brasileño)" +
                    "\n3. USD ----> EUR (Euro)" +
                    "\n4. EUR ----> USD (Dólar)" +
                    "\n5. USD ----> GBP (Libra Esterlina)");

            System.out.println("6. Salir" +
                    "\nSeleccione una opción: ");

            int opcionesMENU = scanner.nextInt();
            if (opcionesMENU == 6) break;

            String de = " ", para = " ";
            switch (opcionesMENU) {
                case 1 -> { de = "\uD83C\uDDFA\uD83C\uDDF8\n USD"; para = "MXN \uD83C\uDDF2\uD83C\uDDFD\n"; }
                case 2 -> { de = "\uD83C\uDDFA\uD83C\uDDF8\n USD"; para = "BRL \uD83C\uDDE7\uD83C\uDDF7\n"; }
                case 3 -> { de = "\uD83C\uDDFA\uD83C\uDDF8\n USD"; para = "EUR \uD83C\uDDEA\uD83C\uDDFA\n"; }
                case 4 -> { de = "\uD83C\uDDEA\uD83C\uDDFA\n EUR"; para = "USD \uD83C\uDDFA\uD83C\uDDF8\n"; }
                case 5 -> { de = "\uD83C\uDDFA\uD83C\uDDF8\n USD"; para = "GBP \uD83C\uDDEC\uD83C\uDDE7\n"; }
                default -> {
                    System.out.println("OPCION NO VALIDA, POR FAVOR DIGITE UN DE LAS OPCIONES ANTERIORES ");
                    continue;
                }
            }

            System.out.print("ESCRIBA LA CANTIDAD DE DIVISAS QUE DESEA SER CONVERTIDA: ");
            double cantidadIngrasadaPorUsuario = scanner.nextDouble();

            double resultado = conversor.convertir(de, para, cantidadIngrasadaPorUsuario);
            System.out.println("\n ✅CONVERSION REALIZADA\uD83D\uDCB1\n");
            System.out.println("LA RESPUESTA A SU PETICION ES: " + cantidadIngrasadaPorUsuario + " " + de + " = " + resultado + " " + para);
        }

        scanner.close();
        System.out.println("PROGRAMA FINALIZADO, \nGRACIAS POR OCUPAR NUESTROS SERVICIOS, VULVA PRONTO.");
    }
}
