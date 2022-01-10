import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {

        final double prefrescofinal = 1.20;
        int nrefresco = 0;
        final double pcafefinal = 1.0;
        int ncafe = 0;
        final double pbocatafinal = 3.20;
        int nbocata = 0;
        final double pmenufinal = 9.50;
        int nmenu = 0;
        double cuenta = 0.0;
        int opcion = 0;
        Scanner in = new Scanner(System.in);
        double pcafe = 0.0;
        double prefresco = 0.0;
        double pbocata = 0.0;
        double pmenu = 0.0;
        int ncomensales = 0;


        do {
            System.out.println("Dime tu opcion");
            opcion = in.nextInt();

            if (opcion == 1){
                System.out.println("¿Cuantos cafes quieres?");
                ncafe = in.nextInt();
                if (ncafe>0){
                    pcafe = (ncafe * pcafefinal);
                    System.out.println(pcafe);
                }else{
                    System.out.println("No se pueden introducir numeros negativos");
                }


            }else if (opcion == 2){
                System.out.println("¿Cuantos refrescos quieres?");
                nrefresco = in.nextInt();
                if (nrefresco>0){
                    prefresco = (nrefresco * prefrescofinal);
                    System.out.println(prefresco);
                }else{
                    System.out.println("No se pueden introducir numeros negativos");
                }


            }else if (opcion == 3){
                System.out.println("¿Cuantos bocadillos quieres?");
                nbocata = in.nextInt();
                if (nbocata>0){
                    pbocata = (nbocata * pbocatafinal);
                    System.out.println(pbocata);
                }else{
                    System.out.println("No se pueden introducir numeros negativos");
                }


            }else if (opcion == 4){
                System.out.println("¿Cuantos menus quieres?");
                nmenu = in.nextInt();
                if (nmenu>0){
                    pmenu = (nmenu * pmenufinal);
                    System.out.println(pmenu);
                }else{
                    System.out.println("No se pueden introducir numeros negativos");
                }


            }else if (opcion == 5){
                System.out.println("¿Cuantos comensales son?");
                ncomensales = in.nextInt();
                cuenta = (pcafe + prefresco + pbocata + pmenu);
                System.out.println("Bocadillos " + nbocata);
                System.out.println("Refrescos " + nrefresco);
                System.out.println("Menus " + nmenu);
                System.out.println("Cafes " + ncafe);
                System.out.printf("Precio total %.2f " , cuenta , "%n");
                System.out.printf("%nPrecio por persona %.2f " , (cuenta / ncomensales));

            }

        }while(opcion != 5);

    }

}

