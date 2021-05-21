package paquete;


import paquete.data.Joven;
import paquete.data.Niño;
import paquete.data.Persona;

public class Taller {

    public static void main(String[] args) {

        Persona p = new Persona("nombre","DNI","sexo",20,40,1.60);
        Niño n = new Niño();
        Joven j = new Joven();


        p.envejeciendo();
        j.envejeciendo();
        n.envejeciendo();

        //System.out.println(p.envejeciendo());

    }

}
