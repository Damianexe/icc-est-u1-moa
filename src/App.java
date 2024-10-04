import java.util.Scanner;

public static void main(String[] args) throws Exception {

    Scanner scanner = new Scanner(System.in);

    int tamanio= ValidacionEntero(scanner, "Ingrese el tamaño del arreglo: ", false);
    int[] arreglo = new int[tamanio];
    System.out.println("Ingrese los elmentos del Arreglo: ");
    for(int i = 0; i<tamanio; i++){
        arreglo[i] = ValidacionEntero(scanner, "Ingrese el elemento "+(i+1);
    }

class App {
    public static int ValidacionEntero (Scanner scanner, String mensaje, boolean permiteNegativos) {
        int tamanio;
        do {
            System.out.println("Ingrese el tamanio que sea entero positivo");
            while (!scanner.hasNextInt()) {
                System.out.println("Error entrada inválida, ingrese un valor entero");
                scanner.next();
            }
            tamanio = scanner.nextInt();



            if (!permiteNegativos&& tamanio <0) {
                System.out.println("Error, ingrese un valor entero positivo, no se permite negativos");
            }

        } while (permiteNegativos&& tamanio < 0);

        return tamanio;

    }
}
}
