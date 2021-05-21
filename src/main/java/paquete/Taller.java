package paquete;


import paquete.data.Joven;
import paquete.data.Niño;
import paquete.data.Persona;

import java.net.SocketOption;

public class Taller {



    public static void main(String[] args) {

        Persona p = new Persona("nombre","DNI","sexo",20,40,1.60);
        Niño n = new Niño("Hola","dsd","escuela");
        Joven j = new Joven();

        p.envejeciendo();
        j.envejeciendo("feliz");
        n.envejeciendo();

        //System.out.println(p.envejeciendo());

    }

}
