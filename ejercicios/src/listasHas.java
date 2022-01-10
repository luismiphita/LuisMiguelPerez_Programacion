import java.util.Hashtable;

public class listasHas {

    public static void main(String[] args) {

        Hashtable listaElementos = new Hashtable();

        //para sacar tamaño de la lista
        listaElementos.size();
        //guardar cosas
        listaElementos.put("1","Elemento 1");
        listaElementos.put("2","Elemento 2");
        listaElementos.put("3", false);
        listaElementos.put("4", new String[]{"Cosa 1","Cosa 2", "Cosa 3"});

        //Obtener elementos del hashtable

        listaElementos.get("4");
        String[] elementoEncontrado = (String[]) listaElementos.get("4");
        elementoEncontrado[0] = "Nuevo valor";
        for (String item: elementoEncontrado) {
            System.out.println(item);

        }

    }

}
