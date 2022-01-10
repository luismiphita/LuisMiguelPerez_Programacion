public class Entrada {

    //ambito de clase
    //String nombre = "Luismi";

    public static void main(String[] args) {

        //ambito de metodo
        //String nombre = "Luismi";

        Usuario usuario1 = new Usuario();
        // nombre = null, pass = null, correo = null, edad = 0, fecha = null

        Usuario usuario2 = new Usuario();
        // nombre = null, pass = null, correo = null, edad = 0, fecha = null

        Usuario usuario3 = new Usuario("luismi", "luismiphita@gmail.com", "pass");

        Usuario usuario4 = new Usuario("luismiphita@gmail.com", "pass", 19);

        // usuario1.password = "contraseña";
        // System.out.println(usuario1.password);


        usuario1.setPassword("contraseña");
        System.out.println(usuario1.getPassword());

        usuario1.setApellidos("Perez");
        System.out.println(usuario1.getApellidos());

        usuario1.setCorreoElectronico("luismiphita@gmail.com");
        System.out.println(usuario1.getCorreoElectronico());

        usuario1.setEdad(19);
        System.out.println(usuario1.getEdad());

        usuario1.setFecha("1 de marzo de 1743");
        System.out.println(usuario1.getFecha());

        usuario1.setNombre("Luismi");
        System.out.println(usuario1.getNombre());

    }


}
