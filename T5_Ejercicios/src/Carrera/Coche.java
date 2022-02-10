package Carrera;

public class Coche {

    //variables
    public int cv, velocidad;
    public String matricula, modelo;
    public double km_reco;



    // constructores

    public Coche(int cv, int velocidad, String matricula, String modelo, double km_reco){
        this.cv = 0;
        this.velocidad = 0;
        this.matricula = "0000AAA";
        this.modelo = "sin especificar";
        this.km_reco = 0.0;
    }

    public Coche(String modelo, String matricula, int cv){
        this.modelo = modelo;
        this.matricula = matricula;
        this.cv = cv;
    }




    //metodos

    public void acelera(int velocidad_acelerada){
        velocidad = (velocidad_acelerada + velocidad);
        System.out.println("La velocidad es: " + velocidad);
        km_reco = velocidad * (cv * (Math.random() * 10 ) + 1);
    }





    // setter getter
}
