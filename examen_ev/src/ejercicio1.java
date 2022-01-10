import java.util.Scanner;

public class ejercicio1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int nArray = 0;
        int opcion = 0;
        int[] numeros = null;


        do {
            System.out.println("Dime tu opcion");
            opcion = in.nextInt();
            if (opcion == 1) {
                System.out.println("Dime la longitud del Arrays");
                nArray = in.nextInt();

                if (nArray > 0) {
                    System.out.println("Tu Arrays se ha guardado correctamente");
                    numeros = new int[nArray];
                } else {
                    System.out.println("El tamano del Arrays en 0 o negativo");

                }
            } else if (opcion == 2) {
                if (nArray == 0) {
                    System.out.println("El arrays no tiene una longitud definida");
                }

                for (int j = 0; j < numeros.length; j++) {
                    numeros[j] = (int) (Math.random() * 101);
                    System.out.println(numeros[j]);

                }
            } else if (opcion == 3) {

                if (nArray == 0) {
                    System.out.println("El arrays no tiene una longitud definida");
                }

                for (int i = 0; i < numeros.length; i++) {
                    int npar = numeros[i] % 2;
                    if (numeros[i] > 10 && (npar == 0)) {
                        System.out.println(numeros[i]);
                    }

                }


            } else if (opcion == 4) {
                if (nArray == 0) {
                    System.out.println("El arrays no tiene una longitud definida");
                }
            } else if (opcion == 5) {
                for (int j = 0; j < numeros.length; j++) {
                    System.out.println(numeros[j]);

                }
            }
        } while (opcion != 0);

    }
}
