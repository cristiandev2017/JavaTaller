package paquete.data;

public class  Niño extends Persona {

    private String escuela;
    public Integer Vida;

    public Niño(String nombre, String dni, String escuela) {
        super(nombre,dni);
        this.escuela = escuela;
    }

    public void envejeciendo(){

        System.out.println("Estas envejeciendo, pero soy un niño");
    }
}
