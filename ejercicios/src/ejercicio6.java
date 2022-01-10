import java.util.ArrayList;
import java.util.List;

public class ejercicio6 {

    public static void main(String[] args) {
        Object[] coche1 = new Object[]{"Mercedes", "c220", 250};
        Object[] coche2 = new Object[]{"SEAT", "Ibiza", 85};
        Object[] coche3 = new Object[]{"Ford", "Focus", 150};

        ArrayList<Object[]> listaCoches = new ArrayList();
        listaCoches.add(coche1);
        listaCoches.add(coche2);
        listaCoches.add(coche3);
        listaCoches.add(new Object[]{"Nissan", "Almera", 110});

        //obtener coches

        Object[] cocheSeleccionado = listaCoches.get(3);
        System.out.println(cocheSeleccionado[1]);
        System.out.println(listaCoches.get(1)[1]);

        for (int i = 0; i < listaCoches.size(); i++) {
            System.out.println("Marca: " + listaCoches.get(i)[0] + " - Modelo: " + listaCoches.get(i)[1] + " - CV: " + listaCoches.get(i)[2]);
        }



    }

}
