import java.util.ArrayList;
import java.util.Scanner;

public class ejercicio6B {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int menu = 0;
        int opcion = 0;
        String datos = " ";
        ArrayList<Object[]> listaCoches = new ArrayList();


        String marca;
        String modelo;
        int coste;
        String matricula;


        while (menu != 7) {
            System.out.println("1. Añadir coches");
            System.out.println("2. Lista de coches");
            System.out.println("3. Buscar coche");
            System.out.println("4. Mostrar coches");
            System.out.println("5. Eliminar coche");
            System.out.println("5. Vaciar garaje ");
            opcion = in.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Dime los datos");

                    System.out.println("Dime la marca");
                    marca = in.next();

                    System.out.println("Dime la modelo");
                    modelo = in.next();

                    System.out.println("Dime la coste");
                    coste = in.nextInt();

                    System.out.println("Dime la matricula");
                    matricula = in.next();

                    System.out.println("Datos guardados correctamente");

                    if (datos == null) {
                        System.out.println("La informacion es incorrecta");
                    }
                    break;
                case 2:
                    System.out.println("La lista de coches: ");
                    for (int i = 0; i < listaCoches.size(); i++) {
                        System.out.println("Marca: " + listaCoches.get(i)[0] + " - Modelo: " + listaCoches.get(i)[1] + " - CV: " +
                                listaCoches.get(i)[2] + " " + listaCoches.get(i)[3] + " " + listaCoches.get(i)[4]);

                    }
                    break;
            }

        }

    }
}