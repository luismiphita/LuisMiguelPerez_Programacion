public class Usuario {

    // variables
    public String correoElectronico, nombre, apellidos, password, fecha;
    public int edad;

    // constructores
    // si no hay contructores escritos, hay un constructor que es el vacio (por defecto)
    // este constructor deja de existir cuando se escribe algun constructor

    public Usuario(){

    }
    public Usuario(String nombre, String correoElectronico, String password){
        
        this.nombre = nombre;
        this.correoElectronico = correoElectronico;
        this.password = password;

    }

    // metodos

    // metodos especiales getters y setters

}
