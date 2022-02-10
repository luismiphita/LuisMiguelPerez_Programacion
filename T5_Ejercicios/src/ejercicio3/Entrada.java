import java.util.Scanner;
public class Entrada {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pizzeria pizzeria = new Pizzeria();
        int opcion = 0;
        String nombrePedidio;
        int numeroIngredientes;
        do {
            System.out.println("[PIZZERÍA]");
            System.out.println("1. Realizar pedido.");
            System.out.println("2. Servir pedido.");
            System.out.println("3. Ver pedidos pedientes.");
            System.out.println("4. Ver caja.");
            System.out.println("5. SALIR.");
            System.out.println("Introduce opción: ");
            opcion = in.nextInt();
            switch (opcion){
                case 1:
                    System.out.println("Nombre del pedido:");
                    nombrePedidio = in.nextLine();
                    System.out.println("Número de ingredientes:");
                    numeroIngredientes = in.nextInt();
                    Pizza pizza = new Pizza(1, nombrePedidio);
                    for (int i = 0; i < numeroIngredientes; i++) {
                        String nombre;
                        double costeIngrediente;
                        System.out.println("Ingrediente:");
                        nombre = in.nextLine();
                        System.out.println("Precio del ingrediente:");
                        costeIngrediente = in.nextDouble();
                        Ingrediente ingrediente = new Ingrediente(nombre,costeIngrediente);
                        pizza.agregarIngrediente(ingrediente);
                    }
                    pizzeria.agregarPedido(pizza);

                    break;

                case 2:
                    int idServir = 0;
                    System.out.println("¿Qué pedido quieres servir?");
                    idServir = in.nextInt();

                case 3:
                    pizzeria.mostrarPedidosPendientes();
                    break;

                case 4:
                    pizzeria.mostrarCaja();
                    System.out.print("€.");
            }

        }while (opcion!=5);
    }
}








import java.util.ArrayList;

public class Pizza {
    private String nombre;
    private double precio;
    private ArrayList<Ingrediente> ingredientes;
    private int id;
    private boolean estado;

    public Pizza(int i, String nombrePedidio){};

    public Pizza(String nombre, double precio, ArrayList<Ingrediente> ingredientes, int id, boolean estado){
        this.nombre = nombre;
        this.precio = precio;
        this.ingredientes = new ArrayList();
        this.id = id;
        this.estado = estado;
    }

    public void agregarIngrediente(Ingrediente ingrediente){
        this.ingredientes.add(ingrediente);
        this.precio += ingrediente.getPrecio();
    }

    public void verDatos(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Precio: "+precio+"€.");

        if(estado = true){
            System.out.println("La pizza se ha servido.");
        }else{
            System.out.println("La pizza aún no se ha servido.");
        }

        System.out.println("Nº Ingredientes: "+ingredientes.size());
        for(Ingrediente ingrediente: ingredientes){
            System.out.println(ingrediente.getNombre());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public ArrayList<Ingrediente> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
        this.ingredientes = ingredientes;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}



